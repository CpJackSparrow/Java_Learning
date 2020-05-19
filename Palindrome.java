/**
 * 
 */
package basicpackage;

/**
 * @author mohitshandilya
 * palindrome java learning program
 */
public class Palindrome {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(palindromeChecker("Mohit")); //output check 1
		System.out.println(palindromeChecker("Wow")); //check 2
		System.out.println(palindromeChecker("Malayalam")); //check 3
		System.out.println(palindromeChecker("hohoho")); //check 4

	}
	
	//method one that just prints a string and uses the boolean method to actually test if the inString
	//is Palindrome or not
	public static String palindromeChecker(String inString){
		String outString = inString + " is not a Palindrome.";
		Boolean result = palindromeCheckerBoolean(inString);
		
		if (result == true) {
			outString = inString + " is a Palindrome.";
		}
		return outString;
	}
	
	//This gets String and outs boolean after comparing if the reverse of inString is palindrome or not
	//for reverse StringBuffer class's reverse method is used.
	public static Boolean palindromeCheckerBoolean(String inString){
		
		Boolean x = false;
		
		StringBuffer reverseInStringBuffer = new StringBuffer(inString);
		reverseInStringBuffer.reverse();
		String reversedInString = reverseInStringBuffer.toString();
		
		if (reversedInString.equalsIgnoreCase(inString)) {
			x = true;
		}
		
		return x;
	}
}
