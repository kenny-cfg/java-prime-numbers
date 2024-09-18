package org.wenny.kenny;

public class Main {
    public static void main(String[] args) {
        System.out.println(isPrimeNumber(2)); // True
        System.out.println(isPrimeNumber(4)); // False
        System.out.println(isPrimeNumber(37)); // True
    }

    public static boolean isPrimeNumber(int number) {
        for (var i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}