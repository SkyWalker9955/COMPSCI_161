import java.util.Scanner;

public class ComputeChange {
  
  	public static void main(String[] args) {
	  	//Create a scanner
	  	Scanner input = new Scanner(System.in);
	  	
	  	//Prompt the user to enter the amount in decimal
	  	System.out.println("Enter the amount in decimal: ");

	  	//Geneate the input
	  	double amount = input.nextDouble(); 
	  	int remainingAmount = (int)(amount * 100); 
	  	
	  	//Amount of $ 
	  	int dollars = remainingAmount / 100; 
	  	remainingAmount = remainingAmount % 100; 
	  	
	  	//Amount of quarters 
	  	int quarters = remainingAmount / 25;
	  	remainingAmount = remainingAmount % 25;
	  	
	  	//Amount of dimes 
	  	int dimes = remainingAmount / 10;
	  	remainingAmount = remainingAmount % 10; 
	  	
	  	//amount of nickels 
	  	int nickels = remainingAmount / 5; 
	  	remainingAmount = remainingAmount % 5;
	  	
	  	//num of pennies 
	  	int pennies = remainingAmount; 
	  	
	  	//Display results
	  	System.out.println("Your ammount " + amount + " consists of: ");
	  	System.out.println(dollars + " dollars");
	  	System.out.println(quarters + " quarters");
	  	System.out.println(dimes + " dimes");
	  	System.out.println(nickels + " nickels");
	  	System.out.println(pennies + " pennies" );
	  	
	  	}

}
