import java.util.function.BiConsumer;

public class Main {
    public static void main(String[] args) {

        int[] someNumbers = {1, 2, 3, 4};
        int key = 0;

        // lamba expression should be short,concise, one line (as possible)
        // externalize try catch into a separate method
        // wrap this lamba expression with another lamba expression

        // pass lambda expression into another function for validation, return the same object if no exception found
        process(someNumbers, key, wrapperLambda((v, k) -> System.out.println(v / k)));
    }

    private static void process(int[] someNumbers, int key, BiConsumer<Integer, Integer> biconsumer){
        for (int i: someNumbers){
            biconsumer.accept(i, key);
        }
    }

    // pass-through function
    private static BiConsumer<Integer, Integer> wrapperLambda(BiConsumer<Integer, Integer> biconsumer){
        return (v, k) ->{
            try{
                biconsumer.accept(v, k);
            }catch (ArithmeticException e){
                System.out.println("Exception caught in wrapper lambda");
            }
        };
    }

}