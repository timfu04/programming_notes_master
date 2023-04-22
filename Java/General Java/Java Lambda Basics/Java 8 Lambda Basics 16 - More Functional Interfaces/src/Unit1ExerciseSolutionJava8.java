import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

// With lambda expressions
public class Unit1ExerciseSolutionJava8 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        // Step 1: Sort list by last name (replaced with lambda expression)
        Collections.sort(people, (Person p1, Person p2) -> p1.getLastName().compareTo(p2.getLastName()));

        // Step 2: Create a method that prints all elements in the list
        // Print all people, because always return true
        performConditionally(people, p -> true, p -> System.out.println(p));
        System.out.println();

        // Step 3: Create a method that prints all people that have last name beginning in C (replaced with lambda expression)
        performConditionally(people, p -> p.getLastName().startsWith("C"), p -> System.out.println(p));
        System.out.println();

        // prints all people that have first name beginning in C
        performConditionally(people, p -> p.getFirstName().startsWith("C"), p -> System.out.println(p.getFirstName()));
    }

    // "Predicate" is a built-in functional interface that can be used for lambda expression
    private static void performConditionally(List<Person> people, Predicate<Person> predicate, Consumer<Person> consumer) {
        for (Person p: people){
            if(predicate.test(p)){
                consumer.accept(p);
            }
        }
    }

}