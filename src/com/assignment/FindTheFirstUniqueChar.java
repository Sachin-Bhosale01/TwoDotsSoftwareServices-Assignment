package com.assignment;
import java.util.Scanner;

public class FindTheFirstUniqueChar {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your String");
		String inputLine = scanner.nextLine();
		System.out.println(findTheFirstUniqueChar(inputLine));
	}
	public static char  findTheFirstUniqueChar(String input) {
	    boolean unique;
	    int count = input.length();
	    char[] chars = input.toCharArray();
	    for (int i = 0; i < input.length(); i++) {
	        unique = true;
	        for (int j = 0; j < input.length(); j++) {
	            count--;
	            char c = chars[i];
	            if (i != j && c == chars[j]) {
	                unique = false;
	                break;
	            }
	        }
	        if (unique) {
	            return input.charAt(i);
	        }
	    }
	    return (0);
	}

}
