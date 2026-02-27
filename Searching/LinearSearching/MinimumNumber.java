package Searching.LinearSearching;

public class MinimumNumber {

    public static void main(String[] args) {
        int[] arr = { 18, 12, -7, 3, 14, 28 };
        System.out.println(minimumNumber(arr));
    }

    public static int minimumNumber(int[] arr) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }

        return min;
    }
}
