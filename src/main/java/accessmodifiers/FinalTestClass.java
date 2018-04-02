package accessmodifiers;

public class FinalTestClass {

    private static int classCounter = 0;
    private final int instanceNumber;
    private String name;

    public FinalTestClass(String name) {
        this.name = name;
        classCounter ++;
        this.instanceNumber = classCounter;
        System.out.println(name + "created, instance is " + instanceNumber);
    }

    public int getInstanceNumber() {
        return instanceNumber;
    }
}
