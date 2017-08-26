package app;

import com.zoo.Animals.Animal;
import com.zoo.Animals.Tiger;
import com.zoo.Animals.rare.SyberianTiger;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Tiger myTiger = new Tiger("Bubu", 78);
        System.out.println("name: " + myTiger.getName() + " hunger: " + myTiger.getHungerLevel());

        myTiger.move();
        myTiger.makeSound();
        myTiger.feed();

        //Tiger tig = (Tiger)myTiger;               //tozsame
        //tig.feed();d
    }


    Animal myTiger = new SyberianTiger("Bubu", 78);


}
