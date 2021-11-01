package com.company;

import com.company.expand.entity.ContractEntity;
import com.company.expand.factory.ContractFactory;
import com.company.expand.factory.simple.MarketContractSimple;

import java.util.concurrent.TimeUnit;

public class Main {

    private volatile static boolean valve = true;

    public static void main(String[] args) throws InterruptedException {
        new Thread(() -> {
            while(valve){

            }
        }).start();
        TimeUnit.SECONDS.sleep(1);
        new Thread(() -> {
            valve=false;
            System.out.println("valve is false");
        }).start();
    }
}
