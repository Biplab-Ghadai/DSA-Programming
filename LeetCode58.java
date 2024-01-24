class demo{
    public static void main(String args[])
    {
        String str = "luffu is still joyboy";
        String words[] = str.split(" ");
        
        String word = words[words.length-1];
        System.out.println(word.length());
    }
}