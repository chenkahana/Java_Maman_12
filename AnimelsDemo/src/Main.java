import POJO.Abstract.Animal;
import POJO.Abstract.Bird;
import POJO.Abstract.Mammal;
import POJO.Abstract.Reptile;
import POJO.Birds.Pigeon;
import POJO.Birds.Rooster;
import POJO.Mammels.Dog;
import POJO.Mammels.Elephant;
import POJO.Owner;
import POJO.Reptiles.Lizard;
import POJO.Reptiles.Snake;

import java.util.ArrayList;

public class Main {

    private static final ArrayList<Animal> ANIMALS = new ArrayList<>();
    private static final int NUM_OF_ANIMALS = 10;


    public static void main(String[] args) {
        fillArray();
        printArray();
        feedAnimals();
        sendAnimalsToBed();
        cloneADog();
        letTheReptilesCrawl();
        letTheBirdsFly();
        letTheMammalsGrowFur();

    }

    private static void fillArray() {
        for (int i = 0; i < NUM_OF_ANIMALS; i++) {
            ANIMALS.add(getAnimalByNumber((int) (Math.random() * 6), i + ""));
        }
    }

    private static void feedAnimals() {
        System.out.println("The animals are eating: ");
        for (int i = 0; i < NUM_OF_ANIMALS; i++) {
            ANIMALS.get(i).eat();
        }
    }

    private static void sendAnimalsToBed() {
        System.out.println("The animals are going to sleep: ");
        for (int i = 0; i < NUM_OF_ANIMALS; i++) {
            ANIMALS.get(i).sleep();
        }
    }

    private static void printArray() {
        System.out.println("The animals are: ");
        for (int i = 0; i < NUM_OF_ANIMALS; i++) {
            System.out.println("\t" + ANIMALS.get(i));
        }
    }

    private static Animal getAnimalByNumber(int num, String name) {
        return switch (num) {
            case 1 -> new Rooster(12, "blue", "Roosty" + name);
            case 2 -> new Pigeon(6, "Pigi" + name, "yellow");
            case 3 -> new Dog(new Owner("Owny" + name, "056-6688779"), 14, "Reksy" + name, "brown");
            case 4 -> new Snake(7, "Snakey" + name, "green");
            case 5 -> new Lizard(5, "Lizardush" + name, "red");
            default -> new Elephant(85, "Ely" + name, "white");
        };
    }

    private static void cloneADog() {
        for (int i = 0; i < NUM_OF_ANIMALS; i++) {
            if (ANIMALS.get(i).getClass().getTypeName().contains("Dog")) {
                Dog dog = (Dog) ANIMALS.get(i);
                Dog dog2 = (Dog) dog.clone();
                dog2.setOwner(new Owner("NOT OWNI", "051-1234567"));
                System.out.println("The first dog: ");
                System.out.println("\t" + dog);
                System.out.println("The second dog: ");
                System.out.println("\t" + dog2);
                return;
            }
        }
    }

    private static void letTheBirdsFly() {
        for (int i = 0; i < NUM_OF_ANIMALS; i++) {
            if (ANIMALS.get(i).getClass().getSuperclass().getSimpleName().contains("Bird")) {
                ((Bird) ANIMALS.get(i)).fly();
            }
        }
    }

    private static void letTheReptilesCrawl() {
        for (int i = 0; i < NUM_OF_ANIMALS; i++) {
            if (ANIMALS.get(i).getClass().getSuperclass().getSimpleName().contains("Reptile")) {
                ((Reptile) ANIMALS.get(i)).crawl();
            }
        }
    }

    private static void letTheMammalsGrowFur() {
        for (int i = 0; i < NUM_OF_ANIMALS; i++) {
            if (ANIMALS.get(i).getClass().getSuperclass().getSimpleName().contains("Mammal")) {
                ((Mammal) ANIMALS.get(i)).growFur();
            }
        }
    }


}
