import java.util.Arrays;
import java.util.Scanner;

public class TwoDArray {

    public static void main(String[] args) {
        int[][] arr = new int[3][2];
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter elements:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(Arrays.toString(arr[i]));
        }

    }

}
