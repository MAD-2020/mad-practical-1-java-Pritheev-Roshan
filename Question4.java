import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    Scanner in = new Scanner(System.in);

    System.out.print("Enter the base for your triangle: ");
    int base = in.nextInt();
    System.out.println();

    in.close();

    for(int i=0;i<=base;i++)
    {
	    for(int j=0;j<base-i;j++)
        {
            System.out.print("*");
        }
	
        for(int k=0;k<i;k++)
        {
            System.out.print(" ");
        }
        System.out.println();
    }
  }
}
