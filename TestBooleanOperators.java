import java.util.Scanner;
  2
  3  public class TestBooleanOperators {
  4    public static void main(String[] args) {
  5      // Create a Scanner
  6      Scanner input = new Scanner(System.in);
  7
  8      // Receive an input
  9      System.out.print("Enter an integer: ");
 10      int number = input.nextInt();
 11
 12      if (number % 2 == 0 && number % 3 == 0)
 13        System.out.println(number + " is divisible by 2 and 3.");
 14
 15      if (number % 2 == 0 || number % 3 == 0)
 16        System.out.println(number + " is divisible by 2 or 3.");
 17
 18      if (number % 2 == 0 ^ number % 3 == 0)
 19        System.out.println(number +
 20          " divisible by 2 or 3, but not both.");
 21    }
 22  }
