package org.example;


import java.util.Deque;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println(checkForPalindrome("Racecar"));
        System.out.println(convertDecimalToBinary(13));// true

    }
    public static boolean checkForPalindrome(String input) {
        Deque<Character> deque = new LinkedList<>();
        String clean = input.toLowerCase().replaceAll("[^a-z0-9]", "");

        for (char ch : clean.toCharArray()) {
            deque.addLast(ch);
        }
        while (deque.size() > 1) {
            if (deque.removeFirst() != deque.removeLast()) {
                return false;
            }
        }
        return true;
    }
    public static String convertDecimalToBinary(int number) {
        if (number == 0) return "0";

        StringBuilder binary = new StringBuilder();
        while (number > 0) {
            binary.insert(0, number % 2);
            number /= 2;
        }
        return binary.toString();
    }
}
