package com.company.share.lockm;

public class Test1 {

    private static boolean flag = true;
    private static final Object obj = new Object();

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            while (flag) {

            }
        }).start();

        Thread.sleep(1000);

        new Thread(() -> {
            flag = false;
            System.out.println("false");
        }).start();
    }

}
