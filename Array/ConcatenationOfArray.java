import java.util.Arrays;

public class ConcatenationOfArray {

    public static void main(String[] args) {
        int[] nums = { 1, 3, 2, 1 };

        System.out.println(Arrays.toString(getConcatenation(nums)));
    }

    public static int[] getConcatenation(int[] nums) {

        int[] ans = new int[nums.length * 2];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
        }
        int count = nums.length - 1;
        for (int i = nums.length; i < ans.length; i++) {
            ans[i] = nums[nums.length - 1 - count];
            count--;
        }

        return ans;

    }
}
