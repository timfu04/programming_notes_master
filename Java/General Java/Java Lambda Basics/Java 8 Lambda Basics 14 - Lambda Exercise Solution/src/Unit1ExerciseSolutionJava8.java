import java.util.Arrays;
import java.util.Collections;
import java.util.List;

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
        printConditionally(people, p -> true);
        System.out.println();

        // Step 3: Create a method that prints all people that have last name beginning in C (replaced with lambda expression)
        printConditionally(people, p -> p.getLastName().startsWith("C"));
        System.out.println();

        // prints all people that have first name beginning in C
        printConditionally(people, p -> p.getFirstName().startsWith("C"));

    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p: people){
            if(condition.test(p)){
                System.out.println(p);
            }
        }
    }

}

//Do not need to create interface here, because already created in Unit1ExerciseSolutionJava7 (thats why commented)

//interface Condition{
//    boolean test(Person p);
//}
