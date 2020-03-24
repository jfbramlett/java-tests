package com.bramlettny.alpha.test4;

public class Test4 {

    public static int reverse(int orig) {
        int result = 0;
        do {
            int digit = orig % 10;
            orig = orig / 10;
            if (result == 0) {
                result = digit;
            } else {
                result = (result * 10) + digit;
            }
        } while (orig != 0);

        return result;
    }


    public static void main(String[] args) {
        int val = 12389010;
        int rev = reverse(val);

        System.out.println("Reverse of " + val + " is " + rev);
    }
}
