package highorderfunctions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Predicate;

/**
 * Based on https://www.youtube.com/watch?v=_HzzKfw9yeE
 */
public class HighOrderFunction {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        BiFunction<List<Integer>, Predicate<Integer>, List<Integer>> filter;

        filter = (inputList, predicate) -> {
            List<Integer> result = new ArrayList<>();
            //filter
            for (Integer element : list) {
                if (predicate.test(element)) {
                    result.add(element);
                }
            }
            return result;
        };

        System.out.println(filter.apply(list, x -> x % 2 == 0)); //spits out even numbers
    }
}
