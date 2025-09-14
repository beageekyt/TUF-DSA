package org.dsa.recursion;

public class CalculatePower {
    public static void main(String[] args) {
        long n = 5;
        long a = 2;
        System.out.println(calculatePower(6, 2));
    }

    public static long calculatePower(long a, long n) {
        if(n == 0 ) return 1 ;
        long half = calculatePower(a, n/2);
        long result = half * half;
        if(n % 2 != 0)
            result = result * a;
        return result;
    }
}
