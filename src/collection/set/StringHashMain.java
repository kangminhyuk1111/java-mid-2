package collection.set;

public class StringHashMain {

    static final int CAPACITY = 10;

    public static void main(String[] args) {
        char charA = 'A';
        char charB = 'B';
        System.out.println("charA = " + charA);
        System.out.println("charB = " + charB);

        final int hashA = hashCode("A");
        final int hashB = hashCode("B");
        final int hashAB = hashCode("AB");
        System.out.println("hashA = " + hashA);
        System.out.println("hashB = " + hashB);
        System.out.println("hashAB = " + hashAB);

        int hashIndex = hashIndex(hashCode("A"));
        System.out.println("hashIndex = " + hashIndex);
    }

    static int hashCode(String str) {
        final char[] charArray = str.toCharArray();
        int sum = 0;
        for (char c : charArray) {
            sum += (int) c;
        }
        return sum;
    }

    static int hashIndex(int value) {
        return value % CAPACITY;
    }
}
