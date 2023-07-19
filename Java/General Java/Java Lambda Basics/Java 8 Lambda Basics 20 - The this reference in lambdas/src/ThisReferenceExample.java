public class ThisReferenceExample {

    // "this" keyword is used as a reference to an instance
    // Static methods does not belong to any instance, you cannot use "this"

    // Difference between anonymous inner class and lambda expression //
    // Anonymous inner class instance override the "this" reference
    // Lambda expression does not override the "this" reference, still referring the instance outside lambda

    public void doProcess(int i, Process p){
        p.process(i);
    }

    public void execute(){
        doProcess(5, i -> {
            System.out.println("The value i: " + i);
            // "this" refers to the instance that called the "execute" method (thisReferenceExample)
            // Gives no error, because in non-static context
            System.out.println(this);
        });
    }

    public static void main(String[] args) {
        ThisReferenceExample thisReferenceExample = new ThisReferenceExample();

        // System.out.println(this); // Gives error, because "this" cannot be in static context

        // Example 1 - Anonymous inner class
        thisReferenceExample.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("The value i: " + i);
                // Override "this" reference, refers to the anonymous inner class (Process instance created in line 21)
                // Changed to non-static context, therefore gives no error
                System.out.println(this);
            }
//            public String toString(){
//                return " \"this\" is the anonymous inner class";
//            };
        });

        // Example 2 - Lambda expression
        thisReferenceExample.doProcess(5, i -> {
            System.out.println("The value i: " + i);
            // Gives error, because lambda expression does not change context (still in static context)
            // Lambda expression does not override the "this" reference
            // System.out.println(this);
        });

        // Example 3
        thisReferenceExample.execute();
    }

//    public String toString(){
//        return "This is the main ThisReferenceExampleAnonymousInnerClass";
//    }
}

interface Process{
    void process(int i);
}
