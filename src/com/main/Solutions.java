package com.main;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Solutions {
    public static void main(String[] args) {
        Solutions object = new Solutions();
        System.out.println( object.printFibboTillN(1,1,100, null));
        System.out.println(object.frequencyCounter("quick fox lazy dog quick donkey fire fox"));
    }


    private void fizzbuzz(int n){
        if((n % 3 == 0) && (n % 5 ==0))
            System.out.print("FIZZBUZZ ");
        else if(n % 3 == 0)
            System.out.print("FIZZ ");
        else if(n % 5 == 0)
            System.out.print("BUZZ ");
    }

    private LinkedHashSet<Integer> printFibboTillN(int a, int b, int n, LinkedHashSet<Integer> list){
        int c = b;
        if(b >= n)
            return list;
        else{
            if(list == null)
                list = new LinkedHashSet<Integer>();

            list.add(a);
            list.add(b);

            return printFibboTillN(b, (a+b), n, list);
        }
    }

    private HashMap frequencyCounter(String s){
        HashMap<String, Integer> map = new HashMap();
        String[] words = s.split( "\\W+");
        for(String word : words){
            if(map.containsKey(word)){
                if(map.get(word) != null)
                    map.put(word, map.get(word).intValue() + 1);
                else
                    map.put(word, 1);
            }else
                map.put(word, 1);
        }
        return map;
    }
}

