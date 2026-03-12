import java.util.Arrays;

public class SecondLargestElement {

    public static void main(String[] args) {
        int[] arr = { 5, 5, 5 };
        System.out.println("secondLargest :" + secondLargest(arr));
    }

    public static int secondLargest(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }
        Arrays.sort(arr);

        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] != arr[arr.length - 1]) {
                return arr[i];
            }
        }

        return -1;
    }

}
