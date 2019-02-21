import java.util.Scanner;

//Defines the time needed to reach the space body
public class Speed_of_Light {

	public static void main(String[] args) {
		
		//declare and assign the variable speed_of_light per hour 
		double speed_of_light;
		speed_of_light = 300000;//km per second
		
		
		Scanner input = new Scanner(System.in);
		//Prompt the user
		System.out.println("Enter distance in kilometers to the space body ?: ");
		double distance = input.nextDouble(); //Receives users input
		//Once finished 
		input.close();
		
		//Declare and compute the time in years 
		double time;
		time = distance / speed_of_light / 60;
		
		if (time > 60) {
			System.out.println("The light needs " + time / 60  + " hours to get there!");
		} else {
			System.out.println("The light needs " + time  + " minutes to get there!");
		}
	}	
}
