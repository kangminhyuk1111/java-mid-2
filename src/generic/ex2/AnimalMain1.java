package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain1 {

    public static void main(String[] args) {
        final Animal animal = new Animal("동물", 0);
        final Dog dog = new Dog("멍멍이", 100);
        final Cat cat = new Cat("고양이", 50);

        final Box<Dog> dogBox = new Box<>();
        dogBox.set(dog);
        final Dog findDog = dogBox.get();

        System.out.println("findDog = " + findDog);

        final Box<Cat> catBox = new Box<>();
        catBox.set(cat);
        final Cat findCat = catBox.get();

        System.out.println("findCat = " + findCat);

        final Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        final Animal findAnimal = animalBox.get();

        System.out.println("findAnimal = " + findAnimal);
    }
}
