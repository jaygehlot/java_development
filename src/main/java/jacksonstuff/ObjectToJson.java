package jacksonstuff;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.util.Arrays;

public class ObjectToJson {

    public static void main(String[] args) throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();

        Customer customer = new Customer();
        customer.setAge(21);
        customer.setFirstName("Jay");
        customer.setMiddleName("K");
        customer.setLastName("Gehlot");
        customer.setContacts(Arrays.asList("1234", "4567, 8910"));

        objectMapper.writeValue(System.out, customer);
    }

}
