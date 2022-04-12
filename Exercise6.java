import java.util.*;
public class Exercise6{
	public static void main(String[] args){
	// set up variables
	int count = 1;

	// create table 
	for (char c=65; c<127; c++){
		int i = c;
		System.out.printf("%4d: ", i);
		System.out.print(c);
		System.out.print("     ");
		if (count % 5 == 0)
			System.out.println("\n ---------------------------------------------------------");
		else if (c == 126)
			System.out.println("\n ---------------------------------------------------------");
		count ++;
	}

	}
}