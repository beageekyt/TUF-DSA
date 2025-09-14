package org.dsa.slidingWindowTwoPointer;

public class CharacterReplacement {
    public static void main(String[] args) {
        String s = "AABABBA";
        int k = 1;
        int l = 0, r = 0, mf = 0, maxLength = 0;
        int[] freq = new int[25];
        while(r < s.length()) {
            freq[s.charAt(r) - 'A']++;
            int cf = freq[s.charAt(r) - 'A'];
            mf = Math.max(mf, cf);
            while ((r - l + 1) - mf > k){
                freq[s.charAt(l) - 'A']--;
                int newMf = 0;
                for (int i = 0;i<25;i++) {
                    newMf = Math.max(newMf, freq[i]);
                }
                mf = newMf;
                l++;
            }
            maxLength = Math.max(r - l + 1, maxLength);
            r++;
        }
        System.out.println(maxLength);
    }
}
