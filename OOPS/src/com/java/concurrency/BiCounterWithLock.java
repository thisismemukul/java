package com.java.concurrency;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BiCounterWithLock {
    private int i = 0;
    private int j = 0;
    Lock lockforI = new ReentrantLock();
    Lock lockforJ = new ReentrantLock();
    public void incrementI(){
        //Get Lock for I
        lockforI.lock();
        i++;
        lockforI.unlock();
        //Release Lock for I
    }
    public int getI(){
        return i;
    }
    public void incrementJ(){
        //Get Lock for J
        lockforJ.lock();
        j++;
        lockforJ.unlock();
        //Release Lock for I
    }
    public int getJ(){
        return j;
    }
}
