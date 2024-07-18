package generic.test.ex1;

public class ContainerTest {

    public static void main(String[] args) {
        final Container<String> stringContainer = new Container<>();
        System.out.println("빈값 확인1: " + stringContainer.isEmpty());

        stringContainer.setItem("data1");
        System.out.println("저장 데이터: " + stringContainer.getItem());
        System.out.println("빈값 확인2: " + stringContainer.isEmpty());

        final Container<Integer> integerContainer = new Container<>();
        integerContainer.setItem(10);
        System.out.println("저장된 데이터: " + integerContainer.getItem());
    }
}
