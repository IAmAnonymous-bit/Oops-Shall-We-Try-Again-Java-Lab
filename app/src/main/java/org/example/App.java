package org.example;
import java.util.Scanner;

public class App 
{
  public static String getInput(int lower, int upper) {
    // Implement your function here

    
    boolean isValid = false;
    System.out.println("Hello!");
    int value = 0;
    while (isValid == false)
    {
      System.out.println("Please enter a value:");
      Scanner in = new Scanner(System.in);

      if (in.hasNextInt())
      { 
        value = in.nextInt();

        if (lower <= value && upper >= value)
        {
          isValid = true;
        } else {
          System.out.println("Error: Value is out of bounds");
        }

      } else {
        return "Error: Value is not an Int";

      }
      
      in.close();

      System.out.println();

    }


    String str = String.valueOf(value);
    return "Your value is " + str;

  }

  public static void main(String[] args) 
  {
    // Test your function here in a driver program
    System.out.println(getInput(-50,50));

  }

}
