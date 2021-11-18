package examples.week11;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Russia", "Moscow");
        map.put("Hungary", "Budapest");
        map.put("France", "Paris");
        map.put("USA", "Washington");
        map.put("Italy", "Rome");

        System.out.println("Keys--------------------------------------------------------------------------");
        for (String key: map.keySet()){
            System.out.println(key + ": " + map.get(key));
        }
        System.out.println();
        System.out.println("Values------------------------------------------------------------------------");
        for (String value: map.values()){
            System.out.println(value);
        }

        System.out.println();
        System.out.println("Entries--------------------------------------------------------");
        for (Map.Entry<String, String> entry: map.entrySet()){
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        System.out.println(map.containsKey("USA"));
        Set<String> set = new HashSet<>();
        set.add("alma");
        set.add("körte");
        set.add("alma");


    }

}
