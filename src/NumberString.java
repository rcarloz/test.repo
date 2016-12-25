import java.lang.Object;

/**
 * Class converts a number to a string.
 * Used a Git test. 
 * @author r-carloz
 *
 */
public class NumberString extends Object {
	public static void main(String[] args) {
		String str = convertNumber("2054");
		System.out.println(str);
	}
	/**
	 * Method converts a string of numeric characters to an alphabetic
	 * string using the map [0-9] -> [A-J]; letters ABCDEFGHUJ.
	 * @param strNumber
	 * @return buffer
	 */
	public static String convertNumber(String strNumber){
		// input string is null or empty.
		if(strNumber == null  || strNumber.isEmpty()){
			System.err.println("Input String is null or empty.");
			return "";
		}
		
		try{
			Integer.parseInt(strNumber);
		}
		catch(Exception e){
			// non numeric character encountered. We need to stop.
			System.err.println(e.toString());
			return "";
		}
		
		// we need a buffer to append the characters to
		StringBuilder buffer =  new StringBuilder();
		
		// the array of characters from input string
		char[]  charArray = strNumber.toCharArray();
		
		// implicitly mapping index 0-9 to A-J
		char[] map = "ABCDEFGHIJ".toCharArray();
		 
		for(char charElement : charArray){
			// append character to buffer
			buffer.append(map[Character.getNumericValue(charElement)]);
		}
		return buffer.toString();
	}
	
}
