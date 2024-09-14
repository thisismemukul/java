class MyThread extends Thread{
    public MyThread(String name){
        super(name);
        setPriority(Thread.MAX_PRIORITY);
    }
    public void run(){
        System.out.println("MyThread started");
        int i = 1;
        while(true){
            System.out.println("MyThread "+i++);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("MyThread interrupted"+e.getMessage());
            }
        }
    }
}
public class ConstructorThread {
    public static void main(String[] args) throws Exception {
        MyThread t = new MyThread("my thread 1");
        System.out.println(t.getName());
        System.out.println(t.getPriority());
        System.out.println(t.getState() );
        t.start();
        t.interrupt();
        System.out.println(t.isAlive());
        System.out.println(t.isDaemon());
        System.out.println(t.isInterrupted());
        System.out.println(t.getThreadGroup());
//        t.setDaemon(true);
//        Thread mainThread = Thread.currentThread();
//        mainThread.join();
        int i = 1;
        while(true){
            System.out.println("Main Thread "+i++);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                System.out.println("MyThread interrupted"+e.getMessage());
                Thread.yield();
            }
        }
    }
}

