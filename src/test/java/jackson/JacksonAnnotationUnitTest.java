package jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jacksonstuff.AuthorJsonGetter;
import jacksonstuff.AuthorJsonProperty;
import org.junit.Test;

import static io.restassured.path.json.JsonPath.from;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class JacksonAnnotationUnitTest {

    @Test
    public void serializingUsingJsonGetterIsSuccessful() throws JsonProcessingException {

        // arrange
        AuthorJsonGetter author = new AuthorJsonGetter("Alex", "Theedom");

        // act
        String result = new ObjectMapper().writeValueAsString(author);

        // assert
        assertThat(from(result).getList("items")).isNotNull();

        /*
            {
              "firstName": "Alex",
              "lastName": "Theedom",
              "items": []
            }
        */
    }

    @Test
    public void serializingUsingJsonPropertyIsSuccessful() throws JsonProcessingException {
        AuthorJsonProperty author = new AuthorJsonProperty("Jay", "Gehlot");

        // act
        String result = new ObjectMapper().writeValueAsString(author);

        // assert
        assertThat(from(result).getList("publications")).isNotNull();

        /*
            {
              "firstName": "Alex",
              "lastName": "Theedom",
              "publications": []
            }
        */

    }

    @Test
    public void serializingUsingJsonOrderPropertyIsSuccessful() throws JsonProcessingException {
        AuthorJsonProperty author = new AuthorJsonProperty("Jay", "Gehlot");

        // act
        String result = new ObjectMapper().writeValueAsString(author);

        // assert
        assertThat(from(result).getList("publications")).isNotNull();

        /*
            {
              "firstName": "Alex",
              "lastName": "Theedom",
              "publications": []
            }
        */

    }
}
