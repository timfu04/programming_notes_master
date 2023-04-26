import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.List;

public class CollectionIterationExample {
    public static void main(String[] args) {

        List<Person> people = Arrays.asList(
                new Person("Charles", "Dickens", 60),
                new Person("Lewis", "Carroll", 42),
                new Person("Thomas", "Carlyle", 51),
                new Person("Charlotte", "Bronte", 45),
                new Person("Matthew", "Arnold", 39)
        );

        // External iterators/ active iterator/ explicit iterator
        // Programmer controls the iteration of elements
        System.out.println("Using for loop");
        for(int i=0; i<people.size(); i++){
            System.out.println(people.get(i));
        }

        System.out.println();

        System.out.println("Using for in loop");
        for (Person p: people){
            System.out.println(p);
        }

        // Internal iterators / passive iterator/ implicit iterator
        // The iterator takes control over the iteration of elements. The programmer only tells "what operation is to be performed on the elements
        // of the collection"
        // Leverage multithreading and parallelism, running multiple elements at one time
        System.out.println();
        System.out.println("Using lambda for each loop");
        // for each element execute the lambda expression
        people.forEach(p -> System.out.println(p));

        // same as above, but with method reference
        people.forEach(System.out::println);




    }
}