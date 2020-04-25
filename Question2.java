import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the height and weight of the user
     * 
     * Hint: in.nextDouble() to read double
     */
     
    Scanner in = new Scanner(System.in);

    System.out.print("Please enter height in m: ");
    double height = in.nextDouble();

    System.out.print("Please enter weight in kg: ");
    double weight = in.nextDouble();

    in.close();

    double bmi = (weight / (height*height));

    System.out.println("Your height is: " + height);
    System.out.println("Your weight is: " + weight);

    System.out.print("Your BMI is: " + bmi);

  }
}
