// Given an array of integers, calculate the ratios of its elements that are positive, negative, and zero. Print the
// decimal value of each fraction on a new line with  places after the decimal.

// Note: This challenge introduces precision problems. The test cases are scaled to six decimal places, though
// answers with absolute error of up to  are acceptable.

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Scanner;

class demo{
    private static final DecimalFormat df = new DecimalFormat("0.000000");
    public static void main(String args[])
    {
        int p=0, v=0, z=0;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]<0)
            {
                v++;
            }
            else if(arr[i]>0)
            {
                p++;
            }
            else if(arr[i]==0)
            {
                z++;
            }
            else{
                System.out.println("Not valid !!");
            }
        }
            double r = (double) v/n;
            double s = (double) p/n;
            double t = (double) z/n;
            
            System.out.print(df.format(r)+" "+df.format(s)+" "+df.format(t));
    }
}