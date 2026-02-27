package Searching.LinearSearching;

public class SearchInRange {

    public static void main(String[] args) {

        int[] arr = { 18, 12, -7, 3, 14, 28 };
        System.out.println(linearSearch(arr, 1, 4, 3));
    }

    public static int linearSearch(int[] arr, int start, int end, int target) {

        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (target == arr[i]) {
                return i;
            }
        }

        return -1;
    }
}
