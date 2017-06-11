package collections_and_sorting_collections;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * Created by c1900406 on 01/01/2016.
 */
public class Iterators {
    public static void main(String[] args) {

        LinkedList<String>  animals = new LinkedList<>();

        animals.add("fox");
        animals.add("cat");
        animals.add("dog");
        animals.add("rabbit");

        //Before Java 5

        Iterator<String> it = animals.iterator();   //returns an iterator pointing at all items in the list
        //points at each item in turn in the list or set or map


        //System.out.println("Using Iterator :" + "\n" + it.next() + "\n" + it.next() + "\n" + it.next() + "\n");

        /**
         * If items need to be added to a list while iterating over it, must use
         * ListIteratorExample rather than just Iterator
         *
         * Below, hasNext() returns true, if there is another item in the list, false if there isn't
         */
        while (it.hasNext()) {
            String value = it.next();   //value will be "fox" and 'it' will refer to "cat" as the next item
            System.out.println(value);

            if (value.equals("cat")) {
                it.remove();
            }

        }

        System.out.println("\n" + "Modern Iterators");

        /**
         * Modern iteration, Java 5 +
         * The is using Iterator behind the scenes
         * So if Iterable is implemented for a Collection then - a foreach loop can be used to iterate over the class
         */

        for(String animal: animals) {
            System.out.println(animal);

            //animals.remove(); //will get a ConcurrentModificationException here because
                                // trying to remove an item from a list whilst iterating over it - NOT POSSIBLE!
                                //have to use an iterator when doing this
        }
    }
}
