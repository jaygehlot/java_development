package accessmodifiers;

public class MainFinalTestClass {

    public static void main(String[] args) {
        FinalTestClass one = new FinalTestClass("one");
        FinalTestClass two = new FinalTestClass("two");
        FinalTestClass three = new FinalTestClass("three");

        System.out.println(one.getInstanceNumber());
        System.out.println(two.getInstanceNumber());
        System.out.println(three.getInstanceNumber());

        System.out.println(Math.PI);



    }
}
