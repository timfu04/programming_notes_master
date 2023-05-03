import java.util.Optional;

public class OptionalTutorial {
    public static void main(String[] args) {

        Optional<Cat> optionalCat = findCatByName("Fred");
        if (optionalCat.isPresent()){
            System.out.println(optionalCat.get().getAge() + " return Cat object");
        }

        Optional<Cat> optionalCat2 = findCatByName2("Fred");
        if (optionalCat2.isPresent()){
            System.out.println(optionalCat2.get().getAge());
        }

        Optional<Cat> optionalCat3 = findCatByName("Fred");
        System.out.println(
                optionalCat3.map(Cat::getAge) // "Cat::getAge" same as "cat -> cat.getAge()"
                        .orElse(0)
        );

        Optional<Cat> optionalCat4 = findCatByName2("Fred");
        System.out.println(
                optionalCat4.map(Cat::getAge)
                .orElse(0)
        );

        Optional<Cat> optionalCat5 = findCatByName2("Fred"); // call method that returns null value
        System.out.println(
                optionalCat5.map(Cat::getAge)
                        .orElseGet(() -> 100)
        );

    }

    // return Cat object
    private static Optional<Cat> findCatByName (String name){
        Cat cat = new Cat("Fred", 3);
        return Optional.ofNullable(cat);
    }

    // return null value
    private static Optional<Cat> findCatByName2 (String name){
        Cat cat = new Cat("Fred", 3);
        return Optional.ofNullable(null);
    }

}