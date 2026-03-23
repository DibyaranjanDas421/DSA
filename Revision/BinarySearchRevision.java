package Revision;

public class BinarySearchRevision {
    public static void main(String[] args) {
        int[] nums = { 2, 1 };
        // System.out.println(searchInsert(nums, 2));

        int[] nums1 = { 9, 7, 3, 7, 8 };
        // System.out.println(findPeakElement(nums1));
        int[] nums3 = { 4, 5, 6, 7, 0, 1, 2 };
        // System.out.println(search(nums3, 0));
        int[] nums4 = { 1, 1, 2, 3, 3, 4, 4, 8, 8 };
        System.out.println(singleNonDuplicate(nums4));
    }

    public static int searchInsert(int[] nums, int target) {

        if (nums.length == 1) {
            if (nums[0] < target) {
                return 0 + 1;
            } else {
                return 0;
            }
        }
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return start;
    }

    public static int findPeakElement(int[] nums) {
        if (nums.length == 1) {
            return 0;
        }
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] < nums[mid + 1]) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return end;
    }

    public static int search(int[] nums, int target) {
        int pivot = findPivot(nums);
        if (pivot == -1) {
            return binarySearch(nums, 0, nums.length - 1, target);
        } else if (nums[pivot] == target) {
            return pivot;
        } else if (nums[0] <= target) {
            return binarySearch(nums, 0, pivot + 1, target);
        }

        return binarySearch(nums, pivot + 1, nums.length - 1, target);
    }

    public static int findPivot(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (start < end && nums[mid] > nums[mid + 1]) {
                return mid;
            } else if (start < mid && nums[mid] <= nums[start]) {
                end = mid - 1;
            } else {
                start = mid;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] nums, int start, int end, int target) {

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (mid % 2 != 0) {
                mid = mid--;
            }
            if (nums[mid] == nums[mid + 1]) {
                start = mid + 2;
            } else {
                end = mid;
            }
        }

        return nums[start];
    }

}
