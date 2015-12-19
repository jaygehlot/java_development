package list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by c1900406 on 31/08/2015.
 */
public class LinkedListExample {

    public static void main(String[] args) {
        /**
         * ArrayLists manage Arrays internally - searching is also faster because of the use
         * of indexes
         * [0][1][2][3][4]......
         * To add a new item in array, if greater than default size of array
         * a new array is created, existing items are copied over and then
         * new entry is added - quick for adding/removing items to end or near end of
         * ArrayList
         */
        List<Integer> arrayList = new ArrayList<>();

        /**
         * LinkedLists consists of elements where each element has
         * a reference to the previous and next element
         * [0]<->[1]<->[2]<->[3]<->[4]
         * Add a new element at the beginning or middle is easy and quick,
         * just need to change the reference to the item before and after
         */
        List<Integer> linkedList = new LinkedList<>();

        doTimings("ArrayList", arrayList);
        doTimings("LinkedList", linkedList);


    }

    //can pass in the List interface because both ArrayList and LinkedList implement the List
    //interface
    private static void doTimings(String type, List<Integer> list){

        for (int i=0; i< 1E5; i++){
            list.add(i);
        }

        long start = System.currentTimeMillis();

        //add items to the end of the list
//        for (int i=0; i< 1E5; i++) {
//            list.add(i);
//        }

        //add items at the beginning of the list with the number i
        for (int i=0; i< 1E5; i++) {
            //adding items at the beginning, LinkedList is faster
            list.add(0, i);

            //adding to the end of the list - ArrayList is faster
            //list.add(list.size());

            //adding near the end (100 items from the end), ArrayList is faster
            //list.add(list.size() - 100, i);
        }

        //at the beginning or middle of the list, LinkedList is much faster than ArrayList
        //at the end or near the end of the list, ArrayList is faster than LinkedList

        long end = System.currentTimeMillis();

        System.out.println("Time taken: " + (end - start) + " ms for " + type);

//        LinkedList element deletion is faster compared to ArrayList.
//
//        Reason: LinkedList’s each element maintains two pointers (addresses)
//                which points to the both neighbor elements in the list. Hence
//        removal only requires change in the pointer location in the two neighbor
//        nodes (elements) of the node which is going to be removed. While In ArrayList
//        all the elements need to be shifted to fill out the space created by removed element.


    }
}
