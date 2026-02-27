package Searching.BinarySearch;

public class BinarySearchCode {

    public static void main(String[] args) {
        int[] arr = { 2, 4, 6, 9, 11, 12, 14, 20, 36, 28 };
        System.out.println(binarySearch(arr, 6));
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

}
