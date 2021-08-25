package com.company.algorithm;

import java.math.BigDecimal;

/**
 * A complex number can be represented as a string on the form "real+imaginaryi" where:
 * <p>
 * real is the real part and is an integer in the range [-100, 100].
 * imaginary is the imaginary part and is an integer in the range [-100, 100].
 * i2 == -1.
 * Given two complex numbers num1 and num2 as strings, return a string of the complex number that represents their multiplications.
 * <p>
 * <p>
 * <p>
 * Example 1:
 * <p>
 * Input: num1 = "1+1i", num2 = "1+1i"
 * Output: "0+2i"
 * Explanation: (1 + i) * (1 + i) = 1 + i2 + 2 * i = 2i, and you need convert it to the form of 0+2i.
 * Example 2:
 * <p>
 * Input: num1 = "1+-1i", num2 = "1+-1i"
 * Output: "0+-2i"
 * Explanation: (1 - i) * (1 - i) = 1 + i2 - 2 * i = -2i, and you need convert it to the form of 0+-2i.
 */
public class ComplexNumberMultiplication {
    public String complexNumberMultiply(String num1, String num2) {
        String[] nums1 = splitByPlus(num1);
        String[] nums2 = splitByPlus(num2);
        return complexNumberOperation(nums1, nums2);
    }

    private String complexNumberOperation(String[] nums1, String[] nums2) {
        String i1 = nums1[1].substring(0, nums1[1].indexOf('i'));
        String i2 = nums2[1].substring(0, nums2[1].indexOf('i'));

        BigDecimal f = multiplication(nums1[0], nums2[0]);
        BigDecimal s = multiplication(i1, nums2[0]).add(multiplication(nums1[0], i2));
        BigDecimal t = multiplication(i1, i2).multiply(BigDecimal.valueOf(-1));

        String r1 = String.valueOf(f.add(t));
        return r1 + "+" + s + "i";
    }

    private BigDecimal multiplication(String s1, String s2) {
        return new BigDecimal(s1).multiply(new BigDecimal(s2));
    }

    private String[] splitByPlus(String num1) {
        return num1.replace('+', ',').split(",");
    }
}
