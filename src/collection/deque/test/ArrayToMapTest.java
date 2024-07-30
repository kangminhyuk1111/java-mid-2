package collection.deque.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {

    public static void main(String[] args) {
        String[][] productArr = {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

        final Map<String, Integer> map = new HashMap<>();

        for (String[] s : productArr) {
            map.put(s[0],Integer.parseInt(s[1]));
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("제품: " + entry.getKey() + ", 가격: " + entry.getValue());
        }
    }
}
