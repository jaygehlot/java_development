package collections_and_sorting_collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by c1900406 on 20/12/2015.
 */

class MyPerson {
    private int id;
    private String name;

    MyPerson(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String toString() {
        return "ID: " + id + "; Name : " + name;
    }
}

/**
 * Sorts by String Length - shortest String at the top of the file
 *
 * Comparator is used to sort lists in a custom way - i.e not natural order
 *
 * * Comparable                                    |  Comparator - implementing classes Collator and RuleBasedCollator
 * ----------------------------------------------------------------------------------------------------------------
 * Defines default natural sorting order         |  Define a customised sorting order
 *                                               |
 * Present in java.lang                          |  Present in java.util
 *                                               |
 * Has one method compareTo()                    |  Has two methods compare() and equals()
 *                                               |
 * All wrapper classes and String classes        |
 * implement this interface                      |
 */
class StringLengthComparator implements Comparator<String> {

    //Comparator allows for customised sorting

    @Override
    public int compare(String s1, String s2) {

        //if the first argument should sort later in the list than the second one return 1
        // if the first argument should sort earlier in the list than the second one return -1
        if(s1.length() > s2.length()) {
            return 1;
        } else if (s1.length() < s2.length()) {
            return -1;
        }
        return 0;
    }
}

/**
 * Sorts strings in reverse alphabetically
 */
class ReverseAlphabeticalComparator implements Comparator<String> {

    @Override
    //compare returns the lists in alphabetical order, putting the minus in front
    // returns it in reverse alphabetical order
    public int compare(String s1, String s2) {
        return -(s1.compareTo(s2));
    }
}

class AlphabeticalComparator implements Comparator<String> {

    public int compare(String s1, String s2){
        //this method returns 1 if s1 is greater than s2, i.e if s1 sorts alphabetically later than s2
        //this method returns -1 if s1 is less than s2, i.e. if s1 sorts alphabetically before s1
        return s1.compareTo(s2);
    }
}

public class SortingLists {

    public static void main(String[] args) {

        /**************
         * SORTING STRINGS
         */
        List<String> animals = new ArrayList<>();

        animals.add("tiger");
        animals.add("cat");
        animals.add("lion");
        animals.add("snake");
        animals.add("mongoose");
        animals.add("elephant");

        Collections.sort(animals, new ReverseAlphabeticalComparator());  //sorts a List, in reverse alphabetical order, static method in Collections class
        //Collections.sort(animals, new AlphabeticalComparator());  //sorts a List, in alphabetical order, static method in Collections class

        for(String animal: animals) {
            System.out.println(animal);
        }

        /*******************
         * SORTING INTEGERS
         */
        List<Integer> numbers = new ArrayList<>();

        numbers.add(3);
        numbers.add(36);
        numbers.add(73);
        numbers.add(40);
        numbers.add(1);

        //using an anonymous class to sort integers, numerically or in reverse
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer num1, Integer num2) {
                return -num1.compareTo(num2);
            }
        });

        for(Integer number: numbers) {
            System.out.println(number);
        }

        /*************
         * SORTING ARBITRARTY OBJECTS
         */

        //MyPerson, initially, doesn't have any natural ordering so this has to be defined - usually
        //using the Comparable interface
        List<MyPerson> people = new ArrayList<>();

        people.add(new MyPerson(1, "Joe"));
        people.add(new MyPerson(3, "Bob"));
        people.add(new MyPerson(4, "Clare"));
        people.add(new MyPerson(2, "Sue"));

        Collections.sort(people, new Comparator<MyPerson>() {
            @Override
            /**
             * Sorting by ID
             * for sorting from 1..to..4 if the id for p1 is greather than the id for p2 then return 1,
             * else return -1, this will sort from either 1..to..4 or 4..to..1
             */
            public int compare(MyPerson p1, MyPerson p2) {
                if (p1.getId() > p2.getId()) {
                    return 1;
                } else if (p1.getId() < p2.getId()) {
                    return -1;
                }
                return 0;
            }
        });
        System.out.println("Sort by ID");
        for (MyPerson person: people) {
            System.out.println(person);
        }


        Collections.sort(people, new Comparator<MyPerson>() {
            @Override
            /**
             * Sorting by Name
             * Compare to returns an integer if p1 is greater than p2
             *
             */
            public int compare(MyPerson p1, MyPerson p2) {
                return p1.getName().compareTo(p2.getName());
            }
        });
        System.out.println("Sort by Name");
        for (MyPerson person: people) {
            System.out.println(person);
        }



    }
}
