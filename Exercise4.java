import java.util.*;

public class Exercise4{
	public static void main(String[] args){
		// set up variables
		Scanner input = new Scanner(System.in);

		// ask for decimal number
		System.out.print("Please enter a decimal number: ");
		int number = input.nextInt();

		System.out.println("The binary number is: " + intToBinary(number));

		input.close();

	}

	public static int intToBinary(int number){
		// set up variables
		int binary = 0;
		int count = 0;

		// convert to binary
		while (number != 0){
			int remainder = number % 2;
			double power = Math.pow(10, count);
			binary += remainder * power;
			number /= 2;
			count ++;
		}

		return binary;
	}
}