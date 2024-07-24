package collection.list;

public class BatchProcessorMain {

    public static void main(String[] args) {
        final BatchProcessor basicProcessor = new BatchProcessor(new MyArrayList<>());
        final BatchProcessor linkProcessor = new BatchProcessor(new MyLinkedList<>());

//        basicProcessor.logic(100_000);

        linkProcessor.logic(1_000_000);
    }
}
