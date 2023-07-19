import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {

        int[] someNumbers = {1, 2, 3, 4};
        int key = 0;

        // Lamba expression should be short,concise, one line (as possible)
        // Externalize try catch into a separate method
        // Wrap this lamba expression with another lamba expression

        // Pass lambda expression into another function for validation, return another new lambda
        process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biconsumer){
        for (int i: someNumbers){
            biconsumer.accept(i, key);
        }
    }

    // Pass-through function
    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biconsumer){
        // Return a new lambda expression
        return (v, k) ->{
            try{
                biconsumer.accept(v, k);
            }catch (ArithmeticException e){
                System.out.println("Exception caught in wrapper lambda");
            }
        };
    }

}