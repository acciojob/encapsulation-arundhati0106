package com.driver;

public class Main {
    public static void main(String [] args) {
        RWOnly object = new RWOnly();
//        object.name() = "check"; //cant access as name is private
//        System.out.println(object.name);
        object.setName("check");
        System.out.println(object.getName());
    }

}