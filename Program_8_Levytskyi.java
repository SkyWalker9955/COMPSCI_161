import java.util.*;

public class Program_8_Levytskyi {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//prompt and input variable
		System.out.println("The program sums numbers from 0 to 1000"
				+ "\nEnter a number: ");
		int inp_num = input.nextInt();
		int counter = 0;
		sumDigits(inp_num);
	}
	
	public static int sumDigits(long n) {
		//sum var
		int sum = 0;
		//condition
		for (n; n > 0; n++) { 
			sum += n % 10; 
			n = n / 10;
		
		return sum;
		}
	}
}