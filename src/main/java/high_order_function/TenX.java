package high_order_function;

import java.util.function.Function;

//this class could also implement the interface Function and implement apply

public class TenX implements IntUnaryFunction {

    public int apply(int x) {
        return 10 * x;
    }

//    @Override
//    public Integer apply(Integer t) {
//        return 10 * t;
//    }
}
