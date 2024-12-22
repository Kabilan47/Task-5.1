import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterNonEmptyStrings {
    public static void main(String[] args) {
        // Initialize a list of strings
        List<String> listStrings = Arrays.asList("abc", "", "be", "efg", "abed", "", "jkl");

        // Filter out non-empty strings using stream and filter
        List<String> nonEmptyStrings = listStrings.stream()
                .filter(s -> !s.isEmpty())
                .toList();

        // Display the original list
        System.out.println("Original List: " + listStrings);

        // Display the filtered list with non-empty strings
        System.out.println("Non-Empty Strings: " + nonEmptyStrings);
    }
}
