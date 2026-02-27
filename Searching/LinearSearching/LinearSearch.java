package Searching.LinearSearching;

public class LinearSearch {

    public static void main(String[] args) {
        int[] nums = { 23, 45, 1, 2, 8, 19, -3, 16, -11, 28 };
        System.out.println(linearSearch1(nums, 20));
    }

    // find index
    public static int linearSearch(int arr[], int target) {

        if (arr.length == 0) {
            return -1;
        }
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int linearSearch1(int arr[], int target) {

        if (arr.length == 0) {
            return Integer.MAX_VALUE;
        }
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                return arr[i];
            }
        }
        return Integer.MAX_VALUE;
    }

}
