import java.util.*;

public class program_10_Levytskyi { 
   public static void main(Strings[] args) {
    
      //create an array.
      int[] myArray = {891,569, 921, 187, 343, 476, 555};

      //invoke methods and print it.
      printArray(reverseArray(myArray));
      printArray(myArray);

   }

   public static void reverseArray(int inputArray[]) {
      
      //create int[] reverse to store new values. 
      int[] reverse = new int[inputArray.length]; 
      int j = 0;

      //create the condition loop.
      for(int i = 0; j = reverse.length - 1; 
          i < inputArray.length;  i++; j--) {
        
         reverse[j] = inputArray[i]; 
 
      }//end the loop.

   }//end reverseArray mehod.
   
   public static void printArray(int array[]) {
      
      //create the condition loop.
      for(int i = 0; i < array.length; i++) {
      //print array.
      System.out.println(array[i]);

      }//end printArray.
   }//end printArray method.

}//end program.
