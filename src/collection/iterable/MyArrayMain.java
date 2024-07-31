package collection.iterable;

import java.util.Iterator;

public class MyArrayMain {

    public static void main(String[] args) {
        final MyArray arr = new MyArray(new int[]{1, 2, 3, 4, 5});

        final Iterator<Integer> iterator = arr.iterator();

        System.out.println("iterator 사용");

        while (iterator.hasNext()) {
            final Integer next = iterator.next();
            System.out.println(next);
        }

        // 추가
        System.out.println("for-each 사용");
        
        for (int val : arr) {
            System.out.println("val = " + val);
        }
    }
}
