package optionals;

import java.util.Optional;

public class OptionalExampleThree {

  public static void main(String[] args) {
      Optional<String> nullable = Optional.ofNullable(null);   //this can be null also

      String alternative = nullable.isPresent() ? nullable.map(String::toUpperCase).get() : nullable.orElse("Hello World");
      // oFNullable can be either take null or not as arguments, if null then print the String
      System.out.println(alternative);

  }
}
