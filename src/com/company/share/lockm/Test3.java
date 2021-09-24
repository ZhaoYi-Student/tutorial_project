package com.company.share.lockm;

import com.sun.corba.se.impl.orbutil.concurrent.Sync;

import java.util.concurrent.locks.ReentrantLock;

/**
 *
 */
public class Test3 {

    private static final ThreadLocal<Integer> sum = new ThreadLocal<>();
    private static final ReentrantLock lock = new ReentrantLock();

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                sum.set(1000);
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(sum.get());
            }
        }).start();

        lock.lockInterruptibly();
    }

}
