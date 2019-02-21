import java.util.Scanner;

//Displays a convertation from Celcius to Fahrenheit
public class Celcius_to_Fahrenheit {

	public static void main(String[] args) {
		
		//Declaring a var Fahrenheit
		double Fahrenheit; 
		
		//Declaring Celcius var
		double Celcius;
		
		//Create a Scanner
		Scanner input = new Scanner(System.in);
		
		//Prompt
		System.out.println("Enter the temperature in Celcius: ");
		Celcius = input.nextDouble(); //Receives user input
		
		//Define Fahrenheit
		Fahrenheit = (9.0/5) * Celcius + 32;
		
		//Print the result
		System.out.println("The temperature is " + Fahrenheit + " degrees in Fahrenheits.");
		
		//Once finished, stop the Scanner program 
		input.close();

	}

}
