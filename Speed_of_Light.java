import java.awt.List;
import java.util.*;

public class Speed_of_Light {

	public static void main(String[] args) {
		//Defines the time needed to reach the space body 
		
		
		//declare and assign the variable speed_of_light per hour 
		final double speed_of_light;
		speed_of_light = 300000;//km per second
		
		//Declare list of vars corresponding to planets 
		/*
		 * String Mars = Mars;
		 * String Venus = Venus;
		 * String Jupiter = Jupiter";
		 */
		int Mars = 227_900_000;
		int Venus = 108_200_000;
		int Jupiter = 778_500_000;
		
		//Declare a list 
				new ArrayList<String>();
				Arrays.asList(Mars, Venus, Jupiter);
		
		Scanner input = new Scanner(System.in);
		//Prompt the user
		System.out.println("Enter distance in kilometers to the space body ?: ");
		int distance = input.nextInt();  //Receives users input
		//Once finished 
		input.close(); 
		
		//Declare and compute the time in years 
		double time;
		time = distance / speed_of_light / 60;
		double time_hours = time / 60;
		
		if (time > 60) {
			System.out.println("The light needs " + time_hours  + " hours to get there!");
		} else {
			System.out.println("The light needs " + ((int)(time * 100.0) / 100.0)  + " minutes to get there!");
		}

	}
}
