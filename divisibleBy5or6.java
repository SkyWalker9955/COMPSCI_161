
public class divisibleBy5or6 {

	public static void main(String[] args) {	
		//counter for loop
		int counter = 0;
		
		//creating a for loop
		for (int i = 100; i < 201; i++) {
			if (i % 5 == 0 ^ i % 6 == 0) { 
				System.out.print(i + " ");
				
				// updating a counter 
                counter++;
                if (counter % 10 == 0) 
                	System.out.println("");
			}
		}
	}	
}