package org.example;
import java.util.Scanner;

public class App 
{
  public static String getInput(int lower, int upper, String prompt, String error) {
    // Implement your function here
    boolean isValid = false;
    System.out.println("Hello!");
    int value = 0;
    while (isValid == false)
    {
      System.out.println(prompt);
      Scanner in = new Scanner(System.in);

      if (in.hasNextInt())
      { 
        value = in.nextInt();

        if (lower <= value && upper >= value)
        {
          isValid = true;
        } else {
          System.out.println(error);
        }

      } else {
        return error;

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
    System.out.println(getInput(-50,50, "Please Enter a Value:", "Error: Try Again"));

  }

}
