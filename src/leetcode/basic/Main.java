package leetcode.basic;

import java.net.UnknownHostException;
import java.util.UUID;

public class Main {
    public static void main(String[] args) throws UnknownHostException {

        System.out.println(UUID.randomUUID());

    }

    public static boolean isPalindrome(String s) {
        boolean isPalnd;
        String givenText = s;
        String reversedResult = "";
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            reversedResult = ch + reversedResult;
        }
        System.out.println("Given text: " + givenText);
        System.out.println("Reversed text: " + reversedResult);
        if (givenText.equals(reversedResult)) {
            isPalnd = true;
        } else {
            isPalnd = false;
        }
        return isPalnd;
    }

    public static String reverse(String str) {
        String result = "";
        char ch;
        for (int i = 0; i < str.length(); i++) {
            ch = str.charAt(i);
            result = ch + result;
        }
        return result;
    }

    public static int fib(int n) {
        int firstTerm = 0;
        int secondTerm = 1;
        int nextTerm = 0;
        for (int i = 1; i <= n; i++) {
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
            System.out.println(firstTerm + ",");
        }
        return firstTerm;
    }


    public static int factorial(int num) {
        int factNum = 1;
        for (int i = factNum; i <= num; i++) {
            factNum = factNum * i;
            System.out.println("loop " + factNum);
        }
        return factNum;
    }

    public static int power(int base, int exponent) {
        int result = 1;
        for (int i = 1; i <= exponent; i++) {
            result = base * result;
        }
        return result;
    }
}
