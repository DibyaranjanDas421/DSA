public class MaxInArray {

    public static int max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int value : arr) {
            if (max < value) {
                max = value;
            } else {
                return -1;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 23, 9, 18 };
        System.err.println(max(arr));
    }

}
