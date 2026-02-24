package Searching.LinearSearching;

public class SquareRoot {

    public static void main(String[] args) {

        System.out.println(mySqrt(10));
    }

    public static double mySqrt(int x) {
        double number = x;
        double guss = x / 2;
        double epsilon = 0.0001;

        while (Math.abs(guss * guss - number) > epsilon) {
            guss = (guss + 10 / guss) / 2;
        }

        return guss;
    }
}
