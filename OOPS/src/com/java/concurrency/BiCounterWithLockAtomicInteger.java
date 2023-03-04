package com.java.concurrency;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLockAtomicInteger {
    private AtomicInteger i = new AtomicInteger();
    private AtomicInteger j = new AtomicInteger();
    public void incrementI(){
        //Get Lock for I
        i.incrementAndGet();
        //Release Lock for I
    }
    public int getI(){

        return i.get();
    }
    public void incrementJ(){
        //Get Lock for J
        j.incrementAndGet();
        //Release Lock for I
    }
    public int getJ(){
        return j.get();
    }
}
