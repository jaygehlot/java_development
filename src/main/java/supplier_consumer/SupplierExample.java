package supplier_consumer;

import java.util.Calendar;
import java.util.function.Supplier;

public class SupplierExample {

    public static void main(String[] args) {
        Supplier<Calendar> calendarSupplier = new Supplier<Calendar>() {
            @Override
            public Calendar get() {
                return null;
            }
        };

        Calendar calendar = calendarSupplier.get();

        System.out.println(calendar.getTime());
    }

}
