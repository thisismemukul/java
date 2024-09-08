public class TestMultithread extends Thread {

    public void run() {
        int i = 0;
        while (true) {
            System.out.println(i + " Hello");
            i++;
        }
    }

    public static void main(String[] args) {
        TestMultithread test = new TestMultithread();
        test.start();
        int i = 0;
        while (true) {
            System.out.println(i + " World");
            i++;
        }
    }
}
