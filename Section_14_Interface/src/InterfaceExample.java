interface Test{
    void method1();
    void method2();
}

class My implements Test{

    @Override
    public void method1() {
        System.out.println("My method1");
    }

    @Override
    public void method2() {
        System.out.println("My method2");
    }
    public void method3() {
        System.out.println("My method3");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        Test test1;
        test1 = new My();
        test1.method1();
        test1.method2();
//        test1.method3();
        if (test1 instanceof My) {
            ((My) test1).method3();  // Outputs: "My method3"
        }
    }

}
