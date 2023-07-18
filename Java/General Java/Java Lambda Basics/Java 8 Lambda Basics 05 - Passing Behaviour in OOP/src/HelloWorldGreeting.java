public class HelloWorldGreeting implements Greeting{
    // Implementation of Greeting interface
    @Override
    public void perform() {
        System.out.println("Hello World Greeting!");
    }
}