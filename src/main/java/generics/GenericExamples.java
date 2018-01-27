package generics;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class GenericExamples {

    @Test
    public void boxExampleTest() {

        List<Box> boxes = new ArrayList<>();

        Box box1 = new Box();
        box1.setObject("a string");

        Box box2 = new Box();
        box2.setObject("another string");

        boxes.add(box1);
        boxes.add(box2);
    }
}
