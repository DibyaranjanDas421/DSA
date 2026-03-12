
public class CheckIfArrayisSorted {

    public static void main(String[] args) {
        int[] arr = { 1 };
        System.out.println(isSorted(arr));
    }

    public static boolean isSorted(int[] arr) {

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            if (arr[start] <= arr[start + 1]) {
                start++;
            } else {
                return false;
            }
        }
        return true;
    }

}
