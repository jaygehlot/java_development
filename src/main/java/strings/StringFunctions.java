package strings;

import java.util.List;
import java.util.stream.Collectors;

public class StringFunctions {
    public static void main(String[] args) {
        stringConcat();
        //normalizeString();
    }

    private static void normalizeString() {
        String panda = "   Panda";
        String fish = "  Fish  ";
        String horse = "Horse  ";
        String cat = "  CAT";
        String nothing = "  ";

        List<String> animals = List.of(panda, cat, horse, nothing, fish);
        //animals.forEach(s -> System.out.println(s.trim()));

        List<String> trimmed = animals.stream()
                .map(String::trim)
                .filter(s -> !s.isEmpty())
                .map(String::toLowerCase)
                .collect(Collectors.toList());

        trimmed.forEach(System.out::println);
        System.out.println(trimmed.size());

    }

    private static void stringConcat() {
        String firstName = "Ansh";
        String lastName = "Gehlot";

        String firstNameAndLastName = firstName.concat(" ").concat(lastName);
        System.out.println(firstNameAndLastName);


        StringBuilder nonSynchonizedNonThreadSafe = new StringBuilder("abc");
        nonSynchonizedNonThreadSafe.append("efg")
                .append("ghi")
                .insert(0, "xyz")
                .delete(3, 6);
        System.out.println(nonSynchonizedNonThreadSafe.toString());

        StringBuffer synchronizedMethodsAndSoThreadSafeButSlower = new StringBuffer("abc");
        synchronizedMethodsAndSoThreadSafeButSlower.append("efg")
                .append("ghi")
                .insert(0, "xyz")
                .delete(3, 6);
        System.out.println(synchronizedMethodsAndSoThreadSafeButSlower.toString());
    }

}
