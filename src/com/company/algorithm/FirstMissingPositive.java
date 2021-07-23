package com.company.algorithm;

import java.util.Arrays;

/**
 * Given an unsorted integer array nums, find the smallest missing positive integer.
 * <p>
 * You must implement an algorithm that runs in O(n) time and uses constant extra space.
 * <p>
 * Example 1:
 * <p>
 * Input: nums = [1,2,0]
 * Output: 3
 * Example 2:
 * <p>
 * Input: nums = [3,4,-1,1]
 * Output: 2
 * Example 3:
 * <p>
 * Input: nums = [7,8,9,11,12]
 * Output: 1
 */
public class FirstMissingPositive {
    public int firstMissingPositive(int[] nums) {
        int[] arr=new int[nums.length+1];
        for (int num : nums) {
            if (num > 0 && num < arr.length){
                arr[num - 1]++;
            }

        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                return i+1;
            }
        }
        return 0;
    }
}
