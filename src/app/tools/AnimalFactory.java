package app.tools;

import com.zoo.Animals.Animal;
import com.zoo.Animals.Elephant;
import com.zoo.Animals.Snake;

import java.util.ArrayList;
import java.util.List;

public class AnimalFactory {
    public static List<Animal> getAnimals() {
        List<Animal> animal = new ArrayList<>();

        animal.add(new SiberianTiger(name:"johny", hungerLevel:82));
        animal.add(new Snake(name:"bobby", hubgerLevel:59));
        animal.add(new Elephant(name:"franek", hungerLevel:83));
        animal.add()
    }
}
