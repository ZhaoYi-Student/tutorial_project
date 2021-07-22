package com.company.algorithm;

import java.util.ArrayList;

/**
 * Given an array nums, partition it into two (contiguous) subarrays left and right so that:
 * <p>
 * Every element in left is less than or equal to every element in right.
 * left and right are non-empty.
 * left has the smallest possible size.
 * Return the length of left after such a partitioning.  It is guaranteed that such a partitioning exists.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [5,0,3,8,6]
 * Output: 3
 * Explanation: left = [5,0,3], right = [8,6]
 * Example 2:
 * <p>
 * Input: nums = [1,1,1,0,6,12]
 * Output: 4
 * Explanation: left = [1,1,1,0], right = [6,12]
 */
public class PartitionArrayDisjointIntervals {

    public int partitionDisjoint(int[] nums) {
        if (nums.length == 0) return 0;

        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> mid = new ArrayList<>();

        int leftMax = nums[0];
        int rightMax = 0;
        boolean valve = false;

        for (int i = 0; i < nums.length; i++) {

            int num = nums[i];

            if (i == 0) {
                left.add(num);
                continue;
            }

            if (num < leftMax) {
                if (valve) {
                    left.addAll(mid);
                    mid.clear();
                    if (leftMax < rightMax) leftMax = rightMax;
                    valve = false;
                }
                left.add(num);
            } else {
                if (num > rightMax) rightMax = num;
                mid.add(num);
                valve = true;
            }
        }
        return left.size();
    }
}
