package collection.compare;

import java.util.Arrays;

public class SortMain3 {

    public static void main(String[] args) {

        final MyUser a = new MyUser("a", 30);
        final MyUser b = new MyUser("b", 20);
        final MyUser c = new MyUser("c", 10);

        MyUser[] array = {a, b, c};
        System.out.println("기본 데이터");
        System.out.println(Arrays.toString(array));
        System.out.println("Comparable 기본 정렬");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
    }
}
