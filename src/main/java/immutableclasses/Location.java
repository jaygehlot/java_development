package immutableclasses;

import java.util.HashMap;
import java.util.Map;

/**
 * A fully immutable class, once an instance is created, it can't be changed
 * https://docs.oracle.com/javase/tutorial/essential/concurrency/imstrat.html
 */
final class Location {

    private final int locationId;
    private final String description;
    private final Map<String, Integer> exits;

    public Location(int locationId, String description, Map<String, Integer> exits) {
        this.locationId = locationId;
        this.description = description;
        //creating a new HashMap will try to ensure this class is fully immutable
        //and not sharing references to the map
        this.exits = (exits != null) ? new HashMap<>(exits) : new HashMap<>();
        this.exits.put("Q", 0);
    }

    public int getLocationId() {
        return locationId;
    }

    public String getDescription() {
        return description;
    }

    /**
     * Return new HashMap of exits so there is
     * no chance of client code changing internal map,
     * and we are not sharing references to the map
     * @return
     */
    public Map<String, Integer> getExits() {
        return new HashMap<>(exits);
    }
}
