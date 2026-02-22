import java.util.Arrays;

public class SwapIndex {

    public static void swap(int[] arr, int idx1, int idx2) {
        arr[idx1] = arr[idx1] + arr[idx2];
        arr[idx2] = arr[idx1] - arr[idx2];
        arr[idx1] = arr[idx1] - arr[idx2];
    }

    public static void main(String[] args) {
        int[] arr = { 1, 3, 23, 9, 18 };

        System.out.println(Arrays.toString(arr));

        swap(arr, 1, 3);

        System.out.println(Arrays.toString(arr));

    }

}
