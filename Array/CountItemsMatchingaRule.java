import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CountItemsMatchingaRule {
    public static void main(String[] args) {
        List<List<String>> iteams = Arrays.asList(Arrays.asList("phone", "blue", "pixel"),
                Arrays.asList("computer", "silver", "lenovo"),
                Arrays.asList("phone", "gold", "iphone"));

        System.out.println(countMatches(iteams, "color", "silver"));
    }

    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

        int count = 0;
        int index = 0;

        if (ruleKey.equals("type"))
            index = 0;
        else if (ruleKey.equals("color"))
            index = 1;
        else
            index = 2;

        for (List<String> item : items) {
            if (item.get(index).equals(ruleValue)) {
                count++;
            }
        }

        return count;
    }
}
