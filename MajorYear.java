import java.util.*;

public class MajorYear {

	public static void main(String[] args) {
		
		//Create a Scanner, instruct and prompt a user
		Scanner input = new Scanner(System.in);
		System.out.println("Majors: \nM - Math \nC - CompSci \nI - InfoTech \n\nEnter two characters: ");
		
		String UserInput = input.next();
		
		//define vars
		char major = Character.toUpperCase(UserInput.charAt(0));
		char year = UserInput.charAt(1);
		
		String majorName = null;
		String yearName = null;
		
		//condition
		if (major == 'M' || major == 'I' || major == 'C') {
			switch (major) 
			{
				case 'M': majorName = "Math";
					break;
				case 'I': majorName = "infoTech";
					break;
				case 'C': majorName = "CompSci";
					break;
			}
			switch (year)
			{
				case '1': yearName = "Freshman";
					break; 
				case '2': yearName = "Sophomor";
					break;
				case '3': yearName = "Junior";
					break;
				case '4': yearName = "Senior";
					break;
			}
			System.out.println("The major is: " + majorName + "\nStatus: " + yearName);
		} else  {
			System.out.println("Invalid entry.");
		}
		input.close();	
	}

}