package generics;

public class ExampleOne<T> {

    private T value;

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        T temp = value;
        this.value = temp;
    }

    public static <Z> Z noOp(Z val) {
        return val;
    }
}
