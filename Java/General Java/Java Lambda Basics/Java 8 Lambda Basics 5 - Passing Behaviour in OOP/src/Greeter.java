public class Greeter {

    // polymorphism
    // pass the behaviour as an argument
    // the "greet" method takes the behaviour and executes it
    public void greet(Greeting greeting){
        greeting.perform();
    }

    public static void main(String[] args) {
        Greeter greeter = new Greeter();
        HelloWorldGreeting helloWorldGreeting = new HelloWorldGreeting();
        greeter.greet(helloWorldGreeting);
    }

}