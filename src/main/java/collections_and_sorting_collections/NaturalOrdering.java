package collections_and_sorting_collections;

import java.util.*;

/**
 * Created by c1900406 on 26/12/2015.
 */

/**
 * In order to add items of this class to a TreeSet
 * you MUST define a natural order for the TreeSet (only) since for non-primitive
 *
 * types, some ordering must be defined for this collection, you do this my implementing
 * the Comparable interface and then adding in implementation for the overrided compareTo method
 *
 *
 * Comparable                                    |  Comparator - implementing classes Collator and RuleBasedCollator
 * ----------------------------------------------------------------------------------------------------------------
 * Defines default natural sorting order         |  Define a customised sorting order
 *                                               |
 * Present in java.lang                          |  Present in java.util
 *                                               |
 * Has one method compareTo()                    |  Has two methods compare() and equals()
 *                                               |
 * All wrapper classes and String classes        |
 * implement this interface                      |
 *
 */
class My_Person implements Comparable<My_Person>{
    private String name;

    public My_Person(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

    //To add objects to a Set hashcode and equals must be defined for the class

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        My_Person my_person = (My_Person) o;
        return Objects.equals(name, my_person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public int compareTo(My_Person person) {
        return -name.compareTo(person.name);
    }
}

public class NaturalOrdering {

    public static void main(String[] args) {

        List<My_Person> list = new ArrayList<>();

        //Trees store data sorted in their natural order - alphabetically and numerically
        //HashSet is an unsorted Set
        Set<My_Person> set = new TreeSet<>();   //can't add elements to a Treeset unless it
                                                        //it has a natural order defined
                                                        //do this by implementing Comparable on My_Person

        addElement(list);
        addElement(set);

        Collections.sort(list);   //this will sort the collection for primitive type or primitive classes
                                    //not for non-primitive Objects

        showElement(list);
        System.out.println("\n");
        showElement(set);

    }

    /**
     * Collection is the parent interface so can add this to the
     * method definition
     * @param collection
     */
    private static void addElement(Collection<My_Person> collection) {
        collection.add(new My_Person("Joe"));
        collection.add(new My_Person("Sue"));
        collection.add(new My_Person("Juliet"));
        collection.add(new My_Person("Clare"));
        collection.add(new My_Person("Mike"));
        collection.add(new My_Person("Clare"));
    }


    private static void showElement(Collection<My_Person> collection) {
        for(My_Person element: collection) {
            System.out.println(element);
        }
    }
}
