class demo{
    public static void main(String args[])
    {
        int arr[] = {3, 1, 3, 1};
        int n = arr.length;
        
        int brr[] = new int[arr.length];
        for(int i=0; i<arr.length; i++)
        {
            brr[i] = 1;
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    brr[i]++;
                    arr[j] = '@';
                }
            }
        }
        int max = brr[0];
        for(int i=0; i<brr.length; i++)
        {
            if(brr[i] > max)
            {
                max = brr[i];
            }
            if(arr[i] != '@' && max == brr[i])
            {
                if(max > (n/2))
                {
                    System.out.println(arr[i]);
                }
                else{
                    System.out.println("Not Available");
                    break;
                }
            }
        }
    }
}