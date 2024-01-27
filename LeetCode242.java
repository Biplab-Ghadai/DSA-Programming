import java.util.Arrays;
class demo{
    public static void main(String args[])
    {
        String str = "anagram";
        String str1 = "grmanaa";
        
        char arr[] = str.toCharArray();
        char arr1[] = str1.toCharArray();
        
        Arrays.sort(arr);
        Arrays.sort(arr1);
        
        if(Arrays.equals(arr, arr1))
        {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}