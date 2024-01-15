// We'll say that an element in an array is "alone" if there are values before and after it,
// and those values are different from it. Return a version of the given array where every 
// instance of the given value which is alone is replaced by whichever value to its left or 
// right is larger.


// notAlone([1, 2, 3], 2) → [1, 3, 3]
// notAlone([1, 2, 3, 2, 5, 2], 2) → [1, 3, 3, 5, 5, 2]
// notAlone([3, 4], 3) → [3, 4]

class demo{
    public static void main(String args[])
    {
        int arr[] = {1, 2, 3, 2, 5, 2};
        int am = 2;
        for(int i=0; i<arr.length; i++)
        {
            if(arr[i]==am)
            {
                if((arr[i-1] > arr[i]) && (arr[i+1] < arr[i-1]))
                {
                    arr[i] = arr[i-1];
                }
                else if((arr[i+1] > arr[i]) && (arr[i-1] < arr[i+1])){
                    arr[i] = arr[i+1];
                }
                
            }
            System.out.print(arr[i]+" ");
        }
    }
}