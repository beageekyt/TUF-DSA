package org.dsa.string.easy;

import java.awt.image.ImageProducer;
import java.util.HashMap;
import java.util.Map;

public class IsomorphicString {
    public static void main(String[] args) {
        String s = "paper";
        String t = "title";
        Map<Character,Character> map = new HashMap<>();
        if(s.length()!= t.length()){
            System.out.println(false);
        }
        for (int i = 0 ; i < s.length();i++){
            if(map.containsKey(s.charAt(i))){
                Character c = map.get(s.charAt(i));
                if(!c.equals(t.charAt(i))){
                    System.out.println(false);
                    return;
                }
            } else if(map.containsValue(t.charAt(i))){
                System.out.println(false);
            }else {

                map.put(s.charAt(i), t.charAt(i));
            }
        }
        System.out.println(true);
    }
}
