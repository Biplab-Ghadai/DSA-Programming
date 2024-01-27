class demo{
    public static void main(String args[])
    {
        int arr[] = {1,2,3,1,2,3};
        int k = 2;
        
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i]==arr[j] && i!=j)
                {
                    if((i-j) <= k)
                    {
                        System.out.println("True");
                    }
                    else{
                        System.out.println("False");
                    }
                }
            }
        }
    }
}