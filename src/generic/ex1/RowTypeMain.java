package generic.ex1;

public class RowTypeMain {

    public static void main(String[] args) {
        final GenericBox integerBox = new GenericBox();

        integerBox.set(100);

        final Object o = integerBox.get();

        System.out.println("o = " + o);

        // 아무것도 안넣으면 object
    }
}
