import java.util.*; 

public class program9_Levytskyi {

	public static void main(String[] args) {
		
		//Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt_1 and Array settings 
		System.out.println("Enter an integer that will determine the size of an array: ");
		int length = input.nextInt();
		double[] nums = new double[length];
		
		//Prompt_2
		System.out.println("Enter values for your array: ");
		
		//condition
		for (int counter = 0; counter < length; counter++) { 
			nums[counter] = input.nextInt();
		}
		input.close();
		
		//Result
		System.out.println("The smallest number in your array is " + min(nums));
		System.out.println("The largest number in your array is " + max(nums));
		System.out.println("The average number in your array is " + avg(nums));

	}
	
	// minimum number method
	public static double min(double[] nums) {
		double min = nums[0];
		for (int i = 1; i < nums.length; i++){
		    if (nums[i] < min) {
			  min = nums[i];
			}
		}
		return min;
	}

	// maximum number method
	public static double max(double[] nums) {
		double max = nums[0];
		for (int i = 1; i < nums.length; i++){
		    if (nums[i] > max) {
			  max = nums[i];
		    }
		}
		return max;
	}
	
	// average number method
	public static double avg(double[] nums) { 
		double sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
		}
		double avg = sum / nums.length;
		return avg;
	}
}
