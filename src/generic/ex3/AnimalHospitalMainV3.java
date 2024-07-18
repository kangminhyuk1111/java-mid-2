package generic.ex3;

import generic.animal.Cat;
import generic.animal.Dog;

public class AnimalHospitalMainV3 {
    public static void main(String[] args) {
        final AnimalHospitalV3<Dog> dogHospital = new AnimalHospitalV3<>();
        final AnimalHospitalV3<Cat> catHospital = new AnimalHospitalV3<>();

        final Dog dog = new Dog("멍멍이", 100);
        final Cat cat = new Cat("야오이", 300);

        dogHospital.set(dog);
        dogHospital.checkup();

        catHospital.set(cat);
        catHospital.checkup();

        // 컴파일 오류가 발생하지 않음, 문제가 생겨야 정상
        // dogHospital에 cat이 들어가니까..
        // 이제는 cat 안됨
        // dogHospital.set(cat);

        dogHospital.set(dog);
        final Dog bigger = (Dog) dogHospital.bigger(new Dog("멍멍이", 200));
        System.out.println(bigger);
    }
}
