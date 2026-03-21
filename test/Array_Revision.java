package test;

import java.util.Arrays;

public class Array_Revision {
    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        int[] nums = { 8, 1, 2, 2, 3 };
        int[] arr = { 2, 3, 5, 1, 3 };
        System.out.println(checkPangram(sentence));
        System.out.println(checkSorted(nums));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(nums)));
        System.out.println(Arrays.toString(kidsWiththeGreatestNumberofCandies(arr, 3)));
        reverse(nums);
        System.out.println(Arrays.toString(nums));

        int[] arr1 = { 1, 1, 2, 2, 3 };
        System.out.println(Arrays.toString(removeDuplicate(arr1)));
        int[] arr2 = { 5, 5, 5 };
        System.out.println(secondLargest(arr2));

    }

    public static boolean checkPangram(String s) {
        Boolean[] seen = new Boolean[26];

        for (char c : s.toCharArray()) {
            seen[c - 'a'] = true;
        }

        for (boolean b : seen) {
            if (!b) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkSorted(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            if (nums[start] < nums[start + 1]) {
                start++;
            } else {
                return false;
            }
        }
        return true;
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int count = 0;
        int result[] = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            count = 0;
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) {
                    count++;
                }
            }
            result[i] = count;
        }
        return result;
    }

    public static boolean[] kidsWiththeGreatestNumberofCandies(int[] nums, int extraCandies) {
        int max = max(nums);
        boolean[] result = new boolean[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] + extraCandies >= max) {
                result[i] = true;
            }
        }
        return result;
    }

    public static void reverse(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static int max(int[] nums) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            max = Math.max(nums[i], max);
        }
        return max;
    }

    public static int secondLargest(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        Arrays.sort(nums);
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != nums[nums.length - 1]) {
                return nums[i];
            }
        }
        return -1;
    }

    public static int[] removeDuplicate(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }
        return Arrays.copyOf(nums, j + 1);
    }
}
