import java.util.*;

public class ComputeTax {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Status numbers: \n0 - single \n1 - married (filling together) \n2 - married" +
							"(filling separately) \n3 - head of household)");

		//Prompt
		System.out.println("\nEnter your status: ");
		int status = input.nextInt();
		System.out.println("Enter your anual income: ");
		int income = input.nextInt();

		//Declare Tax
		double tax = 0;

		//Boolean condition
		if (status == 0) {
			if (income <= 8350)
				tax = income * 0.10;
			else if (income <= 33_950)
				tax = 8350 * 0.10 + (income - 8350) * 0.15;
			else if (income <= 82_250)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (income - 33950) * 0.25;
			else if (income <= 171_550)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 +
				      (82250 - 33950) * 0.25 + (income - 82250) * 0.28;
			else if (income <= 372_950)
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 +
				      (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
			else
				tax = 8350 * 0.10 + (33950 - 8350) * 0.15 + (82250 - 33950) * 0.25 +
				      (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
		}
		else if (status == 1) {
			//fill in the code for practicing
		}
		else if (status == 2) {
			//fill in the code for practicing
		}
		else if (status == 3) {
			//fill in the code for practicing
		}
		else {
			System.out.println("Error: Invalid status");
			System.exit(1);
		}

		//Display the result
		System.out.println("Tax is " + (int)(tax * 100) / 100.0);

	}

}
