public enum Cereals {
    CAPTAIN_CRUNCH(50, 2.90),
    FROOT_LOOPS(60, 3.45),
    REESES_PUFFS(100, 1.60),
    COCOA_PUFFS(75, 2.33);

    final int levelOfDeliciousness; // make it "final" to ensure no one can change the value
    final double price;

    Cereals(int levelOfDeliciousness, double price){
        this.levelOfDeliciousness = levelOfDeliciousness;
        this.price = price;
    }
}
