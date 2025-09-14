package org.dsa.slidingWindowTwoPointer;

import java.util.HashMap;

public class LongestSubstringWithNonRepeatingCharactersWithMap {
    public static void main(String[] args) {
        String s = "abcabcdbb";
        int maxLength = 0;
        HashMap<String, Integer> map= new HashMap<>();
        int r = 0, l = 0;
        for (; r< s.length() ; r++ ) {
            String character = String.valueOf(s.charAt(r));
            if(map.containsKey(character) && map.get(character)>= l) {
                maxLength = Math.max(maxLength, r-l);
                l = map.get(character)+1;
            }
            map.put(character,r);
        }
        maxLength = Math.max(maxLength, r-l);
        System.out.println(maxLength);

    }
}
