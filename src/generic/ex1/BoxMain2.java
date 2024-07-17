package generic.ex1;

public class BoxMain2 {

    public static void main(String[] args) {
        final ObjectBox integerBox = new ObjectBox();
        integerBox.set(10);
        final Integer integer = (Integer) integerBox.get();
        System.out.println("integer = " + integer);

        final ObjectBox stringBox = new ObjectBox();
        stringBox.set("hello");
        final String string = (String) stringBox.get();
        System.out.println("string = " + string);

        integerBox.set("문자100");
        final Integer result = (Integer) integerBox.get();
        System.out.println("result = " + result);
    }
}
