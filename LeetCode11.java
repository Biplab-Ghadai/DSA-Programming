class dmeo{
    public static void main(String args[])
    {
        int arr[] = {1,1};
        int var = arr[arr.length-1];
        int var2=0;
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] >= var)
            {
                var2 = arr[i];
                break;
            }
        }
        int count = 0;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==var2)
            {
                count = arr.length-1 - i;
                break;
            }
        }
        int area = var * count;
        System.out.println("The Maximum area is: "+area);
        
    }
}