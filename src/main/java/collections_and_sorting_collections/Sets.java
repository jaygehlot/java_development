package collections_and_sorting_collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by c1900406 on 19/12/2015.
 */
public class Sets {
    public static void main(String[] args) {

        //Set<String> set1 = new HashSet<>();

        //Set<String> set1 = new LinkedHashSet<>(); //linkedhashset remembers order you added the items in

        Set<String> set1 = new TreeSet<>();

        if (set1.isEmpty()) {
            System.out.println("Set is empty");
        }

        set1.add("Cat");
        set1.add("Dog");
        set1.add("Mouse");
        set1.add("Snake");
        set1.add("Bear");

        //sets contain unique items

        set1.add("Bear");
        set1.add("Dog");

        if (set1.isEmpty()) {
            System.out.println("Set is empty");
        }

        System.out.println(set1);

        //iteration through set
        for(String element: set1) {
            System.out.println(element);
        }

        // Does set contain a given item
        System.out.println(set1.contains("Dog1"));


        /////////////////INTERSECTION//////////////////
        Set<String> set2 = new TreeSet<>();

        set2.add("Cat");
        set2.add("Dog");
        set2.add("Giraffe");
        set2.add("Monkey");
        set2.add("Ant");

        //passing set1 to the constructor will make 'intersection' a copy of set1
        Set<String> intersection = new HashSet<>(set1);

        intersection.retainAll(set2);
        // retain only COMMON elements between set1 and set2
        //so the intersection set is an intersection between set1 and set2

        System.out.println(intersection);

        //////////////// DIFFERENCE /////////////////////

        Set<String> difference = new HashSet<>(set1);  //difference is a copy of set1

        //remove all common o
        difference.removeAll(set2); // leaves all the elements in set1 that are NOT in set2

        System.out.println(difference);

    }
}
