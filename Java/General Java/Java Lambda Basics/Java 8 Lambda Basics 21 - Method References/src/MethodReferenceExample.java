public class MethodReferenceExample {
    public static void main(String[] args) {

        // "MethodReferenceExample::printMessage" is exactly same as "() -> printMessage()"
        // Class name that contain the method :: name of the method
        // Use method reference if you are just executing a method in lambda expression
        Thread t = new Thread(MethodReferenceExample::printMessage);
        t.start();
    }

    public static void printMessage(){
        System.out.println("Hello");
    }

}