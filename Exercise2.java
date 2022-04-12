import java.util.*;
	
public class Exercise2 {
	public static void main(String[] args){
		// set up variables
		Scanner input = new Scanner(System.in);

		// ask for a number
		System.out.print("Please enter a number: ");
		String number = input.next();

		// output method with reversed number
		reversed(number);
		input.close();
	}

	// reverse the number in method
	public static void reversed(String number){
		String reverseNum = "";
		for (int i = 0; i < number.length(); i++){
			reverseNum = reverseNum + number.charAt(number.length()-1-i);
		}
		System.out.println("The reversed number is: " + reverseNum);
	}
}