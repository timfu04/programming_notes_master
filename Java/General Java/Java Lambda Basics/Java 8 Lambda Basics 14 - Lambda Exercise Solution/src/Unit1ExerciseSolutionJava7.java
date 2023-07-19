import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Without lambda expressions
public class Unit1ExerciseSolutionJava7 {

    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        // Step 1: Sort list by last name
        // Comparator is an interface, would need to create an implementation of Comparator
        // "compare" method will be applied on each element in "people" on each combination
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getLastName().compareTo(o2.getLastName()); // "compareTo" compares strings and return integer value
            }
        });

        // Step 2: Create a method that prints all elements in the list
        printAll(people);

        System.out.println();

        // Step 3: Create a method that prints all people that have last name beginning in C
        printLastNameBeginningWithC(people);

        System.out.println();

        // Prints all people that have last name beginning in C (conditional method)
        printConditionally(people, new Condition() { // Pass in implementation of Condition
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("C");
            }
        });

        System.out.println();

        // Prints all people that have last name beginning in D (conditional method)
        printConditionally(people, new Condition() { // Pass in implementation of Condition
            @Override
            public boolean test(Person p) {
                return p.getLastName().startsWith("D");
            }
        });
    }

    private static void printAll(List<Person> people) {
        for (Person p: people){
            System.out.println(p); // invoke the toString method because printing object
        }
    }

    // Need to create another method if you want last name beginning with something else (try make it conditional)
    private static void printLastNameBeginningWithC(List<Person> people) {
        for (Person p: people){
            if (p.getLastName().startsWith("C")){
                System.out.println(p); // invoke the toString method because printing object
            }
        }
    }

    private static void printConditionally(List<Person> people, Condition condition) {
        for (Person p: people){
            if(condition.test(p)){
                System.out.println(p);
            }
        }
    }

}

@FunctionalInterface
interface Condition{
    boolean test(Person p);
}
