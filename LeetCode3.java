class demo{
    public static void main(String args[])
    {
        String str = "abcabcbb";
        char arr[] = str.toCharArray();
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
        int count = 0;
        
        for(int i=0; i<brr.length; i++)
        {
            if(arr[i] != '@' )
            {
                count = count + 1;
            }
        }
        System.out.println(count);
    }
}