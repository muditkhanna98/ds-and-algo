package searching.linearSearch;

import java.util.Scanner;

/*Find Kth Character Position
Given a string s1, a character c1, and an integer k, find and print the position of the
        k
kth occurrence of the character c1 in the string s1. If the
k
kth occurrence does not exist, print -1.

Input Format
The first line contains the string s1, the character c1, and the integer k separated by spaces.
        Output Format
An integer representing the position of the
        k
kth occurrence of c1 in s1.
If the
kth occurrence does not exist, print -1.*/


public class FindKthPosition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s1 = scanner.next();
        char c1 = scanner.next().charAt(0);
        int k = scanner.nextInt();
        scanner.close();

        int count = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) == c1) {
                count++;
                if (count == k) {
                    System.out.println(i);
                    return;
                }
            }
        }

        System.out.println(-1);
    }
}
