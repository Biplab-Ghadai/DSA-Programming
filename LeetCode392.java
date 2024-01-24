class demo{
    public static void main(String args[])
    {
        String str = "deacbf";
        String str1 = "mlx";
        
        char arr[] = str.toCharArray();
        char arr1[] = str1.toCharArray();
        
        boolean flag = false;
        
        for(int i=0; i<arr1.length; i++)
        {
            
            for(int j=0; j<arr.length; j++)
            {
                // System.out.print(arr1[i]+"   ");
                // System.out.println(arr[j]);
                
                if(arr1[i] == arr[j])
                {
                    flag = true;
                }
            }
        }
        if(flag == true)
        {
            System.out.println("Present");
        }
        else{
            System.out.println("Not Present");
        }
    }
}
