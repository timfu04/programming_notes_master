public class TypeInferenceExample {

    public static void main(String[] args) {

        // Original: StringLengthLambda myLambda = (String s) -> s.length();
        // Remove variable type in parameter
        // Remove parentheses if only one parameter
        StringLengthLambda myLambda = s -> s.length();
        System.out.println(myLambda.getLength("Hello Lambda"));

        // pass lambda expression into "printLambda" method
        // it will check whether the method signature in lambda expression matches the method signature of the parameter
        printLambda(s -> s.length());
    }

    public static void printLambda(StringLengthLambda l){
        System.out.println(l.getLength("Hello Lambda from printLambda method"));
    }

    interface StringLengthLambda{
        int getLength(String s);
    }

}
