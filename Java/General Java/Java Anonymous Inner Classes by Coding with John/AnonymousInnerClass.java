public class AnonymousInnerClass {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.makeNoise();

        // Way 1: Creates a subclass of existing class //
        // Create an anonymous subclass of the Animal class inside curly braces
        // Create an unnamed subclass from another class, and create only one single object of that anonymous subclass
        // Create one single object because the subclass is unnamed, we cannot instantiate another object later in the code.
        Animal bigfoot = new Animal(){
            @Override
            public void makeNoise(){
                System.out.println("Grawlneenlnenlengehehe");
            }
        };
        bigfoot.makeNoise();

        // Way 2: Creates a class that implements an interface //
        // Creates an anonymous inner class that implements the Runnable interface inside curly braces
        Runnable myAnonymousRunnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Im an anonymous runnable");
            }
        };
        myAnonymousRunnable.run();
    }
}