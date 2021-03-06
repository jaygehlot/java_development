package optionals;

import java.util.Optional;
import java.util.function.Function;

public class UsingOptional {

    public static void main(String[] args) {
        Function<String, String> getSecondWord = s -> s.split(" ").length > 1 ? s.split(" ")[1] : null;

        Function<String, Integer> getWordCount = String::length;

        //System.out.println(getSecondWord.andThen(getWordCount).apply("jay"));

            //Optional<String> myOptional = Optional.ofNullable(getSecondWord.apply("jay gehlot"));

        Optional<String> myOptional = Optional.ofNullable(getSecondWord.apply("jay gehlot"));

        System.out.println(myOptional.isPresent());

        if (myOptional.isPresent()) {
            myOptional.ifPresent(System.out::println);
        } else {
            myOptional.orElse("no value");
        }

        //System.out.println("isPresent");

        System.out.println("========");
        //Optional.ofNullable(getSecondWord.apply("jay")).ifPresent(System.out::println);
        Optional.ofNullable(getSecondWord.apply("jay")).ifPresentOrElse(System.out::println, () -> System.out.println("some string") );

        //using map for whole thing
        System.out.println("Using a map");
        Optional.ofNullable(getSecondWord.apply("jay gehlot")).map(getWordCount).ifPresent(System.out::println);
    }
}