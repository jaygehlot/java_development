package timbuchalka_interfaces.interfaces_challenge1;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Integer.parseInt;

public class Monsters implements Saveable {
    private String name;
    private int hitPoints;
    private int strength;

    public Monsters(String name, int hitPoints, int strength) {
        this.name = name;
        this.hitPoints = hitPoints;
        this.strength = strength;
    }

    public String getName() {
        return name;
    }

    public int getHitPoints() {
        return hitPoints;
    }

    public int getStrength() {
        return strength;
    }

    @Override
    public List<String> write() {
        List<String> values = new ArrayList<>();
        values.add(0, this.name);
        values.add(1, "" + this.hitPoints);
        values.add(2, "" + this.strength);
        return values;
    }

    @Override
    public void read(List<String> values) {
        if (values != null && !values.isEmpty()) {
            this.name = values.get(0);
            this.hitPoints = parseInt(values.get(1));
            this.strength = parseInt(values.get(2));
        }


    }

    @Override
    public String toString() {
        return "Monsters{" +
                "name='" + name + '\'' +
                ", hitPoints=" + hitPoints +
                ", strength=" + strength +
                '}';
    }

}
