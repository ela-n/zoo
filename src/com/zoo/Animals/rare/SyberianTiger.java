package com.zoo.Animals.rare;

import com.zoo.Animals.Tiger;

public class SyberianTiger extends Tiger {
    public SyberianTiger(String name, Integer hungerLevel) {
        super(name, hungerLevel);

    }

    @Override
    public void makeSound() {
        super.makeSound();
        System.out.println("Siberian Tiger makes sound");
    }


}
