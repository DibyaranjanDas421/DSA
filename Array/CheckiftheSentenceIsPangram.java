public class CheckiftheSentenceIsPangram {

    public static void main(String[] args) {
        String sentence = "thequickbrownfoxjumpsoverthelazydog";
        System.out.println(checkIfPangram(sentence));
    }

    public static boolean checkIfPangram(String sentence) {
        boolean[] seen = new boolean[26];

        for (char c : sentence.toCharArray()) {
            seen[c - 'a'] = true;
        }

        for (boolean b : seen) {
            if (!b) {
                return false;
            }
        }

        return true;
    }

}
