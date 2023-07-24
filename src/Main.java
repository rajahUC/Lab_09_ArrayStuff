import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.util.Random;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {

        // create array
        final int ARRAY_SIZE = 100;
        int[] dataPoints = new int[ARRAY_SIZE];

        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        // iterates through array and initializes each element
        for(int e = 0; e < dataPoints.length; e++)
        {
            dataPoints[e] = rnd.nextInt(100) + 1;
        }

        // Formats the printing of the array
        for (int e = 0; e < dataPoints.length; e++)
        {
            System.out.printf("| %d ", dataPoints[e]);
        }

        System.out.println("");

        // Sum and average of array
        int sum = 0;
        for (int e = 0; e < dataPoints.length; e++)
        {
            sum += dataPoints[e];
        }

        int ave = sum / dataPoints.length;

        System.out.printf("The sum of the random array dataPoints is %d, and the average is %d.", sum, ave);

        // Linear Search of array
        int searchTarget = SafeInput.getRangedInt(in,"\n\nEnter value to search for: ", 1, 100);

        int counter = 0;
        for (int e = 0; e < dataPoints.length; e++)
        {
            if (searchTarget == dataPoints[e])
            {
                counter ++;
            }
        }
        System.out.printf("The dataPoints array contained your value %d times", counter);

        System.out.println("");

        boolean targetFound = false;
        for (int e = 0; e < dataPoints.length; e++)
        {
            if (searchTarget == dataPoints[e])
            {
                targetFound = true;
                System.out.printf("The value %d was found at array index %d.", searchTarget, e);
                break;
            }
        }

        if (!targetFound)
        {
            System.out.printf("The value %d was not found in the array.", searchTarget);
        }


    }
}