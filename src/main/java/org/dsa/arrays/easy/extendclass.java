package org.dsa.arrays.easy;

import java.util.HashMap;
import java.util.HashSet;

public class extendclass extends abs{

    public static void main(String[] args) {
        abs obj1 = new extendclass();
        HashSet<Integer> sets = new HashSet<>();
        sets.add(1);

        HashMap<String, Integer> map  = new HashMap<>();

        obj1.print("surya");

    }

    @Override
    void print2(String s){
        System.out.println(s);
    }
    
    void print1(String s) {
        System.out.println("extended " + s);
    }



}
