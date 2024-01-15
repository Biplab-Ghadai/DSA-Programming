// Write a program to find Frequency of an Array.

class demo{
    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 4, 7, 1, 2, 9, 12, 11};
        int brr[] = new int[arr.length];
        
        for(int i=0; i<arr.length; i++)
        {
            brr[i] = 1;
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[i] == arr[j])
                {
                    brr[i]++;
                    arr[j] = '@'; // It is used as a flag here.
                }
            }
        }
        for(int i =0;  i<brr.length; i++)
        {
            if(arr[i] != '@')
            {
                System.out.println(arr[i]+" => "+brr[i]);
            }
        }
    }
}