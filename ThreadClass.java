class Thread1 extends Thread{
    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("Thread 1...");
        }
    }
}
class Thread2 extends Thread{
    @Override
    public void run(){
        while(true)
        {
            System.out.println("Thread 2...");
        }
    }
}
class demo{
    public static void main(String args[])
    {
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        t1.start();
        t2.start();
    }
}