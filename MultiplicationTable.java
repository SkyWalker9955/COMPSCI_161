public class MultiplicationTable {

	public static void main(String[] args) {
		
		System.out.println("                                 Multiplication Table");
			
			//num title
		System.out.print("    ");
			for (int i = 10; i <= 20; i++) 
				System.out.print("     " + i);
			
		System.out.println("\n-------------------------------------------------------------------------------------");
		
			//line num indicator
			for (int k = 10; k <= 20; k++) { 
				System.out.print(k + " | ");
				
				//body
				for (int i = 10; i <= 20; i++) {  
					System.out.printf("%7d", k * i);
				}
			System.out.println();
			}	
	}
}