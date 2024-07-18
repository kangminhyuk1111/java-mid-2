package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV0 {

    public static void main(String[] args) {
        final DogHospital dogHospital = new DogHospital();
        final CatHospital catHospital = new CatHospital();

        final Dog dog = new Dog("멍멍이", 100);
        final Cat cat = new Cat("야오이", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();
    }
}
