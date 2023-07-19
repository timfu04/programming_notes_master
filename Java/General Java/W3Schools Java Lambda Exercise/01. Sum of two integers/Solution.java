// 1. Write a Java program to implement a lambda expression to find the sum of two integers.
public class Solution {
    public static void main(String[] args) {
        SumCalculator sumCalculator = (x,y) -> x + y;
        int result = sumCalculator.sum(10,20);
        System.out.println(result);
    }
}
@FunctionalInterface
interface SumCalculator{
    int sum(int x, int y);
}