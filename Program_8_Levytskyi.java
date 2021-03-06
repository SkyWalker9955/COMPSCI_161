import java.util.*;

public class Program_8_Levytskyi {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//prompt and input variable
		System.out.println("The program sums numbers from 0 to 1000"
				+ "\nEnter a number: ");
		int inp_num = input.nextInt();
		input.close();
		
		//result 
		System.out.println("The sum of numbers is: " + sumDigits(inp_num));
	}
	
	public static int sumDigits(long n) {
		//sum var
		int sum = 0;
		//condition
		while (n > 0) { 
			sum += n % 10; 
			n = n / 10;
		}
		return sum;
	}
	
}
