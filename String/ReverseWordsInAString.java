package String;

import java.util.Arrays;

public class ReverseWordsInAString {
    public static void main(String[] args) {
        String s = "the sky is blue";

        System.out.println(reverseWords(s));

    }

    public static String reverseWords(String s) {
        String s1=s.trim();
        String[] words = s1.split(" ");
        int start = 0;
        int end = words.length - 1;
        while (start < end) {
            String temp;
            temp = words[start];
            words[start] = words[end];
            words[end] = temp;
            start++;
            end--;
        }
        return String.join(" ", words);
    }
}

