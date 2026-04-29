package Sliding_Window;

public class SlidingWindowExpandShrink {
    public static void main(String[] args) {
        int[] nums = { 2, 3, 1, 2, 4, 3 };
        System.out.println(minSubArrayLen(7, nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int ans = Integer.MAX_VALUE;
        int w = 0;

        for (int right = 0; right < nums.length; right++) {
            w += nums[right];

            while (w >= target) {
                ans = Math.min(ans, (right - left) + 1);
                w -= nums[left];
                left++;
            }

        }

        return ans == Integer.MAX_VALUE ? 0 : ans;

    }
}
