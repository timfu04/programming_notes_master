public class Greeter {

    // Polymorphism
    // Pass in the class with the behaviour as an argument
    // The "greet" method takes the behaviour from the class and executes it
    public void greet(Greeting greeting){ // Takes Greeting interface as argument
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting(); // Implementation of Greeting interface
        greeter.greet(helloWorldGreeting);
    }

}