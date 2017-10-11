package high_order_function;

public class Convert {

    public static void main(String[] args) {
        Converter converter = new Converter();
        double tenMileInKm = converter.apply(1.609, 10.0);
        double twentyMilesInKm = converter.apply(1.609, 20.0);
        double fiftyMilesInKm = converter.apply(1.609, 50.0);
    }
}
