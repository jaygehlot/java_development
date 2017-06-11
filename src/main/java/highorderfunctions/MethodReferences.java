package highorderfunctions;

import static highorderfunctions.MethodReferences.Apple.filterApples;
import static highorderfunctions.MethodReferences.Apple.lazyFilter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class MethodReferences {

    public static void main(String[] args) {

        List<Apple> appleList = Arrays.asList(new Apple("red"), new Apple("green"), new Apple("green"),
                new Apple("green"), new Apple("red"));

        final Iterator<Apple> appleIterator = lazyFilter(lazyFilter(appleList.iterator(), Apple::isGreen), Apple::isRed);


        System.out.println(ListFunctions.filter(appleList, Apple::isGreenApple));
        System.out.println(filterApples(appleList, Apple::isRedApple));
    }

    static class Apples {
        private List<Apple> apples;

        public List<Apple> filter(Predicate<Apple> predicate) {
            List<Apple> result = new ArrayList<>();

            for(Apple a: apples) {
                if (predicate.test(a)) {
                    result.add(a);
                }
            }
            return result;
        }

    }

    static class ListFunctions {
        public static <T> List<T> filter(List<T> things, Predicate<T> predicate) {
            List<T> result = new ArrayList<>();

            for(T a: things) {
                if (predicate.test(a)) {
                    result.add(a);
                }
            }
            return result;
        }

    }

    static class Apple {

        private String colour;

        Apple(String colour) {
            this.colour = colour;
        }

        public static boolean isGreenApple(Apple apple) {
            return "green".equals(apple.getColour());
        }

        public static boolean isRedApple(Apple apple) {
            return "red".equals(apple.getColour());
        }

        static List<Apple> filterApples(List<Apple> appleInventory, Predicate<Apple> predicate) {
            return appleInventory.stream().filter(predicate).collect(Collectors.toList());

//            final Iterator<Apple> iterator = appleInventory.iterator();
//            while(iterator.hasNext()) {
//                final Apple a = iterator.next();
//                if (predicate.test(a)) {
//                    result.add(a);
//                }
//            }
        }

        static <T> Iterator<T> lazyFilter(Iterator<T> items, Predicate<T> predicate) {
            final Iterator<T> underlying = items;
            return new Iterator<T>() {
                @Override
                public boolean hasNext() {
                    return underlying.hasNext();
                }

                @Override
                public T next() {
                    while(underlying.hasNext()) {
                        final T underlyingNext = underlying.next();
                        if(predicate.test(underlyingNext)) {
                            return underlyingNext;
                        }
                    }
                    return null;
                }
            };
        }

        private String getColour() {
            return colour;
        }

        @Override
        public String toString() {
            return ("Apple Colour: " + this.getColour());
        }

        public boolean isGreen() {
            return "green".equals(colour);
        }

        public boolean isRed() {
            return "red".equals(colour);
        }

    }

}


