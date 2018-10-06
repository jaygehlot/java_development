package jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jacksonstuff.AuthorJsonPropertyOrder;
import org.junit.Test;

import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import static io.restassured.path.json.JsonPath.from;
import static org.assertj.core.api.Assertions.assertThat;
import static org.hamcrest.MatcherAssert.assertThat;

public class JacksonPropertyOrderUnitTest {

    @Test
    public void serializingUsingJsonPropertyOrder() throws JsonProcessingException {
        AuthorJsonPropertyOrder author = new AuthorJsonPropertyOrder("Jay", "Gehlot");

        author.setzIndex("z123");
        author.setAlphaIndex("a123");

        final String result = new ObjectMapper().writeValueAsString(author);

        assertThat(from(result).getString("firstName")).isEqualTo("Jay");

        assertThat(result, matchesJsonSchemaInClasspath("jsonpropertyorder-schema.json"));
        //I think it checks only the type of the object, and nothing else

        System.out.println(result);

        /*
            {
              "items": [],
              "firstName": "Jay",
              "lastName": "Gehlot",
              "id": "fd277638-9b6e-49f7-81c1-bc52f165245b"
              "alphaIndex": "a123",
              "zIndex": "z123",
            }
        */
    }
}
