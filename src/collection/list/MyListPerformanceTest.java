package collection.list;

public class MyListPerformanceTest {

    public static void main(String[] args) {
        int size = 50_000;
        System.out.println("== MyArrayList 추가 ==");
        addFirst(new MyArrayList<>(), size);
        addMid(new MyArrayList<>(), size);
        MyArrayList<Integer> arrayList = new MyArrayList<>();
        addLast(arrayList, size);

        int loop = 10_000;
        System.out.println("== MyArrayList 조회 ==");
        getIndex(arrayList, loop, 0);
        getIndex(arrayList, loop, size / 2);
        getIndex(arrayList, loop, size - 1);

        System.out.println("== MyLinkedList 추가 ==");
        addFirst(new MyLinkedList<>(), size);
        addMid(new MyLinkedList<>(), size);
        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        addLast(linkedList, size);

        System.out.println("== MyLinkedList 조회 ==");
        getIndex(linkedList, loop, 0);
        getIndex(linkedList, loop, size / 2);
        getIndex(linkedList, loop, size - 1);
    }

    private static void addFirst(MyList<Integer> list, int size) {
        final long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        final long end = System.currentTimeMillis();
        System.out.println("크기 : " + size + ", 계산 시간 : " + (end - start) + "ms");
    }

    private static void addMid(MyList<Integer> list, int size) {
        final long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i / 2, i);
        }
        final long end = System.currentTimeMillis();
        System.out.println("크기 : " + size + ", 계산 시간 : " + (end - start) + "ms");
    }

    private static void addLast(MyList<Integer> list, int size) {
        final long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(i);
        }
        final long end = System.currentTimeMillis();

        System.out.println("크기 : " + size + ", 계산 시간 : " + (end - start) + "ms");
    }

    private static void getIndex(MyList<Integer> list, int loop, int index) {
        final long start = System.currentTimeMillis();
        for (int i = 0; i < loop; i++) {
            list.get(index);
        }
        final long end = System.currentTimeMillis();
        System.out.println("index: " + index + ", 반복: " + loop + ", 계산 시간: " + (end - start) + "ms");
    }
}
