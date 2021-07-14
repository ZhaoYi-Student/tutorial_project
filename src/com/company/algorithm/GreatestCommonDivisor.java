package com.company.algorithm;

public class GreatestCommonDivisor {

    public int getGreatest(int max, int min) {
        if ((max = max % min) != 0) min = getGreatest(min, max);
        return min;
    }

}
