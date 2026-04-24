package Sliding_Window;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class SlidingWindowFixedSize {

    public static void main(String[] args) {
        int[] nums = { 1, 12, -5, -6, 50, 3 };
        System.out.println(findMaxAverage(nums, 4));
        System.out.println(findMaxSum(nums, 4));

        int[] nums1 = { 7, 4, 3, 9, 1, 8, 5, 2, 6 };
        System.out.println(Arrays.toString(getAverages(nums1, 3)));

        int[] nums3 = { 1, 5, 4, 2, 9, 9, 9 };
        System.out.println(maximumSubarraySum(nums3, 3));

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

    // Maximum Sum of Distinct Subarrays With Length K
    public static long maximumSubarraySum(int[] nums, int k) {
        long windowSum = 0;
        long maxSum = 0;
        int right = 0;
        int left = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (right = 0; right < nums.length; right++) {
            map.put(nums[right], map.getOrDefault(nums[right], 0) + 1);
            windowSum += nums[right];

            if (right - left + 1 > k) {
                map.put(nums[left], map.get(nums[left]) - 1);

                if (map.get(nums[left]) == 0) {
                    map.remove(nums[left]);
                }
                windowSum -= nums[left];
                left++;
            }

            if (right - left + 1 == k && map.size() == k) {
                maxSum = Math.max(maxSum, windowSum);
            }
        }
        return maxSum;
    }

}
