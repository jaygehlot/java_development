package collections_and_sorting_collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * Created by c1900406 on 19/12/2015.
 */
public class SortedMaps {

    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();

        //linked hash map has linked list connecting entries - allows for ordering
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();  //linkedhashmap goes with natural ordering

        Map<Integer, String> treeMap = new TreeMap<>(); //treemap orders the data for you

        testMap(treeMap);
    }

    public static void testMap(Map<Integer, String> map){
        map.put(9, "fox");
        map.put(18, "cat");
        map.put(3, "dog");
        map.put(7, "elephant");
        map.put(29, "snake");
        map.put(12, "bird");
        map.put(4, "giraffe");
        map.put(15, "owl");
        map.put(31, "pigeon");

        for(Integer key: map.keySet()) {
            String value = map.get(key);

            System.out.println(key + ":" + value);
        }
    }
}
