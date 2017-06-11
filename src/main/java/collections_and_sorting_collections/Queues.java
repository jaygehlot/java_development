package collections_and_sorting_collections;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/**
 * Created by c1900406 on 01/01/2016.
 */
public class Queues {

    public static void main(String[] args) {

        // https://docs.oracle.com/javase/7/docs/api/java/util/Queue.html
        //queue of people
        ///   (front/head) <----  oooooooo <--- (tail) - FIFO (first in, first out)

        // ArrayBlockingQueue has a fixed size to it, in this case set to 3, normally queues can be endless
        Queue<Integer> q1 = new ArrayBlockingQueue<>(3);

        //System.out.println(q1.element()); //throws an exception because there is nothing in the queue
        System.out.println(q1.peek());  //peek returns head of queue but doesn't throw an exeception

        //add() has an unchecked exception, a runtime exception - here adding more than 3 items to the queue
        //wont see the following exception with LinkedList, because you can limitless items to the LinkedList
        q1.add(10);
        q1.add(20);
        q1.add(30);

        System.out.println("Head of the queue: " + q1.element());
        System.out.println(q1.peek());

        try{
            q1.add(40);
        } catch (IllegalStateException e) {
            System.out.println("Tried to add too many items to the queue");
        }


        for (Integer value : q1) {
            System.out.println("Queue entry is: " +value);
        }

        //removes 10, 20, 30
        System.out.println("Removed from queue: " + q1.remove());
        System.out.println("Removed from queue: " + q1.remove());
        System.out.println("Removed from queue: " + q1.remove());

        //however can't remove a 4th since it doesn't exist
        try{
         q1.remove();
        } catch (NoSuchElementException e) {
            System.out.println("Tried removing too many items from queue.");
        }

        /****************************************************************
         * More about Queues - VERY USEFUL IN MULTI-THREADING
         */

        Queue<Integer> q2 = new ArrayBlockingQueue<>(2);

        System.out.println("\n 2nd Queue Peek " + q2.peek()); //returns null if queue is empty

        //offer returns true if the element was added, false if not
        q2.offer(10);
        q2.offer(20);

        System.out.println("\n 2nd Queue Peek: " + q2.peek());

        if (q2.offer(30) == false ){
            System.out.println("\nFailed to add 3rd item");
        }


        for (Integer value : q2) {
            System.out.println("2nd Queue entry is: " +value);
        }

        //polls removes items from the head of the queue if available
        System.out.println("\n2nd Queue poll :" + q2.poll());
        System.out.println("2nd Queue poll :" + q2.poll());
        System.out.println("2nd Queue poll :" + q2.poll());

    }
}
