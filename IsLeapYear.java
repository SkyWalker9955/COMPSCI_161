import java.util.*;

public class LeapYear {
	
	public static void main(String[] args) {
	
	//Create Scanner
	Scanner input = new Scanner(System.in);
	
	//Prompt 
	System.out.println("Enter the year: ");
	int LeapYear = input.nextInt();
	
		//Leap year formula
		if (LeapYear % 4 == 0 && LeapYear % 100 != 0 || LeapYear % 400 == 0) {
		System.out.println("Is a leap year.");
		} 
		else {
		System.out.println("Not a leap year.");
		}
	}
	
}
