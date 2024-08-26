package constructors;

public class Child extends Parent {
    public Child() {
        System.out.println("Child Constructor");
    }

    public Child(String name,int x) {
        super(x);
        System.out.println("Child Param Constructor "+ name);
    }
}
