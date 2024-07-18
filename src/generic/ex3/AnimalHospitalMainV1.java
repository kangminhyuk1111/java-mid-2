package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV1 {
    public static void main(String[] args) {
        final AnimalHospitalV1 dogHospital = new AnimalHospitalV1();
        final AnimalHospitalV1 catHospital = new AnimalHospitalV1();

        final Dog dog = new Dog("멍멍이", 100);
        final Cat cat = new Cat("야오이", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        // 컴파일 오류가 발생하지 않음, 문제가 생겨야 정상
        // dogHospital에 cat이 들어가니까..
        dogHospital.set(cat);

        dogHospital.set(dog);
        final Dog bigger = (Dog) dogHospital.bigger(new Dog("멍멍이", 200));
        System.out.println(bigger);
    }
}
