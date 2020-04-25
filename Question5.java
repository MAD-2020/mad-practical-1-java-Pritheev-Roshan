import java.util.Scanner;

public class Question5
{

  public static int mode(int array[], int numbers)
  {
    int maxValue = 0;  
    int maxCount = 0;

    for (int i = 0; i < numbers; i++)
    {
      int count = 0;

      for ( int j = 0; j < numbers; j++)
      {
        if (array[j] == array[i])
        {
          count++;
        }
      }

      if (count > maxCount)
      {
        maxCount = count;
        maxValue = array[i];
      }
    }

    return maxValue;
  }
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
    
     

    Scanner in = new Scanner(System.in);

    System.out.print("Enter number length: ");
    int numLength = in.nextInt();

    int numList[] = new int[numLength];

    System.out.println("Enter " + numLength + " numbers: ");
    for (int i = 0; i < numLength; i++)
    {
        int temp = in.nextInt();
        numList[i] = temp;
    }
    in.close();
    System.out.println("Mode ::"+mode(numList, numLength));
  }
}

