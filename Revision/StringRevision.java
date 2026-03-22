package Revision;

public class StringRevision {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));

        String sentence = "hello";

        System.out.println(reverse(sentence));

        String s1 = "the sky is blue";
        System.out.println(reverseWords(s1));

        String word2 = "abcd", word1 = "pq";

        System.out.println(mergeString(word1, word2));

        String[] strs = { "flower", "flow", "flight" };

        System.out.println(longestCommonPrefix(strs));

    }

    public static boolean isPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;
        while (start < end) {
            while (start < end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while (end < s.length() && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }

            if (Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }

            start++;
            end--;
        }
        return true;
    }

    public static String reverse(String s) {
        char[] c = s.toCharArray();

        int start = 0;
        int end = c.length - 1;

        while (start < end) {
            char temp = c[start];
            c[start] = c[end];
            c[end] = temp;
            start++;
            end--;
        }

        return new String(c);
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        int start = 0;
        int end = words.length - 1;
        while (start < end) {
            String temp = words[start];
            words[start] = words[end];
            words[end] = temp;

            start++;
            end--;
        }

        return String.join(",", words);
    }

    public static StringBuilder mergeString(String word1, String word2) {
        int i = 0;
        StringBuilder sb = new StringBuilder();
        while (i < word1.length() - 1 || i < word2.length() - 1) {
            if (i <= word1.length() - 1) {
                sb.append(word1.charAt(i));
            }
            if (i <= word2.length() - 1) {
                sb.append(word2.charAt(i));
            }

            i++;
        }
        return sb;
    }

    public static String longestCommonPrefix(String[] strs) {
        if (strs.length == 0 || strs == null) {
            return "";
        }
        String prefix = strs[0];

        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);

                if (prefix.isEmpty())
                    return "";
            }
        }
        return prefix;
    }

}
