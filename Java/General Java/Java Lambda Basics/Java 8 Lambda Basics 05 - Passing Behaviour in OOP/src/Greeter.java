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
        greeter.greet(helloWorldGreeting); // Passing a behaviour into the "greet" method
    }

}