package com.company.algorithm;

import java.util.Arrays;

/**
 * 正则表达式匹配
 */
public class RegularExpressionMatching {

    int[][] dp;

    public boolean isMatch(String s, String p) {
        int m = s.length(), n = p.length();
        dp = new int[m + 1][n + 1];

        for (int i = 0; i <= m; i++)
            Arrays.fill(dp[i], -1);

        return calc(s, p, m, n);
    }

    public boolean calc(String s, String p, int sLen, int pLen) {
        if (pLen == 0)
            return sLen == 0;
        if (sLen == 0)
            return p.charAt(pLen - 1) == '*' && calc(s, p, sLen, pLen - 2);
        if (s.charAt(sLen - 1) == p.charAt(pLen - 1) || p.charAt(pLen - 1) == '.') {
            return calc(s, p, sLen - 1, pLen - 1);
        } else if (p.charAt(pLen - 1) == '*') {
            if (s.charAt(sLen - 1) == p.charAt(pLen - 2) || p.charAt(pLen - 2) == '.') {
                return calc(s, p, sLen - 1, pLen);
            }
            return calc(s, p, sLen, pLen - 2);
        }
        return false;
    }

    // other people solve
    public boolean f(String s, String p, int m, int n) {
        if (n == 0)
            return m == 0;

        if (m == 0)
            return p.charAt(n - 1) == '*' && f(s, p, m, n - 2);

        if (dp[m][n] != -1)
            return dp[m][n] == 1;

        boolean res = false;

        if (s.charAt(m - 1) == p.charAt(n - 1) || p.charAt(n - 1) == '.') { // s = "mississippi", p = "mis*is*p*."
            res = f(s, p, m - 1, n - 1);
        } else if (p.charAt(n - 1) == '*') {
            if (s.charAt(m - 1) == p.charAt(n - 2) || p.charAt(n - 2) == '.')
                res = f(s, p, m - 1, n);

            res = res || f(s, p, m, n - 2);
        }

        dp[m][n] = res ? 1 : 0;
        return res;
    }

}
