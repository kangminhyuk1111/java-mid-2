package collection.compare;

import java.util.LinkedList;
import java.util.List;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortMain5 {

    public static void main(String[] args) {

        final MyUser a = new MyUser("a", 30);
        final MyUser b = new MyUser("b", 20);
        final MyUser c = new MyUser("c", 10);

        final TreeSet<MyUser> treeSet = new TreeSet<>();
        treeSet.add(a);
        treeSet.add(b);
        treeSet.add(c);
        System.out.println(treeSet);

        final TreeSet<MyUser> treeSet2 = new TreeSet<>(new IdComparator());
        treeSet2.add(a);
        treeSet2.add(b);
        treeSet2.add(c);
        System.out.println(treeSet2);
    }
}
