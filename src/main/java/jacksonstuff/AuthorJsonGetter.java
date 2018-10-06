package jacksonstuff;

import com.fasterxml.jackson.annotation.JsonGetter;

import java.util.ArrayList;
import java.util.List;

public class AuthorJsonGetter extends Person {

    private List<Item> items = new ArrayList<>();

    public AuthorJsonGetter(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @JsonGetter
    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
