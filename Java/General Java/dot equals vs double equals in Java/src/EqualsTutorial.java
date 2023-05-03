public class EqualsTutorial {
    public static void main(String[] args) {
        // .equals() vs. == in Java

        int int1 = 4;
        int int2 = 4;

        if (int1 == int2){
            System.out.println("The numbers are equal");
        }
        else{
            System.out.println("The numbers are not equal");
        }


        // with "new" keyword
        // two separated objects are created in memory
        String string1 = new String("Hello");
        String string2 = new String("Hello");

        if (string1 == string2){
            System.out.println("The string are equal");
        }
        else{
            System.out.println("The string are not equal");
        }


        // with "new" keyword
        // two separated objects are created in memory
        String string3 = new String("Hello");
        String string4 = new String("Hello");

        if (string3.equals(string4)){
            System.out.println("The string are equal");
        }
        else{
            System.out.println("The string are not equal");
        }



        // without "new" keyword
        // "hello" will be hold in one memory location, and both variables points to the same memory location
        String string5 = "hello";
        String string6 = "hello";

        if (string5 == string6){
            System.out.println("The string are equal");
        }
        else{
            System.out.println("The string are not equal");
        }


        // with "new" keyword
        // two separated objects are created in memory
        // not equal because did not override "equals" method
        Dog myDog = new Dog();
        Dog yourDog = new Dog();

        if (myDog.equals(yourDog)){
            System.out.println("The dog are equal");
        }
        else{
            System.out.println("The dog are not equal");
        }

    }
}