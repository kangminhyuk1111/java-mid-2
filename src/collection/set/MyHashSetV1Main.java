package collection.set;

public class MyHashSetV1Main {

    public static void main(String[] args) {
        final MyHashSetV1 set = new MyHashSetV1(10);
        set.add(1);
        set.add(2);
        set.add(5);
        set.add(8);
        set.add(14);
        set.add(99);
        set.add(9);
        System.out.println(set);

        int searchValue = 9;
        final boolean result = set.contains(searchValue);
        System.out.println("contains = " + result);

        final boolean removeResult = set.remove(searchValue);
        System.out.println("removeResult = " + removeResult);
        System.out.println(set);
    }
}
