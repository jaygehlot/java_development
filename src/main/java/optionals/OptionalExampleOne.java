package optionals;

import java.util.Optional;

public class OptionalExampleOne {

  public static void main(String[] args) {
    Optional<Object> empty = Optional.empty();

    System.out.println("Should be false as its an empty Optional: " + empty.isPresent());
    System.out.println("Should be true as it is empty: " + empty.isEmpty());


  }
}
