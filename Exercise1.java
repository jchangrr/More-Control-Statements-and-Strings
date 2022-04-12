import java.util.*;
public class Exercise1{
	public static void main(String[] args){

	// set up variables
	Scanner input = new Scanner(System.in);
	int selection = 5;
	double balance = 100;

	// display choices and ask for input
	do{
		System.out.println("1. View your Balance");
		System.out.println("2. Deposit Cash");
		System.out.println("3. Withdraw Cash");
		System.out.println("4. Exit");
		System.out.println();
		System.out.print("Enter your selection: ");
		selection = input.nextInt();
		System.out.println();

		if (selection > 4)
			System.out.println("Incorrect selection, please try again");
		else if (selection == 4)
			System.out.println("Goodbye");
		else if (selection == 1)
			choiceOne(balance);
		else if (selection == 2)
			balance = choiceTwo(balance);
		else if (selection == 3)
			balance = choiceThree(balance);
	} while (selection != 4);
	input.close();

	}

	// create method to output balance
	public static void choiceOne(double balance){
		System.out.printf("Your current balance is %.2f", balance);
		System.out.println();
	}
	
	// create method to process deposit
	public static double choiceTwo(double balance){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount you want to deposit: ");
		double deposit = input.nextDouble();

		if (deposit < 0)
			System.out.println("Incorrect Amount!");
		else
			balance = balance + deposit;
		return balance;
	}

	// create method to process withdrawal
	public static double choiceThree(double balance){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the amount you want to withdraw: ");
		double withdraw = input.nextDouble();

		if (withdraw > balance)
			System.out.println("Sorry, you don't have sufficient balance!");
		else if (withdraw < 0)
			System.out.println("Incorrect Amount!");
		else
			balance = balance - withdraw;
		return balance;
	}
}