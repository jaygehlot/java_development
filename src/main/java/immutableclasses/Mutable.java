package immutableclasses;

/**
 * If you can extend an immutable class (which means it's not final),
 * you can add mutable properties to the sub-class, which would make your sub-class mutable,
 * and therefore the base class would also be mutable, since it can have mutable sub-classes.
 */
public class Mutable extends Immutable{

    private int realValue;

    public Mutable(int value) {
        super(value);

        realValue = value;
    }

    public int getValue() {
        return realValue;
    }

    public void setValue(int newValue) {
        realValue = newValue;
    }

    public static void main(String[] arg){
        Mutable obj = new Mutable(4);
        Immutable immObj = obj;
        System.out.println(immObj.getValue());
        obj.setValue(8);
        System.out.println(immObj.getValue());
    }
}
