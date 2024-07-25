package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV1 {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    LinkedList<Integer>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV1() {
        buckets = new LinkedList[capacity];
        initBuckets(capacity);
    }

    public MyHashSetV1(int capacity) {
        this.capacity = capacity;
        buckets = new LinkedList[capacity];
        initBuckets(capacity);
    }

    private void initBuckets(final int capacity) {
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(int value) {
        int hashIndex = hashIndex(value);
        final LinkedList<Integer> bucket = buckets[hashIndex];

        if (bucket.contains(value)) {
            return false;
        }

        bucket.add(value);
        size++;

        return true;
    }

    public boolean contains(int searchValue) {
        final int hashIndex = hashIndex(searchValue);
        final LinkedList<Integer> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    public boolean remove(int value) {
        final int hashIndex = hashIndex(value);
        final LinkedList<Integer> bucket = buckets[hashIndex];
        // 일반 int로 하면 index를 지움, 값으로 지울려면 래퍼 클래스 사용
        final boolean remove = bucket.remove(Integer.valueOf(value));

        if (remove) {
            size--;
            return true;
        } else {
            return false;
        }

    }

    private int hashIndex(int value) {
        return value % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV1{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
