import java.util.Arrays;

class demo{
    public static void main(String args[])
    {
        String str = "aba";
        String str1 = "aa";
        
        char arr[] = str.toCharArray();
        char arr1[] = str1.toCharArray();
        int brr[] = new int[arr.length];
        int brr1[] = new int[arr1.length];
        boolean flag = false;
        
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
        
        for(int k=0; k<arr1.length; k++)
        {
            brr1[k] = 1;
            for(int l=k+1; l<arr1.length; l++)
            {
                if(arr1[k] == arr1[l])
                {
                    brr1[k]++;
                    arr1[l] = '@';
                }
            }
        }
        
        for(int i=0; i<brr.length; i++)
        {
            if(arr1[i] != '@')
            {
                if(arr[i]==arr1[i] && brr[i]==brr1[i])
                {
                    System.out.println("True");
                    break;
                }
            }
        }
        
    }
}