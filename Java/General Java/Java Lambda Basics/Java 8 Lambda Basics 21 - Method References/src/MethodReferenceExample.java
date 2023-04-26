public class MethodReferenceExample {
    public static void main(String[] args) {

        // "MethodReferenceExample::printMessage" is exactly same as "() -> printMessage()"
        // Method reference can replace lambda expression if the lambda expression has same input and output (e.g. () -> printMessage())
        Thread t = new Thread(MethodReferenceExample::printMessage);
        t.start();
    }

    public static void printMessage(){
        System.out.println("Hello");
    }

}