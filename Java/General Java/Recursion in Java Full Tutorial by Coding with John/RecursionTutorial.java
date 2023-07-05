public class RecursionTutorial {
    public static void main(String[] args) {

        sayHi(10);
    }

    private static void sayHi(int count) {
        System.out.println("Hi!");
        if (count<=1){ // this is base case
            return;
        }
        sayHi(count - 1); // count - 1 works towards base case
    }
}
