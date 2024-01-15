// Return an array that contains the exact same numbers as the given array, but rearranged so that 
// all the zeros are grouped at the start of the array. The order of the non-zero numbers does not 
// matter. So {1, 0, 0, 1} becomes {0 ,0, 1, 1}. You may modify and return the given array or 
// make a new array.


// zeroFront([1, 0, 0, 1]) → [0, 0, 1, 1]
// zeroFront([0, 1, 1, 0, 1]) → [0, 0, 1, 1, 1]
// zeroFront([1, 0]) → [0, 1]

class demo{
    public static void main(String args[])
    {
        int arr[] = {0, 1, 1, 0, 1};
        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] != 0)
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
            System.out.print(arr[i]+" ");
        }
    }
}