class MyData{
    void display(String str){
        for(int i=0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
}

class MyThread1 extends Thread{
    MyData d;
    MyThread1(MyData d){
        this.d=d;
    }
    public void run(){
        d.display("mukul");
    }
}
class MyThread2 extends Thread{
    MyData d;
    MyThread2(MyData d){
        this.d=d;
    }
    public void run(){
        d.display("saini");
    }
}

public class WhySynchronisation {
    public static void main(String[] args) {
        MyData d = new MyData();
        d.display("Mukul");
        MyThread1 m1 = new MyThread1(d);
        MyThread2 m2 = new MyThread2(d);
        m1.start();
        m2.start();
    }
}
