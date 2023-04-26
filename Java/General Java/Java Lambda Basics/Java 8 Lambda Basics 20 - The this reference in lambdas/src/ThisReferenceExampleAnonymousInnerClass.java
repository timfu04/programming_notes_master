public class ThisReferenceExampleAnonymousInnerClass {

    public void doProcess(int i, Process p){
        p.process(i);
    }

    public void execute(){
        doProcess(5, i -> {
            System.out.println("The value i: " + i);
            // "this" refers to the instance that called the "execute" method (thisReferenceExampleAnonymousInnerClass)
            // gives no error, because in non-static context
            System.out.println(this);
        });
    }

    public static void main(String[] args) {
        ThisReferenceExampleAnonymousInnerClass thisReferenceExampleAnonymousInnerClass = new ThisReferenceExampleAnonymousInnerClass();

        // Example 1
        //System.out.println(this); // gives error, because "this" cannot be in static context
        thisReferenceExampleAnonymousInnerClass.doProcess(10, new Process() {
            @Override
            public void process(int i) {
                System.out.println("The value i: " + i);
                // "this" is the anonymous inner class (Process instance created in line 9)
                // changed to non-static context, therefore gives no error
                System.out.println(this);
            }

            public String toString(){
                return " \"this\" is the anonymous inner class";
            };
        });

        // Example 2
        thisReferenceExampleAnonymousInnerClass.doProcess(5, i -> {
            System.out.println("The value i: " + i);
            // System.out.println(this); // gives error, because lambda expression does not change context (still in static context)
        });

        // Example 3
        thisReferenceExampleAnonymousInnerClass.execute();

    }
}

interface Process{
    void process(int i);
}
