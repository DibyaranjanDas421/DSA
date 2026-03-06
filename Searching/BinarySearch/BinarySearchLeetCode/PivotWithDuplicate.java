package Searching.BinarySearch.BinarySearchLeetCode;

public class PivotWithDuplicate {
    public static void main(String[] args) {
        int[] nums = { 2, 2, 2, 3, 4, 2 };
        System.out.println(findpivot(nums));
    }

    public static int findpivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid < end && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (mid > start && nums[mid] < nums[mid - 1]) {
                return mid - 1;
            } else if (nums[start] == nums[end] && nums[mid] == nums[end]) {
                if (nums[start] > nums[start + 1]) {
                    return start;
                }
                start++;
                if (nums[end] < nums[end - 1]) {
                    return end - 1;
                }
                end--;
            }

            else if (nums[mid] < nums[start] || nums[start] == nums[mid] && nums[mid] > nums[end]) {
                start = mid + 1;
            } else {
                end = end - 1;
            }
        }
        return -1;
    }

}
