package generic.ex3;

public class AnimalHospitalV2<T> {

    private T animal;

    public void set(final T animal) {
        this.animal = animal;
    }

    public void checkup() {
        // T의 타입을 메서드를 정의하는 시점에는 알 수 없다.
//        System.out.println("동물 이름: " + animal.getName());
//        System.out.println("동물 이름: " + animal.getSize());
//        animal.sound();
    }

    public T bigger(T target) {
//        return animal.getSize() > target.getSize() ? animal : target;
        return target;
    }
}
