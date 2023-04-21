public class Greeter {

    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();

        // Implementing the "Greeting" interface by creating a new class
        Greeting helloWorldGreeting = new HelloWorldGreeting();

        // Lambda expression
        // Implementing the "Greeting" interface by only creating a function
        Greeting lambdaGreeting = () -> System.out.println("Hello World from Lambda Expression!");

        // Inner class - a class declared inside another class
        // Anonymous inner class - inner class without a name, create a single object
        // Can extend a class or implement an interface (one interface at a time) but not both at a time
        // Extra source: https://www.geeksforgeeks.org/anonymous-inner-class-java/
        Greeting innerClassGreeting = new Greeting() {
            @Override
            public void perform() {
                System.out.println("Hello World from inner class!");
            }
        };

        // Lambda expression in similar to anonymous inner class

        helloWorldGreeting.perform();
        // Lambda expression is behaving like the implementation of the "Greeting" interface
        // Execute lambda expression by calling the interface method of it, just as if it were implementation of the interface
        lambdaGreeting.perform();
        innerClassGreeting.perform();

        System.out.println();

        greeter.greet(helloWorldGreeting);

        // Both are the same thing
        greeter.greet(lambdaGreeting);
        greeter.greet(() -> System.out.println("Hello World from Lambda Expression!"));

        greeter.greet(innerClassGreeting);
    }
}
