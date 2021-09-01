package com.company.algorithm;

/**
 * Given a non-negative integer c, decide whether there're two integers a and b such that a2 + b2 = c.
 * <p>
 * Example 1:
 * <p>
 * Input: c = 5
 * Output: true
 * Explanation: 1 * 1 + 2 * 2 = 5
 * Example 2:
 * <p>
 * Input: c = 3
 * Output: false
 * Example 3:
 * <p>
 * Input: c = 4
 * Output: true
 * Example 4:
 * <p>
 * Input: c = 2
 * Output: true
 * Example 5:
 * <p>
 * Input: c = 1
 * Output: true
 */
public class SumOfSquareNumbers {
    public static boolean judgeSquareSum(int c) {
        double sqrt = Math.sqrt(c);
        int finalSqrt = getFinalSqrt(c);
        if (finalSqrt*finalSqrt==c){
            return true;
        }else{
            return false;
        }
    }

    private static int getFinalSqrt(double sqrt) {
        if (sqrt - Math.floor(sqrt) == 0) {
            return (int) sqrt;
        } else {
            return getFinalSqrt(sqrt);
        }
    }
}
