package collection.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapMain1 {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();

        map.put("A",90);
        map.put("B",80);
        map.put("C",100);
        map.put("D",90);
        System.out.println(map);

        final Integer a = map.get("A");
        System.out.println(a);

        final Set<String> keys = map.keySet();
        System.out.println(keys);
        for (String key : keys) {
            final Integer integer = map.get(key);
            System.out.println("integer = " + integer);
        }

        final Collection<Integer> values = map.values();
        for (Integer value : values) {
            System.out.println("value = " + value);
        }

        final Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            final String key = entry.getKey();
            final Integer value = entry.getValue();

            System.out.println("key => " + key + ", value => " + value);
        }
    }
}
