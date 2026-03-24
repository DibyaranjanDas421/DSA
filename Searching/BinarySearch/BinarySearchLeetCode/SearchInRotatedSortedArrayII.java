package Searching.BinarySearch.BinarySearchLeetCode;

public class SearchInRotatedSortedArrayII {

    public static void main(String[] args) {

        int[] nums = { 1, 0, 1, 1, 1 };
        System.out.println(search(nums, 0));

    }

    public static boolean search(int[] nums, int target) {
        int pivot = pivot(nums);

        if (pivot == -1) {
            return binarySearch(nums, target, 0, nums.length - 1);
        } else if (target <= nums[0]) {
            return binarySearch(nums, target, 0, pivot + 1);
        }
        return binarySearch(nums, target, pivot, nums.length - 1);
    }

    public static int pivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (start > end && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (start > end && nums[start] <= nums[end]) {
                end = mid;
            } else {
                start = mid + 1;
            }

        }
        return -1;
    }

    public static boolean binarySearch(int[] nums, int target, int start, int end) {

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return true;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return false;
    }

}
