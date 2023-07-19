public class Greeter {

    // Polymorphism
    // Pass in the class with the behaviour as an argument
    // The "greet" method takes the behaviour from the class and executes it
    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting(); // Implementation of Greeting interface
        greeter.greet(helloWorldGreeting);
    }

    // What type should be provided for the lambda expressions?
    // Use interface to create new "function type" for lambda expressions
    MyLambda myLamdaFunction = () -> System.out.println("Hello World!");

    // Already created "Greeting" interface that matches the method signature in this lambda expression
    Greeting myLamdaFunction2 = () -> System.out.println("Hello World from Greeting!");

    MyAdd addFunction = (int a, int b) -> a + b;
}

// Interface that works with lambda expressions cannot have more than one abstract method
// Interface name and method name does not matter, as long as the method signature matches the lambda expressions
interface MyLambda{
    void foo();
}

interface MyAdd{
    int add(int x, int y);
}
