import java.util.Arrays;

public class ReverseArray {

    public static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            arr[start] = arr[start] + arr[end];
            arr[end] = arr[start] - arr[end];
            arr[start] = arr[start] - arr[end];

            start++;
            end--;
        }

    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 23, 9, 18 };
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.err.println(Arrays.toString(arr));

    }
}
