package functionalinterface;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        System.out.println(increment(1));

        Integer incrementBy = incrementByFunction.apply(1);
        System.out.println(incrementBy);

        System.out.println(multipleByFunction.apply(incrementBy));

        System.out.println("//CHAINING Function - takes 1 argument produces 1 result");

        Function<Integer, Integer> incrementAndMultiply = incrementByFunction.andThen(multipleByFunction);
        System.out.println(incrementAndMultiply.apply(1));

        System.out.println("//BiFunction - takes 2 arguments and produces 2 results");
        System.out.println(incrementByOneAndMultiplyBiFunction.apply(5, 10));

    }

    private static Function<Integer, Integer> incrementByFunction = number -> number + 1;
    private static Function<Integer, Integer> multipleByFunction = number -> number * 10;

    private static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyBiFunction = (numberToIncrementByOne, numberToMultiplyBy) ->
            (numberToIncrementByOne + 1) *numberToMultiplyBy;


    private static int increment(int number) {
        return number + 1;
    }

    private static int incrementAndMultiply(int number, int multiply) {
        return (number + 1) * multiply;
    }
}
