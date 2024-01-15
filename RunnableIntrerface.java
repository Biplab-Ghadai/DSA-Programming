class thread1 implements Runnable{
    @Override
    public void run(){
        while(true)
        {
            System.out.println("Thread 1 Running...");
        }
    }
}

class thread2 implements Runnable{
    @Override
    public void run(){
        while(true)
        {
            System.out.println("Thread 2 also Running...");
        }
    }
}

class demo{
    public static void main(String args[])
    {
        thread1 t1 = new thread1();
        Thread th1 = new Thread(t1);
        thread2 t2 = new thread2();
        Thread th2 = new Thread(t2);
        
        th1.start();
        th2.start();
    }
}