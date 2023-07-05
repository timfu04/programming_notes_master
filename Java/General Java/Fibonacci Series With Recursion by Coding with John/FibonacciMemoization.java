public class FibonacciMemoization {
    private static long[] fibonacciCache; // memoization technique

    public static void main(String[] args) {

        int n = 4;
        fibonacciCache = new long[n+1]; // fibonacci start from zero
        System.out.println(fibonacci(n));
    }

    private static long fibonacci(int n) {
        if (n <= 1){
            return n;
        }

        if (fibonacciCache[n]!=0){
            return fibonacciCache[n];
        }

        // expression evaluate from left to right
        // fibonacci(n-1) is evaluated first then fibonacci(n-2)
        long nthFibonacciNumber = (fibonacci(n-1) + fibonacci(n-2));
        fibonacciCache[n] = nthFibonacciNumber;

        return nthFibonacciNumber;
    }
}
