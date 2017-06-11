package collections_and_sorting_collections;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by c1900406 on 01/01/2016.
 */
public class ListIteratorExample {

    public static void main(String[] args) {
        List<Integer> numList = new LinkedList<>();

        numList.add(5);
        numList.add(10);
        numList.add(15);
        numList.add(20);
        numList.add(25);

        // Generate an iterator. Start just after the last element, enter this as a parameter
        ListIterator<Integer> iterator= numList.listIterator(numList.size());

        while (iterator.hasPrevious()) {
            Integer value = iterator.previous();
            //starting at the beginning
            //value will point to 25 and then the cursor will be pointing at 20
            //then on the next iteration value will be 20 and the cursor will be pointing to 15
            //next() allows us to move forward and previous() allows us to move backwards
            System.out.println(value);

            //add an item to the head of the list going backwards
            if (iterator.hasPrevious() == false) {
                iterator.add(0);
                break;
            }

            if (value % 2 == 0) {
                iterator.next();
                iterator.add(value + 2);
                iterator.previous();
                iterator.previous();
            }

        }

        for(Integer e: numList) {
            System.out.println(e);
        }

    }

}
