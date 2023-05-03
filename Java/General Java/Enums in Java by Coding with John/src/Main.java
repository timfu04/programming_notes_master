public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        DaysOfTheWeek day = DaysOfTheWeek.THURSDAY;
        if(day == DaysOfTheWeek.THURSDAY){
            System.out.println("Yay it's almost Friday!");
        }



        for (DaysOfTheWeek myDay : DaysOfTheWeek.values()){
            System.out.println(myDay);
        }

        System.out.println();

        System.out.println(Cereals.FROOT_LOOPS.levelOfDeliciousness);
        System.out.println(Cereals.COCOA_PUFFS.price);
    }
}