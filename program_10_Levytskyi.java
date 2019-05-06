import java.util.*;

public class program_10_Levytskyi { 
   public static void main(String[] args) {

      //create an array.
      int[] myArray = {891, 569, 921, 187, 343, 476, 555};

      //invoke methods and print it.
      printArray(myArray);
      System.out.println("\n");
      reverseArray(myArray);
   }//end main method

//------------------------------------------------------------------------

   public static void reverseArray(int[] inputArray) {

      //create int[] reverse to store new values. 
      int[] reverse = new int[inputArray.length];

      //create the condition loop.
      for(int i = 0, j = reverse.length - 1; 
          i < inputArray.length;  i++, j--) {

         reverse[j] = inputArray[i]; 
         System.out.print(inputArray[j] + " ");
      }//end the loop.
      
   }//end reverseArray mehod.

//------------------------------------------------------------------------

   public static void printArray(int[] array) {

      //create the condition loop.
      for(int i = 0; i < array.length; i++) {
         System.out.print(array[i] + " ");
      }//end loop
   }
//------------------------------------------------------------------------
} //end program 
