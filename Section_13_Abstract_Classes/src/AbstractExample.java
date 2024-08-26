abstract class Super{
    public Super(){
        System.out.println("Super Constructor");
    }

    public void method1(){
        System.out.println("Super method1");
    }

    public abstract void method2();
}

class  Sub extends Super{
    public Sub(){
        System.out.println("Sub Constructor");
    }
    public void method2(){
        System.out.println("Sub method2");
    }
}

public class AbstractExample {
    public static void main(String[] args) {
            Super obj = new Sub();
            obj.method1();
            obj.method2();
    }
}
