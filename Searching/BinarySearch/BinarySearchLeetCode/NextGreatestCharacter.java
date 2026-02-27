package Searching.BinarySearch;

public class NextGreatestCharacter {

    public static void main(String[] args) {
        char[] c = { 'c', 'f', 'j' };
        char[] c1 = { 'x', 'x', 'y', 'y' };
        System.out.println(nextGreatestLetter(c, 'c'));

    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        boolean isAsc = (int) letters[start] < (int) letters[end];

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (isAsc) {
                if ((int) target > (int) letters[mid]) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if ((int) target > (int) letters[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }

        }

        return letters[start % letters.length];

    }

    public static char nextGreatestLetter1(char[] letters, char target) {

        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (letters[mid] <= target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return letters[start % letters.length];
    }

}
