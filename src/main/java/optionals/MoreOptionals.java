package optionals;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MoreOptionals {

    public static void main(String[] args) {
        Optional<String> optConflict1 = Optional.of(new String("jay"));
        Optional<String> optConflict2 = Optional.empty();
        Optional<String> optConflict3 = Optional.of(new String("gehlot"));

        List<Optional<String>> listOptConflicts = List.of(optConflict1, optConflict2, optConflict3);
        List<String> conflicts
                = listOptConflicts.stream()
//                .filter(Optional::isPresent)
//                .map(Optional::get)
                .flatMap(Optional::stream)
                .collect(Collectors.toList());

        conflicts.forEach(System.out::println);
    }
}
