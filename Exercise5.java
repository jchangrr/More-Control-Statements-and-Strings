import java.util.*;
public class Exercise5{
	public static void main(String[] args){
		// set up variables
		Scanner input = new Scanner(System.in);
		char charOne = 'a';
		char charTwo = 'a';
		int intOne = 0;
		int intTwo = 0;

		// ask for numbers or characters
		System.out.print("Please enter a number or a character: ");
		String choiceOne = input.nextLine();

		System.out.print("Please enter another number or character: ");
		String choiceTwo = input.nextLine();
	
		// check if int or char and input into overloaded method
		if (Character.isDigit(choiceOne.charAt(0))){
			for (int i = 0; i<choiceOne.length(); i++){
				intOne = intOne + ((int)Math.pow(10, i) * (choiceOne.charAt(choiceOne.length() - 1 - i) - 48));
			}
			for (int i = 0; i<choiceTwo.length(); i++){
				intTwo = intTwo + ((int)Math.pow(10, i) * (choiceTwo.charAt(choiceTwo.length() - 1 - i) - 48));
			}
			System.out.println("Your random int is: " + random(intOne, intTwo));
		}

		else if (Character.isLetter(choiceOne.charAt(0))){
			charOne = choiceOne.charAt(0);
			charTwo = choiceTwo.charAt(0);

			System.out.println("Your random char is: " + random(charOne, charTwo));
		}
		
		input.close();
	}
	// create overloaded method for int input
	public static int random(int intOne, int intTwo){
		int randomNum = intOne + (int)(Math.random()*(intTwo+1-intOne));
		return randomNum;
	}

	// create overloaded method for char input
	public static char random(char charOne, char charTwo){
		int i = charOne;
		int j = charTwo;
		int randomNum = i + (int)(Math.random()*(j+1-i));
		char randomChar = (char)randomNum;
		return randomChar;
	}
}