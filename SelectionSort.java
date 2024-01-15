class demo{
    public static void main(String args[])
    {
        int arr[] = {3, 2, 4, 5, 1};
        
        for(int i=0; i<arr.length-1; i++)
        {
            int ind = i;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[j] < arr[ind])
                {
                    ind = j;
                }
            }
            int temp = arr[ind];
            arr[ind] = arr[i];
            arr[i] = temp;
        }
        for(int i = 0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}