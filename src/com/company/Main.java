package com.company;

import com.company.algorithm.FirstMissingPositive;

public class Main {

    public static void main(String[] args) {
        FirstMissingPositive firstMissingPositive = new FirstMissingPositive();
        int i = firstMissingPositive.firstMissingPositive(new int[]{3,4,-1,1});
        System.out.println(i);
    }
}
