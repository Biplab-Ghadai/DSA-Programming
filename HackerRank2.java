import java.util.Scanner;

class demo{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int arr[] = new int[n];
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        int sum1 = 0;
        int sum2 = 0;
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i=0; i<arr.length-1; i++)
        {
            sum1 = sum1 + arr[i];
        }
        for(int i=arr.length-1; i>0; i--)
        {
            sum2 = sum2 + arr[i];
        }
        System.out.println(sum1+" "+sum2);
    }
}