package com.company.algorithm;

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

    public int threeSumClosest(int[] nums, int target) {
        int min = -1;
        int index = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            int value = nums[i - 1] + nums[i] + nums[i + 1];
            int sub = 0;
            if (value >= target) {
                sub = value - target;
            } else {
                sub = target - value;
            }
            if (min == -1) {
                min = sub;
            } else {
                min = Math.min(min, sub);
            }
        }
        return min;
    }

}
