package org.dsa.slidingWindowTwoPointer;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithNonRepeatingCharacters {
    public static void main(String[] args) {
        String str = "abcabcdba";
        int length = 0;
        int longestSubstrSize = 0;
        Set<Character> characterSet = new HashSet<>();
        for(int i =0 ;i < str.length();i++) {
            Character ch = str.charAt(i);
            if(characterSet.contains(ch)) {
                longestSubstrSize = Math.max(longestSubstrSize, length);
                length = 1;
                characterSet.clear();
            } else {
                length++;
            }
            characterSet.add(ch);
        }
        longestSubstrSize = Math.max(longestSubstrSize, length);
        System.out.println(longestSubstrSize);

    }
}
