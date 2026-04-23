package Sliding_Window;

import java.util.Arrays;

public class SlidingWindowFixedSize {

    public static void main(String[] args) {
        int[] nums = { 1, 12, -5, -6, 50, 3 };
        System.out.println(findMaxAverage(nums, 4));
        System.out.println(findMaxSum(nums, 4));

        int[] nums1 = { 7, 4, 3, 9, 1, 8, 5, 2, 6 };
        System.out.println(Arrays.toString(getAverages(nums1, 3)));

    }

    // Maximum Average Subarray I
    public static double findMaxAverage(int[] nums, int k) {
        int currentMax = 0;
        int max;

        for (int i = 0; i < k; i++) {
            currentMax += nums[i];
        }

        max = currentMax;

        for (int i = 0; i < nums.length - k; i++) {
            currentMax = currentMax - nums[i] + nums[k + i];
            max = Math.max(max, currentMax);
        }

        return (double) max / k;
    }

    // Maximum Sum Subarray of Size K
    public static double findMaxSum(int[] nums, int k) {
        int currentMax = 0;
        int max;

        for (int i = 0; i < k; i++) {
            currentMax += nums[i];
        }

        max = currentMax;

        for (int i = 0; i < nums.length - k; i++) {
            currentMax = currentMax - nums[i] + nums[k + i];
            max = Math.max(max, currentMax);
        }

        return max;
    }

    // K Radius Subarray Averages
    public static int[] getAverages(int[] nums, int k) {
        int[] avg = new int[nums.length];
        Arrays.fill(avg, -1);
        long sum = 0;

        int windowSize = k * 2 + 1;

        for (int i = 0; i < windowSize; i++) {
            sum += nums[i];
        }

        avg[k] = (int) (sum / windowSize);

        for (int i = 0; i < nums.length - windowSize; i++) {
            sum = sum - nums[i] + nums[windowSize + i];

            avg[1 + k + i] = (int) (sum / windowSize);

        }

        return avg;
    }

}
