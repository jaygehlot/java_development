package high_order_function;

import java.util.function.BiFunction;

public class Converter implements BiFunction<Double, Double, Double> {

    @Override
    public Double apply(Double conversionRate, Double value) {
        return conversionRate * value;
    }
}
