import java.util.Arrays;
import java.util.ArrayList;

class demo{
    public static void main(String args[])
    {
        int arr[] = {-6, 11, -2, 7, -9, 14, 0, -13, 4, -8};
        int sum = 0;
        Arrays.sort(arr);
        int a = arr[0];
        int b = arr[0];
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==0)
            {
                a = arr[i+1];
                b = arr[i-1];
            }
        }
        
        ArrayList<Integer> list = new ArrayList<>();

        
        for(int i=0; i<arr.length-1; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                sum = arr[i] + arr[j];
                if(sum > b && sum < a)
                {
                    list.add(sum);
                    for(int l: list)
                    {
                        
                    }
                    System.out.print(sum+" ");
                    // System.out.println(arr[i]+"  and  "+arr[j]);
                }
            }
        }
        //System.out.println(sum);
    }
}