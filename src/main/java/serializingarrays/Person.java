package serializingarrays;

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

    public Person(int id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" + "id=" + id + ", name='" + name + '\'' + '}';
    }
}
