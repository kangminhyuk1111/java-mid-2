package generic.ex1;

public class BoxMain3 {

    public static void main(String[] args) {
        GenericBox<Integer> integerBox = new GenericBox<Integer>();
        GenericBox<Integer> integerBox2 = new GenericBox<>();
        integerBox.set(10);
        final Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        final GenericBox<String> stringGenericBox = new GenericBox<>();
        stringGenericBox.set("문자100");
        final String string = stringGenericBox.get();
        System.out.println("string = " + string);
    }
}
