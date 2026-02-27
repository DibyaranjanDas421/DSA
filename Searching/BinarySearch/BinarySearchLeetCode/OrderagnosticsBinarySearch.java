package Searching.BinarySearch;

public class OrderagnosticsBinarySearch {

    public static void main(String[] args) {
        int[] arr = { 26, 28, 20, 10, 6, 3, 4, 1 };
        int[] arr1 = { 2, 4, 6, 9, 11, 12, 14, 20, 28, 36 };

        System.out.println(binarySearch1(arr, 1));
    }

    public static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[start] < arr[end]) {
                if (arr[mid] == target) {
                    return mid;
                } else if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (arr[mid] == target) {
                    return mid;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return -1;
    }

    public static int binarySearch1(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        boolean isAsc = arr[start] < arr[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (arr[mid] == target) {
                return mid;
            }

            if (isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return -1;
    }

}
