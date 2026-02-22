import java.util.ArrayList;
import java.util.Scanner;

public class DynamicArray {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            arr.add(new ArrayList<>());
        }

        System.out.println("Enter elements:");
        for (int i = 0; i < 3; i++) {

            for (int j = 0; j < 3; j++) {
                arr.get(i).add(sc.nextInt());
            }
        }

        System.out.println(arr);
    }

}
