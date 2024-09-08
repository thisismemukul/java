public class Runnable implements java.lang.Runnable {
    public void run() {
        int i = 0;
        while (true) {
            System.out.println(i + " Hello");
            i++;
        }
    }
    public static void main(String[] args) {
        Runnable r = new Runnable();
        Thread t = new Thread(r);
        t.start();
        int i = 0;
        while (true) {
            System.out.println(i + " World");
            i++;
        }
    }
}
