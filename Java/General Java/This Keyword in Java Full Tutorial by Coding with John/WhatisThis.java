public class WhatisThis {
    public static void main(String[] args) {

        Dog myDog = new Dog();
        System.out.println(myDog.getName());

        Dog myDog2 = new Dog();
        myDog2.setName("Kramer");
        System.out.println(myDog2.getName());
    }
}
