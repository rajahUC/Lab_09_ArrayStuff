import com.sun.org.apache.bcel.internal.classfile.SourceFile;

import java.util.Random;
import java.util.Scanner;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        final int ARRAY_SIZE = 100;
        int[] dataPoints = new int[ARRAY_SIZE];

        Scanner in = new Scanner(System.in);
        Random rnd = new Random();

        for(int e = 0; e < dataPoints.length; e++)
        {
            dataPoints[e] = rnd.nextInt(100) + 1;
        }

        for (int e = 0; e < dataPoints.length; e++)
        {
            System.out.printf("| %d ", dataPoints[e]);
        }

        System.out.println("");

        int sum = 0;
        for (int e = 0; e < dataPoints.length; e++)
        {
            sum += dataPoints[e];
        }

        int ave = sum / dataPoints.length;

        System.out.printf("The sum of the random array dataPoints is %d, and the average is %d.", sum, ave);
    }
}