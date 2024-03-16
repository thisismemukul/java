package com.java.Threads;

import java.util.List;
import java.util.concurrent.*;

class CollableTask implements Callable<String>{
private String name;
    public CollableTask(String name){
        this.name=name;
    }

    @Override
    public String call() throws Exception {
        Thread.sleep(1000);
        return "hello"+name;
    }
}

public class CollableRunner {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService= Executors.newFixedThreadPool(1);
        List<CollableTask> tasks = List.of(new CollableTask("mukul"),new CollableTask("abc"));
//        Future<String> welcomeFuture = executorService.submit(new CollableTask("mukul"));
        List<Future<String>> results= executorService.invokeAll(tasks);
        for (Future<String> result:results){
            System.out.println(result.get());
        }
        System.out.println("new CollableTask(\"mukul\") Completed");
//        String welcomeMessage = welcomeFuture.get();
//        System.out.println(welcomeMessage);
        System.out.println("Main completed");
        executorService.shutdown();
    }
}
