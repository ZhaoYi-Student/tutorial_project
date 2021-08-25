package com.company.algorithm;

import java.util.LinkedList;
import java.util.concurrent.atomic.AtomicReference;

public class ArrayOfDoubledPairs {

    public boolean canReorderDoubled(int[] arr) {
        LinkedList<Integer> gtZero = new LinkedList<>();
        LinkedList<Integer> ltZero = new LinkedList<>();
        AtomicReference<Boolean> flag = new AtomicReference<>(Boolean.TRUE);
        for (int j : arr) {
            if (j > 0) {
                gtZero.add(j);
            } else if (j < 0) {
                ltZero.add(-j);
            }
        }
        gtZero.forEach(item -> {
            if (ltZero.contains(item)) {
                ltZero.removeIf(node -> node.equals(item));
            } else {
                flag.set(Boolean.FALSE);
            }
        });
        return flag.get();
    }

}
