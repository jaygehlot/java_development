package generics;

public class UseOne {


    public static void main(String[] args) {

        ExampleOne<Number> numbers = new ExampleOne<>();

        numbers.setValue(4);

        final Number value = numbers.getValue();

        System.out.println(value);
    }
}
