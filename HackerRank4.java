import java.util.Scanner;
class demo{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        int a = 0, b = 0, c = 0;
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                arr[i][j] = sc.nextInt();
            }
        }
        
        for(int i=0; i<n; i++)
        {
            for(int j=0; j<n; j++)
            {
                if(i==j)
                {
                    a += arr[i][j];
                }
                if((i+j)==(n-1))
                {
                    b += arr[i][j];
                }
            }
        }
        if(a > b)
        {
            c = a - b;
        }
        else{
            c = b - a;
        }
        System.out.println(c);
    }
}