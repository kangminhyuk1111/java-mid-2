package collection.array;

public class MyArrayListV3BadMain {

    public static void main(String[] args) {
        final MyArrayListV3 nl3 = new MyArrayListV3();

        nl3.add(1);
        nl3.add(2);
        nl3.add("문자");

        System.out.println(nl3);

        final Integer num1 = (Integer) nl3.get(0);
        final Integer num2 = (Integer) nl3.get(1);
        final Integer num3 = (Integer) nl3.get(2);

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
    }
}
