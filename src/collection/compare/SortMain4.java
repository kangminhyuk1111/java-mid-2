package collection.compare;

import java.util.LinkedList;
import java.util.List;

public class SortMain4 {

    public static void main(String[] args) {

        final MyUser a = new MyUser("a", 30);
        final MyUser b = new MyUser("b", 20);
        final MyUser c = new MyUser("c", 10);

        List<MyUser> list = new LinkedList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        System.out.println("기본 데이터");
        System.out.println(list);
        System.out.println("Comparable 기본 정렬");
        list.sort(null);
        //Collections.sort(list);
        System.out.println(list);
        System.out.println("IdComparator 정렬");
        list.sort(new IdComparator());
        //Collections.sort(list, new IdComparator());
        System.out.println(list);
    }
}
