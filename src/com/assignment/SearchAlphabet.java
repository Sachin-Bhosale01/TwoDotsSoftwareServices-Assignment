package com.assignment;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchAlphabet {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string:");
        String inputLine = scanner.nextLine();

        List<Character> alphabets = new ArrayList<Character>();

        for (char c = 'a'; c <= 'z'; c++) {
            alphabets.add(c);
        }

        char[] strChar = inputLine.toLowerCase().toCharArray();

        List<Character> alphabetCopy = new ArrayList<Character>(alphabets);

        for (char ch : strChar) {
            alphabetCopy.remove(Character.valueOf(ch));
        }

        if (alphabetCopy.isEmpty()) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
