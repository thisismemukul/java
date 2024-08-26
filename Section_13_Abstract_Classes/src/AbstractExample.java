class Super{
    public Super(){
        System.out.println("Super Constructor");
    }

    public void method1(){
        System.out.println("Super method1");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
            Super obj = new Super();
            obj.method1();
    }
}
