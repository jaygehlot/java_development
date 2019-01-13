import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class FooTest {

    @Test
    public void test() {
        Foo foo = new Foo();
        Assert.assertEquals(foo.getBar(), "Foobar");
    }

    @Test
    public void mapIt() {
        Map<String, Integer> map = new HashMap<>();
        String[] array = new String[] {"jay", "gehlot"};
        List<String> list = Arrays.stream(array).distinct().collect(Collectors.toList());

        list.forEach(element -> map.put(element, 0));

        map.forEach((key, value) -> System.out.printf("Key: %s Value: %s", key, value));


    }

}