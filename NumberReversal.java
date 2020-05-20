/**
 * 
 */
package basicpackage;


/**
 * @author mohitshandilya
 * Practicing Number Reversal
 * Number Reverse is quite tricky. we have String class method to reverse a String
 * but for number as int or any number format is a datatype and not class, there are 
 * no direct methods available to help.
 * 
 * one of the method is by using logic i.e. mod(%) method. which is actually easiest and fastest
 * 
 * 
 */
public class NumberReversal {

	public static void main(String[] args) {
		System.out.println(logicalIntReverse(123687263));
		System.out.println(logicalIntReverse(32321));
		System.out.println(logicalIntReverse(1232123));
	}
	
	//Number reversal using Maths logic and mod operator
	public static int logicalIntReverse(int inNumber) {
		int outNumber = 0;
		int remainder;
		
		while (inNumber > 0) {
			remainder = inNumber % 10;
			outNumber = ( outNumber * 10 ) + remainder;
			inNumber = inNumber / 10;
		}	
		return outNumber;	
	}
	

}
