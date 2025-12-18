package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("John", MALE),
            new Person("Maria", FEMALE),
            new Person("Aisha", FEMALE),
            new Person("Alice", FEMALE),
            new Person("Alex", MALE)
        );

        System.out.println("//imperative approach");
        List<Person> females = new ArrayList<>();

        for(Person person: people) {
            if(FEMALE.equals(person.getGender())) {
                females.add(person);
            }
        }

        for(Person female: females) {
            System.out.println(female);
        }

        System.out.println("//declarative approach");
        Predicate<Person> personPredicate = person -> FEMALE.equals(person.getGender());
        people.stream()
            .filter(personPredicate)
            .forEach(System.out::println);
    }

    private static class Person {
        private final String mame;
        private final Gender gender;

        private Person(String mame, Gender gender) {
            this.mame = mame;
            this.gender = gender;
        }

        public String getMame() {
            return mame;
        }

        public Gender getGender() {
            return gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "mame='" + mame + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender{
        MALE, FEMALE
    }
}
