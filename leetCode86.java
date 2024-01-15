
class demo{
    public static void main(String args[])
    {
        String str = "Uo";
        str.toLowerCase();
        char arr[] = str.toCharArray();
        int mid = arr.length/2;

        int h1 = 0, h2 = 0;
        
        if(arr.length == 0)
        {
            System.out.println(false);
        }
        else if(arr.length==1)
        {
            if((arr[0] == 'a' || arr[0] == 'e' ||arr[0] == 'i' ||arr[0] == 'o' ||arr[0] == 'u') && (arr[1] == 'a' || arr[1] == 'e' ||arr[1] == 'i' ||arr[1] == 'o' ||arr[1] == 'u'))
            {
                System.out.println(true);
            }
            else{
                System.out.println(false);
            }
        }
        
        for(int i=0; i<mid; i++)
        {
            if(arr[i] == 'a' || arr[i] == 'e' ||arr[i] == 'i' ||arr[i] == 'o' ||arr[i] == 'u')
            {
                h1 = h1 + 1;
            }
        }
        for(int i=mid; i<arr.length; i++)
        {
            if(arr[i] == 'a' || arr[i] == 'e' ||arr[i] == 'i' ||arr[i] == 'o' ||arr[i] == 'u')
            {
                h2 = h2 + 1;
            }
        }
        if(h1 == h2)
        {
            System.out.println(true);
        }
        else{
            System.out.println(false);
        }
    }
}