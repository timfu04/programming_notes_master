public class Dog {
    private String name;
    private int age;

    public Dog(){
        // System.out.println("Hello world"); // Gives error, "this()" must be first statement, to avoid using object before creating object

        // "this()" calls other constructor,
        // knows which constructor to call based on argument type (String and integer in this case)
        // Must be the first statement to be called in the constructor
        this("Fido", 0); // Default name of Fido and age of 0
    };

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setName(String name){
        // "this.name" refers to the name field of the instance that called "setName"
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void bark(){
        System.out.println("Bark!");
    }

//    public static void printStuff(){
//        this.name; // "this" cannot be used in static context
//    }
}
