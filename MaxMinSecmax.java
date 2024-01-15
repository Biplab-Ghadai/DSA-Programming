// Write a program to find Max, Min and Second max element in an Array.

class demo{
    public static void main(String args[])
    {
        int arr[] = {1, 3, 5, 6, 12, 11, 10, 8};
        int max = arr[0];
        int min = arr[0];
        int sec = arr[0];
        
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i] > max)
            {
                sec = max;
                max = arr[i];
            }
            if((arr[i] > sec) && (arr[i] != max))
            {
                sec = arr[i];
            }
            if(arr[i] < min)
            {
                min = arr[i];
            }
        }
        System.out.println("The Max element is : "+max);
        System.out.println("The Min element is : "+min);
        System.out.println("The second max element is : "+sec);
    }
}