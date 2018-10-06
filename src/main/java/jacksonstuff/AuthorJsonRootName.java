package jacksonstuff;

import com.fasterxml.jackson.annotation.JsonRootName;

import java.util.ArrayList;
import java.util.List;

@JsonRootName("writer")
public class AuthorJsonRootName extends Person {

    List<Item> items = new ArrayList<>();

    public AuthorJsonRootName(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }
}
