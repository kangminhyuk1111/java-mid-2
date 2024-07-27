package collection.set;

import java.util.Arrays;
import java.util.LinkedList;

public class MyHashSetV3<E> implements MySet<E> {

    static final int DEFAULT_INITIAL_CAPACITY = 16;

    private LinkedList<E>[] buckets;

    private int size = 0;
    private int capacity = DEFAULT_INITIAL_CAPACITY;

    public MyHashSetV3() {
        buckets = new LinkedList[capacity];
        initBuckets(capacity);
    }

    public MyHashSetV3(int capacity) {
        this.capacity = capacity;
        buckets = new LinkedList[capacity];
        initBuckets(capacity);
    }

    private void initBuckets(final int capacity) {
        for (int i = 0; i < capacity; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public boolean add(E value) {
        int hashIndex = hashIndex(value);
        final LinkedList<E> bucket = buckets[hashIndex];

        if (bucket.contains (value)) {
            return false;
        }

        bucket.add(value);
        size++;

        return true;
    }

    public boolean contains(E searchValue) {
        final int hashIndex = hashIndex(searchValue);
        final LinkedList<E> bucket = buckets[hashIndex];
        return bucket.contains(searchValue);
    }

    public boolean remove(E value) {
        final int hashIndex = hashIndex(value);
        final LinkedList<E> bucket = buckets[hashIndex];
        // 일반 int로 하면 index를 지움, 값으로 지울려면 래퍼 클래스 사용
        final boolean remove = bucket.remove(value);

        if (remove) {
            size--;
            return true;
        } else {
            return false;
        }

    }

    private int hashIndex(E value) {
        int hashCode = value.hashCode();
        return Math.abs(hashCode) % capacity;
    }

    public int getSize() {
        return size;
    }

    @Override
    public String toString() {
        return "MyHashSetV2{" +
                "buckets=" + Arrays.toString(buckets) +
                ", size=" + size +
                ", capacity=" + capacity +
                '}';
    }
}
