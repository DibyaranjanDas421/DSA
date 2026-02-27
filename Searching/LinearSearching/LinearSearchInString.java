package Searching.LinearSearching;

public class LinearSearchInString {

    public static void main(String[] args) {
        String s = "Kunal";
        System.out.println(linearSearch(s, 'u'));
        System.out.println(linearSearch1(s, 'D'));

    }

    public static int linearSearch(String value, char target) {

        if (value.length() == 0) {
            return -1;
        }
        for (int i = 0; i < value.length(); i++) {
            if (target == value.charAt(i)) {
                return i;
            }
        }

        return -1;
    }

    public static boolean linearSearch1(String value, char target) {

        if (value.length() == 0) {
            return false;
        }
        for (char c : value.toCharArray()) {
            if (target == c) {
                return true;
            }
        }

        return false;
    }

}
