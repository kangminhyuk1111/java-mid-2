package collection.set;

public class MyHashSetV3Main {

    public static void main(String[] args) {
        MyHashSetV3<String> set = new MyHashSetV3<>(10);

        set.add("a");
        set.add("b");
        set.add("c");
        set.add("d");

        System.out.println(set);

        String searchValue = "A";
        boolean contains = set.contains(searchValue);
        System.out.println("contains = " + contains);

        MyHashSetV3<Integer> integerSet = new MyHashSetV3<>(10);

        integerSet.add(1);
        integerSet.add(2);
        integerSet.add(3);
//        integerSet.add("4");
    }
}
