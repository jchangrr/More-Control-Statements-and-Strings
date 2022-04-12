import java.util.*;
public class Exercise7{
	public static void main(String[] args){
		// set up scanner
		Scanner input = new Scanner(System.in);

		// ask for two strings
		System.out.print("Enter the first string: ");
		String first = input.nextLine();
		String firstLower = first.toLowerCase();

		System.out.print("Enter the second string: ");
		String second = input.nextLine();
		String secondLower = second.toLowerCase();

		// check for common prefix
		String check = "";
		int length = 0;

		if (firstLower.length()>secondLower.length())
			length = secondLower.length();
		else
			length = firstLower.length();

		for (int i = 0; i < length; i++){
			char c = firstLower.charAt(i);
			char cc = secondLower.charAt(i);
			
			if (c == cc)
				check = check + first.charAt(i);
			else 
				break;
		}
		if (firstLower.charAt(0) != secondLower.charAt(0))
			System.out.println(first + " and " + second + " have no common prefix");
		else 
			System.out.println("The common prefix is: " + check);

		input.close();
	}
}