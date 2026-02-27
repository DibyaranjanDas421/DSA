package Searching.BinarySearch.BinarySearchLeetCode;

public class FloorNumber {

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 9, 14, 16, 18 };
        System.err.println(floorNumber(arr, 6));
    }

    public static int floorNumber(int arr[], int target) {
        int start = 0;
        int end = arr.length - 1;

        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target == arr[mid]) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] > target) {
                    end = end - 1;
                } else {
                    start = start - 1;
                }
            }

        }
        return end;
    }

}
