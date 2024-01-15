class demo{
    public static void main(String args[])
    {
        int arr[] = {6, 3, 5, 1, 2};
        int max = 0;
        int sum = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                max = arr[i];
            }
        }
        
    
        for(int i=0; i<arr.length; i++)
        {
            sum = sum + arr[i];
        }
        int sum2 = (max*(max+1))/2;
        int res = sum2 - sum;
        System.out.println(res);
    }
}