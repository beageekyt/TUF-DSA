package org.dsa.string.easy;

public class SmallestSubstring {
    public static void main(String[] args) {
        String[] strs = {"flower", "flow", "flight"};
        String smallestString = strs[0];
        String ans = "";
        int flag = 0;
        for (int i = 1; i < strs.length; i++) {
            if (smallestString.length() > strs[i].length()) {
                smallestString = strs[i];
            }
        }
        System.out.println(smallestString);
        for (int i = 1; i <= smallestString.length();i++){
            String sub = smallestString.substring(0,i);
            for (int j = 0;j < strs.length; j++){
                if (!strs[j].startsWith(sub)){
                    flag = 1;
                    break;
                }
            }
            if(flag == 1){
                break;
            }
            ans = sub;
        }
        System.out.println(ans);
    }
}
