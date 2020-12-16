package optionals;

import java.util.Optional;
import java.util.Random;

public class OptionalExampleFour {

  public static void main(String[] args) {
      final String[] strings = {"Hello", null};
      Random random = new Random();
      String randomString = strings[random.nextInt(strings.length)];

      Optional<String> orElseGet = Optional.ofNullable(randomString);   //this can be null or Hello

      String someChangeToString = orElseGet
              .map(String::toLowerCase)
              .orElseGet(() -> {
                  //SOME COMPUTATION
                  return "world";
              });

      System.out.println(someChangeToString);
  }
}
