package Searching.BinarySearch.BinarySearchLeetCode;

import java.util.Arrays;

public class FindRightInterval {

    public static void main(String[] args) {
        int[][] intervals = {
                { 1, 4 },
                { 2, 3 },
                { 3, 4 }
        };
        System.out.println(Arrays.toString(findRightInterval(intervals)));
    }

    public static int[] findRightInterval(int[][] intervals) {
        int minStart = Integer.MAX_VALUE;
        int minIndex = -1;
        int[] result = new int[intervals.length];

        for (int i = 0; i < result.length; i++) {
            for (int j = 0; j < result.length; j++) {
                if (intervals[i][1] <= intervals[j][0]) {
                    if (intervals[j][0] < minStart) {
                        minStart = intervals[j][0];
                        minIndex = j;
                    }
                } else {
                    minIndex = -1;
                }

            }
            result[i] = minIndex;

        }

        return result;
    }

}
