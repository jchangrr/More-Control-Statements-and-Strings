import java.util.*;

public class Exercise3 {
	public static void main(String[] args){
	// set up variables
	Scanner input = new Scanner(System.in);
	System.out.print("Please enter a word: ");
	String palindrome = input.nextLine();
	String word = "";
	String reverse = "";

	for (int i = 0; i < palindrome.length(); i++){
		if (Character.isLetter(palindrome.charAt(i)))
			word = word + palindrome.charAt(i);

	// convert word to lower case
	word = word.toLowerCase();

	}

	// reverse the word
	for (int j = 0; j < word.length(); j++){
		reverse = reverse + word.charAt(word.length()-1-j);
	}

	// check if the reverse word = the forward word
	if (word.equals(reverse))
		System.out.println("This word is a palindrome");
	else 
		System.out.println("This word is not a palindrome");

	input.close();
	}
}