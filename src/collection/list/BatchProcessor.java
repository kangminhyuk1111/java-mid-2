package collection.list;

public class BatchProcessor {

    private final MyList<Integer> list;

    public BatchProcessor(final MyList<Integer> list) {
        this.list = list;
    }

    public void logic(int size) {
        final long start = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            list.add(0, i);
        }
        final long end = System.currentTimeMillis();
        System.out.println("크기 : " + size + ", 계산 시간 : " + (end-start) + "ms");
    }
}
