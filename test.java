import java.util.*;

public class test {
	public static void main(String[] args) {

		String s = "15 45 23 51 85 02"; 
		String[] prime_string = s.split(" "); 

		printArray(prime_string, "nums: ");

	}//end main method 

	public static void printArray(String[] a, String label) { 
		
		int i;
		System.out.println(label);
		for (i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
			System.out.print("\n");
	
		}//end for loop

	}//end printArray method
}
