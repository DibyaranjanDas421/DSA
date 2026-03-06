package Searching.BinarySearch.BinarySearchLeetCode;

import java.util.Arrays;

public class FindFirstandLastPositionofElement {
    public static void main(String[] args) {
        int[] nums = { 1, 2, 2 };
        System.out.println(Arrays.toString(searchRange(nums, 2)));
    }

    public static int[] searchRange(int[] nums, int target) {
        int[] ans = { -1, -1 };
        int start = search(nums, target, true);
        int end = search(nums, target, false);

        ans[0] = start;
        ans[1] = end;
        return ans;

    }

    public static int search(int[] nums, int target, boolean isFirst) {
        int start = 0;
        int end = nums.length - 1;
        int ans = -1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < target) {
                start = mid + 1;
            } else if (target < nums[mid]) {
                end = mid - 1;
            } else {
                ans = mid;
                if (isFirst) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }
}