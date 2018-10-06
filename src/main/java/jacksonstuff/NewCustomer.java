package jacksonstuff;

import com.fasterxml.jackson.annotation.JsonRawValue;

public class NewCustomer extends Person {

    @JsonRawValue
    private String configuration;

    public NewCustomer(String firstName, String lastName) {
        super(firstName, lastName);
    }


    public String getConfiguration() {
        return configuration;
    }

    public void setConfiguration(String configuration) {
        this.configuration = configuration;
    }
}
