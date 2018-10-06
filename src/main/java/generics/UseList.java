package generics;

import java.util.ArrayList;
import java.util.List;

public class UseList {

    public static void main(String[] args) {
// Image you have
//        public class A { }
//        public class B extends A { }
//        public class C extends A { }


        /**
         * we have a list of something but don't know what that type is
         *
         */
        //List<?> numberList = new ArrayList<>();

        /**
        *       List<? extends A> means a List of objects that are instances of the class A, or subclasses of A (e.g. B and C).
        *       When you know that the instances in the collection are of instances of A or subclasses of A,
        *       it is safe to read the instances of the collection and cast them to A instances
        */
        //List<? extends Number> numberList = new ArrayList<>();


        /**
         * List<? super A> means that the list is typed to either the A class, or a superclass of A.
         * When you know that the list is typed to either A, or a superclass of A,
         * it is safe to insert instances of A or subclasses of A (e.g. B or C) into the list
         */

        //List<? super Number> numberList = new ArrayList<>();

        /**
         * This is the most explicit
         */
        List<Number> numberList = new ArrayList<>();


    }



}
