public class MethodReferenceExample {
    public static void main(String[] args) {

        // "MethodReferenceExample::printMessage" is exactly same as "() -> printMessage()"
        Thread t = new Thread(MethodReferenceExample::printMessage);
        t.start();
    }

    public static void printMessage(){
        System.out.println("Hello");
    }

}