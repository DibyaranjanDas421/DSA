import java.util.ArrayList;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {

    public static void main(String[] args) {
        int[] arr = { 2, 3, 5, 1, 3 };
        System.out.println(kidsWithCandies(arr, 3));
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>(candies.length);
        int max = max(candies);
        for (int i = 0; i < candies.length; i++) {
            if ((candies[i] + extraCandies) >= max) {
                result.add(i, true);
            } else {
                result.add(i, false);

            }
        }
        return result;
    }

    public static int max(int[] candies) {
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > max) {
                max = candies[i];
            }
        }

        return max;
    }

}
