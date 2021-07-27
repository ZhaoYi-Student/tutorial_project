package com.company;

import com.company.algorithm.FirstMissingPositive;
import com.company.algorithm.SumClosest3;
import com.company.pojo.Person;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("zhangsan1", "18");
        Person p2 = new Person("zhangsan2", "18");
        Person p3 = new Person("zhangsan3", "18");
        Person p4 = new Person("zhangsan4", "18");
        Person p5 = new Person("zhangsan5", "18");
        Person p6 = new Person("zhangsan6", "18");
        ArrayList<Person> arrayList = new ArrayList<>();
        arrayList.add(p1);
        arrayList.add(p2);
        arrayList.add(p3);
        arrayList.add(p4);
        arrayList.add(p5);
        arrayList.add(p6);
        arrayList.forEach(System.out::println);
        arrayList.removeIf(person -> person.getName().equals("zhangsan1"));
        System.out.println("after -------------------------- ");
        arrayList.forEach(System.out::println);
    }
}
