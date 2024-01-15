class demo{
    public static void main(String args[])
    {
        int arr[] = {1,2, 3, 4, 5, 6, 7, 8, 9};
        int ser = 98;
        int low = 0;
        int high = arr.length;
        int mid = (low+high)/2;
        boolean flag = false;
        
        while(low <= high)
        {
            if(arr[mid] < ser)
            {
                low = mid + 1;
            }
            else if(arr[mid] == ser){
                System.out.println("Found at : "+ ++mid);
                flag = true;
                break;
            }
            else{
                high = mid - 1;
            }
            mid = (low+high)/2;
        }
    }
}