package com.yr;

public class PalindromicPrimeNumber {

    //回文素数：所谓回文数就是顺着读和倒着读一样的数(例如：11，121，1991…)，回文素数就是既是回文数又是素数(只能被1和自身整除的数)的数。编程找出11～9999之间的回文素数
    public static void main(String[] args) {
        for (int i = 11; i <= 9999; i++) {
            if (isPrime(i) && isPalindromic(i)) {
                System.out.println(i);
            }
        }
    }

    public static boolean isPrime(int n) {
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isPalindromic(int n) {
        int temp = n;
        int sum = 0;
        while (temp > 0) {
            sum = sum * 10 + temp % 10;
            temp /= 10;
            //temp = temp / 10;
        }
        return sum == n;
    }
}
