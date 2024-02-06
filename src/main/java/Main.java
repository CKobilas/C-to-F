import java.util.*;

// Define a class named Main

public class Main {
  
// Define a main method
  
  public static void main(String[] args) 
  {
// Output the message "Please enter a degree in Celsius"

    System.out.println("Please enter a degree in Celsius: ");

// Create a Scanner object

    Scanner temp = new Scanner(System.in);

// Read a double value from the user and store it in a variable named degrees

    double degrees = temp.nextDouble();

// Calculate the Fahrenheit equivalent of the Celsius value and store it in a variable named fahrenheit

    double fahrenheit = (9.0 / 5) * degrees + 32;

// Output the message "Celsius " + degrees + " is " + fahrenheit + " Fahrenheit"

    System.out.println("The temperature in Fahrenheit is: " + fahrenheit);

  }
}