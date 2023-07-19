import java.util.function.Predicate;

public class Solution {
    public static void main(String[] args) {
        Predicate<String> checkEmpty = (s) -> s.isEmpty();
        boolean result = checkEmpty.test("Hello world");
        System.out.println(result);

        boolean result2 = checkEmpty.test("");
        System.out.println(result2);
    }
}



