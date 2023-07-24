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

        System.out.println("");

        // minimum and maximum
        int min = dataPoints[0];
        int max = dataPoints[0];
        for (int e = 0; e < dataPoints.length; e++)
        {
            if (min > dataPoints[e])
            {
                min = dataPoints[e];
            }

            if (max < dataPoints[e])
            {
                max = dataPoints[e];
            }
        }
        System.out.println("The minimum of the array is " + min);
        System.out.println("The maximum of the array is " + max);

        System.out.println("\n");

        // method for average
        System.out.println("Average of dataPoints is: " + getAverage(dataPoints));

        // method for minimum
        System.out.println("Minimum of dataPoints is: " + min(dataPoints));

        // method for maximum
        System.out.println("Maximum of dataPoints is: " + max(dataPoints));

        //method for occurrenceScan
        System.out.println("You target value of " + searchTarget + " was found in the array dataPoints " + occuranceScan(dataPoints, searchTarget) + " times.");

        // method for sum
        System.out.println("Sum of dataPoints is: " + sum(dataPoints));

        // method for contains
        if (contains(dataPoints, searchTarget))
        {
            System.out.println("The array dataPoints contains the target value " + searchTarget);
        }
        else
        {
            System.out.println("The array dataPoints does not contain the target value " + searchTarget);
        }
    }

    public static double getAverage(int values[])
    {
        double sum = 0.0;
        for (int e = 0; e < values.length; e++)
        {
            sum += values[e];
        }

        double average = sum / values.length;
        return average;
    }

    public static int min(int values[])
    {
        int min = values[0];
        for (int e = 0; e < values.length; e++)
        {
            if (min > values[e])
            {
                min = values[e];
            }
        }
        return min;
    }

    public static int max(int values[])
    {
        int max = values[0];
        for (int e = 0; e < values.length; e++)
        {
            if (max < values[e])
            {
                max = values[e];
            }
        }
        return max;
    }

    public static int occuranceScan(int values[], int target)
    {
        int counter = 0;
        for (int e = 0; e < values.length; e++)
        {
            if (target == values[e])
            {
                counter ++;
            }
        }

        return counter;
    }

    public static int sum(int values[])
    {
        int sum = 0;
        for (int e = 0; e < values.length; e++)
        {
            sum += values[e];
        }
        return sum;
    }

    public static boolean contains(int values[], int target)
    {
        boolean targetFound = false;
        for (int e = 0; e < values.length; e++)
        {
            if (target == values[e])
            {
                targetFound = true;
                break;
            }
        }
        return targetFound;
    }

}