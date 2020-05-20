/**
 * 
 */
package basicpackage;

/**
 * @author mohitshandilya
 * Practicing String Reversal
 * 3 methods are called in main method to print reverse value of input string
 * All 3 methods uses different ways to reverse the string
 */
public class StringReversal {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(simpleStringReverse("Mohit"));//printing simplestringreverse method result
		System.out.println(charArrayStringReverse("Ashish"));//printing charArrayStringReverse method result
		System.out.println(bufferStringReverse("Rahul"));//printing bufferStringReverse method result
	}
	
	//string reversal using charAt method of the String class
	public static String simpleStringReverse(String inString) {
		String outString = "";
		
		for (int i = inString.length() - 1 ; i>=0 ; i--) {
			outString = outString + inString.charAt(i);	
		}		
		return outString;	
	}
	
	//string reversal using array of characters
	public static String charArrayStringReverse(String inString) {
		String outString = "";
		
		char[] arrayOfInString = inString.toCharArray();		
		//char[] reverseString = inString;
		
		for (int i = arrayOfInString.length - 1 ; i>=0 ; i--) {
			outString = outString + arrayOfInString[i];	
		}		
		return outString;	
	}
	
	//string reversal using String buffer
	public static String bufferStringReverse(String inString) {
		
		StringBuffer bufferOfInString = new StringBuffer(inString);		
		bufferOfInString.reverse();	
		return bufferOfInString.toString();	
	}	

}


