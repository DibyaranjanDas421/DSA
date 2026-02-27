package Searching.LinearSearching;

public class EvenOddDigit {

    public static void main(String[] args) {
        int[] arr = { 12, 345, 2, 6, 7896 };
        System.out.println(countkEven(arr));
        System.out.println(countDigit(-8888));
    }

    public static int countkEven(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (checkEven(arr[i])) {
                count++;
            }
        }
        return count;

    }

    public static int countDigit(int a) {

        if (a < 0) {
            a = a * -1;
        }
        int count = 0;
        while (a > 0) {
            a = a / 10;
            count++;
        }
        return count;
    }

    public static int countDigit1(int a) {

        if (a < 0) {
            a = a * -1;
        }

        return (int) (Math.log10(a)) + 1;
    }

    public static boolean checkEven(int count) {
        if (count % 2 == 0) {
            return true;
        }
        return false;
    }

}
