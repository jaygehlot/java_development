package jackson;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import jacksonstuff.NewCustomer;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JacksonJsonRawValueUnitTest {

    @Test
    public void whenSerializingUsingJsonRawValue_thenCorrect() throws JsonProcessingException {

        // arrange
        String customerConfig = "{\"colour\":\"red\",\"device\":\"mobile\",\"orientation\":\"landscape\"}";
        NewCustomer customer = new NewCustomer("Jay", "Gehlot");
        customer.setConfiguration(customerConfig);

        // act
        String result = new ObjectMapper().writeValueAsString(customer);

        // assert
        assertThat(result.contains(customerConfig));

        /*
            {
              "firstName": "Alex",
              "lastName": "Theedom",
              "publications": []
            }
        */

    }
}
