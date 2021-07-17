package com.srm.day23.java;

import java.util.function.Predicate;

public class PredefinedFunctional {

    public static void main(String[] args) {
        Predicate<Integer> p = (x) -> x>18;
        if(p.test(16))
        {
            System.out.println("You can vote.");
        }
        else
        {

            System.out.println("Voter age is not valid!!");
        }
    }
}