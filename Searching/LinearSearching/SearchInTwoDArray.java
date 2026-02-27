package Searching.LinearSearching;

import java.util.Arrays;

public class SearchInTwoDArray {

    public static void main(String[] args) {
        int[][] arr = {
                { 23, 4, 1 },
                { 18, 12, 3, 9 },
                { 78, 99, 34, 56 },
                { 18, 12 }
        };
        System.out.println(Arrays.toString(linearSearch(arr, 34)));
    }

    public static int[] linearSearch(int[][] arr, int target) {
        if (arr.length == 0) {
            return new int[] {};
        }

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == target) {
                    return new int[] { i, j };
                }
            }

        }
        return new int[] {};

    }
}
