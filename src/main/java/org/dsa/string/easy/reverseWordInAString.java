package org.dsa.string.easy;

public class reverseWordInAString {
    public static void main(String[] args) {
        String s = "a good   example";
        s = s.trim();
        System.out.println(s);
        int end = s.length();
        StringBuilder ans = new StringBuilder();
        for(int i = s.length()-1; i >= 0 ; i--) {
            if(s.charAt(i) == ' ') {
                char cha = s.charAt(i);
                int n = (int) cha;
                String temp = s.substring(i+1,end);
                ans.append(temp+" ");
                end = i;
            }
        }
        ans.append(s.substring(0,end));
        System.out.println(ans);
    }
}
