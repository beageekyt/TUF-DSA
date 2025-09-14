package org.dsa.string.easy;

import java.util.Stack;

public class RemoveOutermostParentheses {
    public static void main(String[] args) {
        String str = "(()())()()(())";
        String temp = "";
        int openBraces = 0;
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if(c == '('){
                openBraces++;
            } else {
                openBraces--;
            }
            if(openBraces == 0) {
                ans = ans + temp.substring(1);
                temp = "";
                continue;
            }
            temp = temp + c;
        }
        System.out.println(ans);
    }
}
