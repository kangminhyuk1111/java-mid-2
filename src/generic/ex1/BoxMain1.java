package generic.ex1;

public class BoxMain1 {

    public static void main(String[] args) {
        final IntegerBox integerBox = new IntegerBox();
        integerBox.set(10);
        final Integer integer = integerBox.get();

        System.out.println("integer = " + integer);

        final StringBox stringBox = new StringBox();
        stringBox.set("hello");
        final String string = stringBox.get();

        System.out.println("s = " + string);
    }
}
