package optionals;

import java.util.Optional;
import java.util.function.Function;

public class OptionalSecondExample {

    private static Function<String, String> getSecondWord = s -> // This is exactly the same as your function
            s.split(" ").length > 1 ? s.split(" ")[1] : null;

    private static void printSecondWord(String name) {
        String result = Optional.ofNullable(getSecondWord.apply(name)) // Create an optional which can be empty
                .map(value -> String.valueOf(value.length())) // if it is not empty then map to length of value but return the result as string
                .orElse("no value"); // if it is empty then return no value instead length of value
        System.out.println(result);
    }

    public static void main(String[] args) {
        //printSecondWord("jay gehlot");
        printSecondWord("jay");
        printSecondWord("");

    }
}
