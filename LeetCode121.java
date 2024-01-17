class demo{
    public static void main(String args[])
    {
        int arr[] = {7,1,5,3,6,4};
        int brr[] = new int[arr.length];
        int temp = 0;
        
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                int max = 0;   
                max = arr[j] - arr[i];
                if(max > temp)
                {
                    temp = max;
                }
            }
        }
        System.out.println(temp);
        
    }
}