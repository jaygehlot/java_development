package timbuchalka_interfaces;

import com.practice.Apple;

import java.util.List;
import java.util.function.Predicate;

import static java.util.stream.Collectors.toList;

public class Apples {

    public static List<Apple> filterHeavyApples(List<Apple> inventory, Predicate<Apple> applePredicate) {
        return inventory.stream()
                .filter(applePredicate::test)
                .collect(toList());
    }
}
