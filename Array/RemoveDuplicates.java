import java.util.Arrays;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int arr[] = { 1, 1, 2, 2, 3 };
        System.out.println(Arrays.toString(removeDuplicate(arr)));
    }

    public static int[] removeDuplicate(int arr[]) {

        int j = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        return Arrays.copyOf(arr, j + 1);
    }
}
