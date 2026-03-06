package Searching.BinarySearch.BinarySearchLeetCode;

public class SplitArrayLargestSum {

    public static void main(String[] args) {
        int[] nums = { 7, 2, 5, 10, 8 };
        System.out.println(splitArray(nums, 2));
    }

    public static int splitArray(int[] nums, int k) {

        int start = 0, end = 0, ans = 0;

        for (int i = 0; i < nums.length; i++) {
            end += nums[i];
            start = Math.max(start, nums[i]);
        }

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (isPossible(nums, mid, k)) {
                ans = mid;
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return ans;
    }

    public static boolean isPossible(int[] nums, int maxAllocation, int k) {
        int painter = 1;
        int time = 0;
        for (int i = 0; i < nums.length; i++) {
            if (time + nums[i] <= maxAllocation) {
                time += nums[i];
            } else {
                painter++;
                time = nums[i];
            }
        }

        if (painter <= k) {
            return true;
        }

        return false;
    }
}
