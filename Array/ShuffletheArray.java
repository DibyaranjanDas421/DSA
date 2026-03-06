import java.util.Arrays;

public class ShuffletheArray {

    public static void main(String[] args) {
        int[] nums = { 2, 5, 1, 3, 4, 7 };
        System.out.println(Arrays.toString(shuffle(nums, 3)));
    }

    public static int[] shuffle(int[] nums, int n) {

        int[] shuffle = new int[nums.length];
        int pointer = 0;

        for (int i = 0; i < n; i++) {
            shuffle[pointer] = nums[i];
            shuffle[pointer + 1] = nums[i + n];

            pointer += 2;
        }

        return shuffle;
    }

}
