class demo{
    public static void main(String args[])
    {
        String str = "luffy is con to joyboy";
        String words[] = str.split(" ");
        
        for(int i=words.length-1; i>=0; i--)
        {
            System.out.print(words[i]+" ");
        }
    }
}