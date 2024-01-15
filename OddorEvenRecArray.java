class demo{
    static void rec(int arr[], int i)
    {
        if(i >= arr.length)
        {
            return ;
        }
        int num = arr[i];
        if(num%2 == 0)
        {
            System.out.println(num +" : Odd");
        }
        else{
            System.out.println(num+" : Even");
        }
        rec(arr, i+1);
    }
    public static void main(String args[])
    {
        int arr[] = {1,2, 3, 4, 5, 6, 7, 8, 9};
        int i=0;
        rec(arr, i);
    }
}