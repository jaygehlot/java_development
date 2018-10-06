package jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import jacksonstuff.AuthorJsonRootName;
import org.junit.Test;

import static io.restassured.path.json.JsonPath.from;
import static org.assertj.core.api.Assertions.assertThat;

public class JacksonJsonRootNameUnitTest {

    @Test
    public void serialisingUsingJsonRootName() throws JsonProcessingException {

        AuthorJsonRootName author = new AuthorJsonRootName("Jay", "Gehlot");

        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.enable(SerializationFeature.WRAP_ROOT_VALUE);

        final String result = objectMapper.writeValueAsString(author);

        assertThat(from(result).getString("writer.firstName")).isEqualTo("Jay");
        assertThat(from(result).getString("author.firstName")).isNull();

        System.out.println(result);

        /*
            {
              "writer": {
                "id": "0f50dca6-3dd7-4801-a334-fd1614276389",
                "firstName": "Jay",
                "lastName": "Gehlot",
                "items": []
              }
            }
        */
    }
}
