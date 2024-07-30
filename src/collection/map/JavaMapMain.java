package collection.map;

import java.util.*;

public class JavaMapMain {

    public static void main(String[] args) {
        run(new HashMap<>());
        run(new LinkedHashMap<>());
        run(new TreeMap<>());
    }

    private static void run(Map<String, Integer> map) {
        map.put("A",10);
        map.put("3",20);
        map.put("D",30);
        map.put("1",40);
        map.put("E",50);

        final Set<String> keySet = map.keySet();
        final Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            final String key = iterator.next();
            System.out.println("key = " + key + ", value = " + map.get(key));
        }
        System.out.println();
    }
}
