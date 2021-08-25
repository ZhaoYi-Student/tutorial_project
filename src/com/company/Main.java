package com.company;

import com.company.algorithm.ComplexNumberMultiplication;
import com.company.algorithm.SumClosest3;
import com.company.pojo.Person;

public class Main {

    public static void main(String[] args) {
        ComplexNumberMultiplication complexNumberMultiplication = new ComplexNumberMultiplication();
        String s = complexNumberMultiplication.complexNumberMultiply("1+-1i", "0+0i");
        System.out.println(s);
    }
}
