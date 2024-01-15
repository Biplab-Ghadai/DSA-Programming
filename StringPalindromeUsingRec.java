class demo{
    static boolean pal(String str, int i, int j)
    {
        char arr[] = str.toCharArray();
        
        if(i == j)
            return true;
        
        if(arr[i] != arr[j])
        {
            return false;
        }
        if(i < j+1)
            return pal(str, i+1, j-1);
            
        return true;
    }
    public static void main(String args[])
    {
        String str = "malayalam";
        int i=0, j=str.length()-1;
        pal(str, i, j);
        if(pal(str, i, j))
        {
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not Palindrome");
        }
    }
}