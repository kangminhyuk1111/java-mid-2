package generic.ex4;

public class MethodMain1 {

    public static void main(String[] args) {
        final Integer i = 10;

        GenericMethod.objMethod(i);

        // 타입 인자 명시적 전달
        System.out.println("타입 인자 명시적 전달");
        Integer result = GenericMethod.<Integer>genericMethod(i);
        Integer integerValue = GenericMethod.<Integer>numberMethod(10);
        Double doubleValue = GenericMethod.<Double>numberMethod(20.0);

        Integer result2 = GenericMethod.genericMethod(i);
        Integer integerValue2 = GenericMethod.numberMethod(10);
        Double doubleValue2 = GenericMethod.numberMethod(20.0);
    }
}
