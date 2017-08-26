package com.zoo.Animals;

public class Tiger extends Animal {
    public Tiger(String bubu, int i) {
        super();
        this(name, hungerLevel);
        System.out.println("hello from tiger() constuctor");
        //super( hungerLevel: 70);       //zawola metode obiektu klasy bazowej i nadpisze na 70, super wywoluje konstruktor w klasie bazowej
    }


    /*public Tiger(String name, Integer hungerLevel) {
        super();

        //if (hungerLevel > 50) {
            this(name, hungerLevel);
        System.out.println("hello from tiger (name, hungerLevel) constructor");
        }
*/


    public Tiger(String name) {
        setName(name);

    }

    @Override
    public void move() {
        super.move();
        System.out.println("I'm tiger - moving very fast");
    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println(" Wrrrr !!!");
    }
}
