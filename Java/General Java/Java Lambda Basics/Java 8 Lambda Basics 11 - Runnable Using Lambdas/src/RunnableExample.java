public class RunnableExample {

    public static void main(String[] args) {

        // Instead of creating a new class that implements Runnable
        // and create an instance of Runnable and pass in here.
        // Example of anonymous inner class (Runnable)
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Print inside Runnable");
            }
        });

        myThread.start(); // calls "run" method

        // Create a lambda expression with the same method signature as the "run" method in Runnable
        Thread myLambdaThread = new Thread(() -> System.out.println("Print inside Lambda Runnable"));
        myLambdaThread.start(); // calls "run" method
    }
}
