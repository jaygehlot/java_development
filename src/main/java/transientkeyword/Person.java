package transientkeyword;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 27/11/14
 * Time: 20:34
 * To change this template use File | Settings | File Templates.
 */
public class Person implements Serializable{   //have to implement Serializable to be able to serialize an object of this class

    private int id;
    private String name;
    private transient int age;

    //serialisation doesn't apply to static fields  because these belong to the class and
    // you object data doesn't apply to these fields. It doesn't make sense to constantly serialise
    // the same data again and again
    private static int count;

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Person.count = count;
    }

    //the reason for adding a default constructor was because
    //in de-serialisation a constructor don't really come into use
    public Person(){
        System.out.println("Default constructor");
    }

    public Person(int id, String name, int age){
        this.id = id;
        this.name = name;
        this.age = age;

        System.out.println("Two argument constructor");
    }

    //count will be displayed as zero as the integer default as count
    // is static and cannot be serialised
    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age + "; Count is: " + count +
                '}';
    }
}
