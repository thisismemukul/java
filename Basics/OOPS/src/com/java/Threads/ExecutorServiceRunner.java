package com.java.Threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Task extends Thread{
    private int number;
   public Task(int number){
       this.number=number;
   }
    public void run(){
        System.out.println("Task "+number+" started");

        for (int i = number*100;i<=number*100+99;i++){
            System.out.println(i+" ");
        }
        System.out.println("Task "+number+" Completed");
    }
}
public class ExecutorServiceRunner {
    public static void main(String[] args) {
//        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        executorService.execute(new Task1());
//        executorService.execute(new Thread(new Task2()));
        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new Task(1));
        executorService.execute(new Task(2));
        executorService.execute(new Task(3));
        executorService.execute(new Task(4));
        //Task 3
        for (int i =301;i<=399;i++){
            System.out.println(i+" ");
        }
        executorService.shutdown();
    }
}
