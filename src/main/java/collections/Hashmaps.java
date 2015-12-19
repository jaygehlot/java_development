package collections;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by c1900406 on 18/12/2015.
 */
public class Hashmaps {

    public static void main(String[] args) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(8, "Eight");
        map.put(10, "Ten");
        map.put(6, "Six");

        map.put(10, "Number Ten");

        String text = map.get(10);

        //System.out.println(text);
        //HashMap does not maintain order at all

        for (Map.Entry<Integer, String> item : map.entrySet()) {
            System.out.println(item.getValue());


            int key = item.getKey();
            String value = item.getValue();

            System.out.println(key + ":" + value);

        }
    }
}
