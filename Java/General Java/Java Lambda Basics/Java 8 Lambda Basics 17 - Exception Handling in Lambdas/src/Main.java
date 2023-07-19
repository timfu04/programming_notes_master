import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {
        int[] someNumbers = {1, 2, 3, 4};
        int key = 0;

        // lace try catch in lambda expression, the action/ behaviour/ operation itself
        // validation within lambda expression
        process(someNumbers, key, (v, k) -> {
           try{
               System.out.println(v/k);
           }catch (ArithmeticException e){
               System.out.println("An Arithmetic Exception happened");
           }
        });
    }

    // Do not place try catch into the method that the lambda expression get passed in
    // because you don't know what biconsumer you are passing in (e.g. ArithmeticException may not be applicable for other situations)
    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biconsumer){
        for (int i: someNumbers){
            System.out.println(i);
            biconsumer.accept(i, key);
            System.out.println("\n");
        }
    }

}