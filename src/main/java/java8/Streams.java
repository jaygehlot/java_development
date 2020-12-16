package java8;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Streams {

    public static void main(String[] args) {
        List<CommitteeMembers> personList = Arrays.asList( new CommitteeMembers("Jay", "Gehlot", 37),
                                                new CommitteeMembers("Nidhi", "Gehlot", 32),
                                                new CommitteeMembers("Ansh", "Gehlot", 3),
                                                new CommitteeMembers("B", "Sankhala", 50));


        personList.stream().filter(p -> p.getLastName().startsWith("S")).forEach(System.out::println);
    }
}