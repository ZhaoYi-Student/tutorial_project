package com.company;

import com.company.algorithm.PartitionArrayDisjointIntervals;

public class Main {

    public static void main(String[] args) {
        PartitionArrayDisjointIntervals partitionArrayDisjointIntervals = new PartitionArrayDisjointIntervals();
        int[] ints = new int[]{5, 0, 3, 8, 6};
        int i = partitionArrayDisjointIntervals.partitionDisjoint(ints);
        System.out.println(i);
    }
}
