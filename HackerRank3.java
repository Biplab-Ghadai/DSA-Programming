import java.util.Scanner;

class demo{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int brr[] = new int[arr.length];
        
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        for(int i=0; i<arr.length; i++)
        {
            brr[i] = 1;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j])
                {
                    brr[i]++;
                    arr[j] = '@';
                }
            }
        }
        for(int i=0; i<brr.length; i++)
        {
            if(arr[i] != '@' && brr[i]==1)
            {
                System.out.println(arr[i]);
            }
        }
    }
}