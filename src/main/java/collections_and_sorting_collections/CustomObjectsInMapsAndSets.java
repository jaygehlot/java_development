package collections_and_sorting_collections;

import java.util.*;

/**
 * Created by c1900406 on 20/12/2015.
 */

class Person {
    private int id;
    private String name;

    public Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{ID is " + id + "; Name is " + name + "}";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        final Person other = (Person) obj;
        if (id != other.id)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        return true;
    }
}

public class CustomObjectsInMapsAndSets {
    public static void main(String[] args) {

        Person p1 = new Person(0, "Bob");
        Person p2 = new Person(1, "Sue");
        Person p3 = new Person(2, "Mike");
        Person p4 = new Person(1, "Sue");


        Map<Person, Integer> map = new LinkedHashMap<>();

            //keys are map are UNIQUE - will not get repeated
            //unless custom objects are used
            //if custom objects are used, then toString and equals must be implemented
            //for Person to be correctly compared, so that "Sue" is only printed out once
            //Sets wont go inside the object to check what the name is so equals and hashcode must be overriden
        map.put(p1, 1);
        map.put(p2, 2);
        map.put(p3, 3);
        map.put(p4, 1);  //Sue is updated to 1 by this entry

        //System.out.println(map); //this prints out toString which is overriden in Person
                                    //we are adding Person objects to the map

        //toString provides the key, which we have overriden in Person
        for(Person key: map.keySet()) {
            System.out.println(key + ":" + map.get(key));
            //System.out.println(key);
        }

        Set<Person> set = new LinkedHashSet<>();

        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);

        System.out.println(set);
    }
}
