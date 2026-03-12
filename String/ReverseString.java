package String;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
        String s = "hello";
        char[] c = s.toCharArray();
        System.out.println(Arrays.toString(c));
        reverseString(c);
        System.out.println(Arrays.toString(c));
    }

    public static void reverseString(char[] s) {
        int start = 0;
        int end = s.length - 1;

        while (start < end) {
            char temp = s[start];
            s[start] = s[end];
            s[end] = temp;
            start++;
            end--;

        }
    }

}
