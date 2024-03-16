package com.java.Threads;

class Task1 extends Thread{
    public void run(){
        System.out.println("Task1 started");

        for (int i = 101;i<=199;i++){
            System.out.println(i+" ");
        }
        System.out.println("Task 1 Completed");
    }
}
class Task2 implements Runnable{
    public void run(){
        System.out.println("Task2 started");

        for (int i = 202;i<=299;i++){
            System.out.println(i+" ");
        }
        System.out.println("Task 2 Completed");
    }
}

public class ThreadBasicRunner {
    public static void main(String[] args) throws InterruptedException {
        //Task 1
        System.out.println("Task 1 kicked off");
        Task1 task1 = new Task1();
        task1.start();
        //Task 2
        System.out.println("Task 2 kicked off");
        Task2 task2 = new Task2();
        Thread task2Thread = new Thread(task2);//if using runnable interface
        task2Thread.start();
        task2Thread.setPriority(10);
//wait for task 1 to complete
        task1.join();

        //Task 3
        for (int i =301;i<=399;i++){
            System.out.println(i+" ");
        }
    }
}
