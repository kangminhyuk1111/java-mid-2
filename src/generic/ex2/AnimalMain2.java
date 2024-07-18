package generic.ex2;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalMain2 {

    public static void main(String[] args) {
        final Animal animal = new Animal("동물", 0);
        final Dog dog = new Dog("멍멍이", 100);
        final Cat cat = new Cat("고양이", 50);

        final Box<Animal> animalBox = new Box<>();
        animalBox.set(animal);
        animalBox.set(dog);
        animalBox.set(cat);

        final Animal findAnimal = animalBox.get();

        System.out.println("findAnimal = " + findAnimal);
    }
}
