package generic.ex5;

import generic.animal.Animal;
import generic.animal.Cat;
import generic.animal.Dog;

public class WildCardMain1 {

    public static void main(String[] args) {
        final Box<Object> objBox = new Box<>();
        final Box<Dog> dogBox = new Box<>();
        final Box<Cat> catBox = new Box<Cat>();

        dogBox.set(new Dog("멍멍이", 100));

        WildCardEx.printGenericV1(dogBox);
        WildCardEx.printWildCardV1(dogBox);

        WildCardEx.printGenericV2(dogBox);
        WildCardEx.printWildCardV2(dogBox);

        final Dog dog = WildCardEx.printAndReturnGeneric(dogBox);
        final Animal animal = WildCardEx.printAndReturnWildcard(dogBox);
    }
}
