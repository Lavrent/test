package com.aca.test;

public class Test {
    public static void main(String[] args) {
        IntegerWrapper obj1 = new IntegerWrapper(50);
        IntegerWrapper obj2 = new IntegerWrapper(25);
        IntegerWrapper.swap(obj1, obj2);
        System.out.println(obj1.getNumber());
        System.out.println(obj2.getNumber());
    }
}
