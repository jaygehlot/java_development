import java.util.*;

public class Test {

    public Map<String, String> mapAB2(Map<String, String> map) {
        Set<String> temp = new HashSet<>();

        map.forEach((key, value) -> {

            if (key.equals("a")) {
                temp.add(value);
            }

            if (key.equals("b")) {
                temp.add(value);
            }

        });

        if ((temp.size() == 1) && (map.containsKey("a") && (map.containsKey("b")))) {
                map.remove("a");
                map.remove("b");
                return map;

        } else {
            return map;
        }
    }
}
