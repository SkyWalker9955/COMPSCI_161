import java.util.*;

public class ComputeTax {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Status numbers: \n0 - single, \n1 - married (filling together), \n2 - married" + 
							"(filling separately), \n3 - head of household)");
		
		//Prompt
		System.out.println("\nEnter your status: ");
		int status = input.nextInt();
		System.out.println("Enter your anual income: ");
		int income = input.nextInt();
		
		//Declare Tax
		double tax = 0; 
		
		//Boolean condition
		if (status == 0) {
			if (income <= 8350) {
				tax = income * 0.10;
			}
		}

	}

}
