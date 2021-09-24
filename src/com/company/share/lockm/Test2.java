package com.company.share.lockm;

import java.util.ArrayList;
import java.util.List;

public class Test2 {

    private static int sum = 0;
    private static final Object obj = new Object();

    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = () -> {
            for (int i = 0; i < 1000; i++) {
                synchronized(obj){
                    sum++;
                }
            }
        };

        List<Thread> threadList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            Thread thread = new Thread(runnable);
            thread.start();
            threadList.add(thread);
        }

        for (Thread thread : threadList) {
            thread.join();
        }

        System.out.println("sum: "+sum);

    }

}
