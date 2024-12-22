import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterStudentsByName {
    public static void main(String[] args) {
        // List of student names
        List<String> studentNames = Arrays.asList("Alice", "Bob", "Andrew", "Charlie", "Anita", "David", "Eve", "Aaron", "Grace");

        // Use Stream API and Lambda Expression to filter students whose names start with 'A'
        List<String> specialGiftStudents = studentNames.stream()
                .filter(name -> name.startsWith("A"))
                .toList();

        // Display the original list of students
        System.out.println("Original List of Students: " + studentNames);

        // Display the list of students who will receive special gifts
        System.out.println("Students with names starting with 'A': " + specialGiftStudents);
    }
}
