public class Lambdas {
    public static void main(String[] args) {
        // Why use Lambda expression? Reduce code

        // 1. Now we need to create a class that implements Printable
        // 2. Provide implementation of the print method
        // 3. Create object of the class
        // 4. Pass the object in when calling a method
        Cat myCat = new Cat();
        myCat.print();

        // Instead of passing object that contains the implementation of the print method
        printThing(myCat);

        // Use lambda expression and pass the specific implementation of the print method directly
        Printable lambdaPrintable = () -> System.out.println("Meow from lambda printable");
        printThing(lambdaPrintable);

        Printable2 lambdaPrintable2 = s -> System.out.println("Meow from lambda printable 2 " + s);
        printThing2(lambdaPrintable2);

        Printable3 lambdaPrintable3 = (p,s) -> System.out.println(p + " Meow from lambda printable 3 " + s);
        printThing3(lambdaPrintable3);

        // Do not need "return" keyword if the lambda expression only contain one expression
        Printable4 lambdaPrintable4 = (p,s) -> (p + " Meow from lambda printable 4 " + s);
        printThing4(lambdaPrintable4);
    }

    // What matters about Printable is what the implementation of the print method is
    static void printThing(Printable thing){ // "Printable" can be any object that implements the "Printable" interface
        thing.print();
    }

    static void printThing2(Printable2 thing){
        thing.print("!");
    }

    static void printThing3(Printable3 thing){
        thing.print("!", "?");
    }

    static void printThing4(Printable4 thing){
        System.out.println(thing.print("!", "?"));
    }

}
