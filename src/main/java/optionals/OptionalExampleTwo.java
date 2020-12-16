package optionals;

import java.util.Optional;

public class OptionalExampleTwo {

  public static void main(String[] args) {
      Optional<String> hello = Optional.of("hello");  //.of() requires a value / cannot be null

      System.out.println(hello.get()); // gets the object inside option

      System.out.println(hello.isPresent());
      System.out.println(hello.isEmpty());

      String orElse = hello.orElse("World"); // hello will be printed because the object "hello" is populated
      System.out.println(orElse);

  }
}
