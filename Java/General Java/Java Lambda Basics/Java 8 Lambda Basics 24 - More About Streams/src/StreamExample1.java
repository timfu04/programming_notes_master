import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExample1 {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        // Stream consist 3 elements
        // 1. Source (people in this case)
        // 2. Operations performed on the stream
        // 3. Terminal operation (end operation)

        people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .forEach(p -> System.out.println(p.getFirstName()));

        Stream<Person> stream = people.stream();
        System.out.println(stream);

        long count = people.stream()
                .filter(p -> p.getLastName().startsWith("C"))
                .count(); // you cannot add more operations after terminal operations (e.g. count, forEach)
        System.out.println(count);

        long count2 = people.parallelStream() // can use "parallelStream" if you think it can benefit from parallelism
                .filter(p -> p.getLastName().startsWith("D"))
                .count();

        System.out.println(count2);

    }
}