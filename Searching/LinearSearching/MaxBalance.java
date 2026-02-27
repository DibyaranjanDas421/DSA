package Searching.LinearSearching;

public class MaxBalance {

    public static void main(String[] args) {
        int[][] arr = {
                { 1, 2, 3 },
                { 3, 2, 1 }
        };
        System.out.println(maxBalance(arr));
    }

    public static int maxBalance(int[][] arr) {

        int max = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                sum += arr[i][j];
            }
            if (sum > max) {
                max = sum;
            }
            sum = 0;
        }

        return max;
    }

}
