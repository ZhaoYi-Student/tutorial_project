package com.company.algorithm;

import java.util.Arrays;

/**
 * Given an array nums of n integers and an integer target, find three integers in nums such that the sum is closest to target. Return the sum of the three integers. You may assume that each input would have exactly one solution.
 * <p>
 * Example 1:
 * Input: nums = [-1,2,1,-4], target = 1
 * Output: 2
 * Explanation: The sum that is closest to the target is 2. (-1 + 2 + 1 = 2).
 * <p>
 * Constraints:
 * 3 <= nums.length <= 10^3
 * -10^3 <= nums[i] <= 10^3
 * -10^4 <= target <= 10^4
 */
public class SumClosest3 {

    public int threeSumClosest(int[] a, int target) {
        Arrays.sort(a);
        int min_diff = Integer.MAX_VALUE;
        int result = 0;

        int start = 0;
        int end = a.length - 1;
        while (start < end) {
            int sum = a[start] + a[end];

            int index = binarysearch(a, 0, a.length - 1, target - sum);
            index = findItem(a, start, end, index);
            sum += a[index];

            if (sum == target) return target;
            if (min_diff > Math.abs(target - sum)) {
                min_diff = Math.abs(target - sum);
                result = sum;
            }

            if (target > sum) start++;
            else end--;
        }

        return result;
    }

    private int findItem(int[] a, int start, int end, int index) {
        if (index != start && index != end) return index;

        int min = Integer.MAX_VALUE;
        int pre = index;
        int next = index;

        while (pre == start || pre == end) pre--;
        if (pre >= 0 && min > Math.abs(a[index] - a[pre])) min = Math.abs(a[index] - a[pre]);

        while (next == start || next == end) next++;

        return next < a.length && min >= Math.abs(a[index] - a[next]) ? next : pre;
    }


    int binarysearch(int[] a, int start, int end, int key) {
        int s = start;
        int e = end;
        while (start <= end) {
            int mid = start + ((end - start) >> 1);
            if (key == a[mid]) return mid;
            if (key < a[mid]) end = mid - 1;
            else start = mid + 1;
        }

        if (end < s) return s;
        if (start > e) return e;
        return Math.abs(key - a[end]) <= Math.abs(key - a[start]) ? end : start;
    }

}
