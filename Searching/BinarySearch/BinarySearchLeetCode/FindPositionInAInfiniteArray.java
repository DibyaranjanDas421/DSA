package Searching.BinarySearch.BinarySearchLeetCode;

public class FindPositionInAInfiniteArray {

    public static void main(String[] args) {
        int arr[] = { 3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170 };
        System.out.println(findingPosition(arr, 170));
    }

    public static int findingPosition(int[] nums, int target) {
        int start = 0;
        int end = 1;

        while (true) {
            try {
                if (nums[end] >= target) {
                    break;
                }
                int newStart = end + 1;
                end = end + (end - start + 1) * 2;
                start = newStart;
            } catch (ArrayIndexOutOfBoundsException e) {
                end = end / 2; // reduce to safe region
                break;
            }
        }

        return binarySearch(nums, target, start, end);
    }

    public static int binarySearch(int[] nums, int target, int start, int end) {
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (nums[mid] < target) {
                start = mid + 1;
            } else if (nums[mid] > target) {
                end = mid - 1;
            } else {
                return mid;
            }

        }
        return -1;

    }
}
