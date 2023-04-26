public class Main {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;

        // local variables used in lambda expression have to be final or effectively final (without final keyword, but compiler assume its final)

        // Closure
        // Lambda expression freeze the value of b, which is 20 and carry it together as an argument in "doProcess" method
        doProcess(a, i-> System.out.println(i + b));
    }

    public static void doProcess(int i, Process p){
        p.process(i);
    }

}

interface Process{
    void process(int i);
}



