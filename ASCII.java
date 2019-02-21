import java.util.*;

public class ASCII {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		// Prompt the user to enter an ASCII code
		// (an integer between 0 and 127)
		System.out.print("Enter an ASCII code: ");
		int i = input.nextInt();

		if (i < 0) {
			System.out.println("The value can't be negative.");
		} else if (i < 127) {
			// Display ASCII code as character
			System.out.println((char)i);
		} else {
			System.out.println("Invalid entry, maximum ASCII code is 127.");
		}
		
		input.close();
	}

}
