package jacksonstuff;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;

public class AuthorJsonProperty extends Person {

    @JsonProperty("publications")
    private List<Item> items = new ArrayList<>();

    public AuthorJsonProperty(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
