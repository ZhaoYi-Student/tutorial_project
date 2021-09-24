package com.company.share;

import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class Study {

    private void example() {
        Hashtable<String, String> hashtable = new Hashtable<>();
        hashtable.put("111", "hello");
        hashtable.get("111");
        ConcurrentHashMap<String, String> concurrentHashMap = new ConcurrentHashMap<>();
        concurrentHashMap.put("111", "hello");
        concurrentHashMap.get("");
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        reentrantReadWriteLock.readLock().lock();
        reentrantReadWriteLock.writeLock().lock();
    }

}
