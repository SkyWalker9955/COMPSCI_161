import java.util.*;

public class Lottery {

	public static void main(String[] args) {
		
		//Create Scanner 
		Scanner input = new Scanner(System.in);
		
		//Generate a winning combination 
		int winning_comb = (int)(Math.random() * 100);
		
		//System.out.println(winning_comb);
		//Prompt 
		System.out.println("Enter your lottery pick (two digits): ");
		int guess = input.nextInt();

		//Get digits from lottery 
		int firstDigit = winning_comb / 10;
		int secondDigit = winning_comb % 10; 
		
		//Get digits from user input 
		int firstUserDigit = guess / 10;
		int secondUserDigit = guess % 10; 
		
		System.out.println("\nLottery nums are " + winning_comb);
		
		//Check the guess 
		if (winning_comb == guess) { 
			System.out.println("You won $10,000 !");
		}
		else if (firstDigit == secondUserDigit 
				 && secondDigit == firstUserDigit) {
			System.out.println("You won $3,000 !");
		}
		else if (firstDigit == firstUserDigit 
			  || firstDigit == secondUserDigit
			  || secondDigit == firstUserDigit
			  || secondDigit == secondUserDigit) {
			System.out.println("You won $1,000 !");
		}
		else {
			System.out.println("Sorry, no match...");
		}
		input.close();
		
	}

}
