public class PracticingLoops {
    public static void main(String[] args) {
        int i = 1;
        PracticingLoops loops = new PracticingLoops();
        loops.callWhile(i);
        loops.callDoWhile(i);
    }

    public void callWhile(int i) {
        while (i < 100) {
            System.out.println(i);
            i *= 2;
        }
    }

    public void callDoWhile(int i) {
        do {
            System.out.println(i);
            i *= 2;
        } while (i < 100);
    }
}
