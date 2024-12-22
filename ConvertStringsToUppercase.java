import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertStringsToUppercase {
    public static void main(String[] args) {
        // Initialize a list of strings
        List<String> streamNames = Arrays.asList("abc", "d", "ef");

        // Convert each string in the list to uppercase using stream and map
        List<String> uppercaseNames = streamNames.stream()
                .map(String::toUpperCase)
                .toList();

        // Display the original list
        System.out.println("Original List: " + streamNames);

        // Display the list with uppercase strings
        System.out.println("Uppercase List: " + uppercaseNames);
    }
}
