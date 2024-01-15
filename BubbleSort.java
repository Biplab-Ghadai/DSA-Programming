import java.util.Scanner;

class demo{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int flag = 0;
        
        for(int i=0; i<n; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        for(int i=0; i<arr.length; i++)
        {
            flag = 1;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    flag = 0;
                }
            }
            if(flag==1)
            {
                break;
            }
        }
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}