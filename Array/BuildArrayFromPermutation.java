import java.util.Arrays;

public class BuildArrayFromPermutation {

    public static void main(String[] args) {
        int[] nums = { 5, 0, 1, 2, 3, 4 };

        System.out.println(Arrays.toString(buildArray1(nums)));
    }

    public static int[] buildArray(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[nums[i]];
        }
        return arr;
    }

    public static int[] buildArray1(int[] nums) {

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] + nums.length * (nums[nums[i]] % nums.length);
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] / nums.length;
        }
        return nums;
    }

}
