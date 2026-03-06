package Searching.BinarySearch.BinarySearchLeetCode;

public class RotationCountInRotatedSortedArray {

    public static void main(String[] args) {
        int arr[] = { 7, 9, 11, 12, 5 };
        System.out.println(count(arr));

    }

    public static int count(int[] nums) {
        int pivot = findcount(nums);
        if (pivot == -1)
            return 0;
        return pivot + 1;
    }

    public static int findcount(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            } else if (nums[mid] == nums[start] && nums[mid] == nums[end]) {
                if (nums[start] > nums[start + 1]) {
                    return start + 1;
                }
                start++;
                if (nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            } else if (nums[start] <= nums[mid]) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return -1;
    }
}
