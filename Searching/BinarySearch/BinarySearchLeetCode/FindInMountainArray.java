package Searching.BinarySearch.BinarySearchLeetCode;

public class FindInMountainArray {

    public static void main(String[] args) {
        int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
        System.out.println(search(arr, 0));

    }

    public static int search(int[] arr, int target) {
        int peak = peakIndexInMountainArray(arr);
        int ascindex = search(arr, target, 0, peak);

        if (ascindex != -1) {
            return ascindex;
        }
        return search(arr, target, peak, arr.length - 1);
    }

    public static int peakIndexInMountainArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    public static int search(int[] arr, int target, int start, int end) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] < target) {
                start = mid + 1;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

}
