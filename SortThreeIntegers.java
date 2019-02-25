import java.util.*;

public class SortThreeIntegers {

	public static void main(String[] args) {

		//Create Scanner
		Scanner input = new Scanner(System.in);

		//Prompt
		System.out.println("Enter first integer: ");
		int i = input.nextInt();
		System.out.println("Enter second integer: ");
		int k = input.nextInt();
		System.out.println("Enter third integer: ");
		int j = input.nextInt();

		//establish temporary int
		int temp = 0;

		//condition
		if (i < k && k < j) {
		}
		else if (i < k && k > j) {
			if (i > j) {
				temp = j;
				j = k;
				k = i;
				i = temp;
			}
			else if (i < j) {
				temp = k;
				k = j;
				j = temp;
			}
		}
		else if (i > k && k < j) {
			if (i > j) {
				temp = k;
				k = j;
				j = i;
				i = temp;
			}
			else if (i < j) {
				temp = i;
				i = k;
				k = temp;
			}
		}
		else {
			temp = j;
			j = i;
			i = temp;
		}
		input.close();

    //Print the result
		System.out.println("\n" + i + "\n" + k + "\n" + j);

	}

}
