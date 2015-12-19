package list;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by c1900406 on 31/08/2015.
 */
public class ArrayListExample {

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(50);
        numbers.add(20);

        System.out.println(numbers.get(0));

        System.out.println("Iteration 1:");

        for (int i=0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));
        }

        //easier to remove things from the end of the list
        numbers.remove(numbers.size() -1);

        //removing items from ArrayList at first position can be very slow - because you are moving everything
        //to the left of the list, where the gap is - this is time consuming
        numbers.remove(0);

        System.out.println("\nIternation 2:");

        for(Integer value: numbers){
            System.out.println(value);
        }
    }
}
