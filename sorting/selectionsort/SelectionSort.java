package sorting.selectionsort;

import java.util.Arrays;

public class SelectionSort {

    public static void main(String[] args) {
        int[] nums = { -32, -65, 0, 9 };
        selectionsort(nums);
        System.out.println(Arrays.toString(nums));
    }

    public static void selectionsort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int last = nums.length - i - 1;
            int max = max(nums, 0, last);
            swap(nums, max, last);
        }
    }

    public static int max(int[] nums, int start, int end) {
        int max = start;

        for (int i = 0; i <= end; i++) {
            if (nums[start] < nums[i]) {
                max = i;
            }
        }

        return max;
    }

    public static void swap(int[] nums, int first, int second) {
        int temp = nums[first];
        nums[first] = nums[second];
        nums[second] = temp;

    }
}
