package searching.linearSearch;

import java.util.Scanner;

/*Find Smallest Absolute Difference
Write a program to find the element in an array with the smallest
absolute difference from a given integer k. If there are multiple elements with the same minimum difference, print the smallest of these elements.

        Input Format
The first line contains two integers n and k, where n is
the number of elements in the array and k is the integer against which to compare.
The second line contains
n
n integers separated by spaces, representing the elements of the array.
Output Format
Print the element in the array with the smallest difference from k.
If multiple elements have the same minimum difference, print the smallest of these elements.*/

public class SmallestAbsoluteDifference {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        scanner.close();

        int min_diff = Integer.MAX_VALUE;
        int result = Integer.MAX_VALUE;

        for (int i = 0; i < n; i++) {
            int diff = Math.abs(arr[i] - k);
            if (diff < min_diff || (diff == min_diff && arr[i] < result)) {
                min_diff = diff;
                result = arr[i];
            }
        }

        System.out.println(result);
    }
}
