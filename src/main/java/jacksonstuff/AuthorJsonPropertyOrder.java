package jacksonstuff;

import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.ArrayList;
import java.util.List;

@JsonPropertyOrder(value = {"items", "firstName", "lastName", "id"}, alphabetic = true)
public class AuthorJsonPropertyOrder extends Person {

    private String zIndex;

    private String alphaIndex;

    List<Item> items = new ArrayList<>();

    public AuthorJsonPropertyOrder(String firstName, String lastName) {
        super(firstName, lastName);
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public String getzIndex() {
        return zIndex;
    }

    public void setzIndex(String zIndex) {
        this.zIndex = zIndex;
    }

    public String getAlphaIndex() {
        return alphaIndex;
    }

    public void setAlphaIndex(String alphaIndex) {
        this.alphaIndex = alphaIndex;
    }
}
