package jacksonstuff;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class Stuff {

    public static void main(String... args) throws IOException {
        Set<Integer> set = new TreeSet<>(Arrays.asList(3, 2, 1));

        Stream<Integer> stream = StreamSupport.stream(set.spliterator(), false);

        stream.forEach(System.out::println);


        String json = "[\n" +
                "    {\n" +
                "        \"key1\":\"value11\", \n" +
                "        \"key2\":\"value12\"\n" +
                "    },\n" +
                "    {\n" +
                "        \"key1\":\"value21\", \n" +
                "        \"key2\":\"value22\"\n" +
                "    }\n" +
                "] ";

        final List<String> split = split(json);

        System.out.println(split);
    }

    public static List<String> split(final String jsonArray) throws IOException {
        final JsonNode jsonNode = new ObjectMapper().readTree(jsonArray);

        final Spliterator<JsonNode> spliterator = jsonNode.spliterator();


        return StreamSupport.stream(jsonNode.spliterator(), false) // Stream
                .map(JsonNode::toString) // map to a string
                .collect(Collectors.toList()); //and collect as a List
    }
}

