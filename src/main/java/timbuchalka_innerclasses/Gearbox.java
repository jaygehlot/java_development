package timbuchalka_innerclasses;

import java.util.ArrayList;

/**
Non static nested class - AKA inner class
 */

public class Gearbox {
    private ArrayList<Gear> gears;
    private int maxGears;
    private int currentGear = 0;
    private boolean clutchIsIn;

    public Gearbox(int maxGears) {
        this.maxGears = maxGears;
        this.gears = new ArrayList<Gear>();
        Gear neutral = new Gear(0, 0.0);
        this.gears.add(neutral);
    }

    public void operateClutch(boolean in) {
        this.clutchIsIn = in;
    }

    public void addGear(int gearNo, double ratio) {
        if (gearNo > 0 && gearNo <= maxGears) {
            this.gears.add(new Gear(gearNo, ratio));
        }
    }

    public void changeGear(int newGear) {
        if (newGear > 0 && newGear < this.gears.size() && this.clutchIsIn) {
            this.currentGear = newGear;
            System.out.println("Gear select is " + newGear);
        } else {
            System.out.println("Grind!");
            this.currentGear = 0;
        }
    }

    public double wheelSpeed(int revs) {
        if (clutchIsIn) {
            System.out.println("Scream!!");
            return 0.0;
        } else
            return revs * gears.get(currentGear).getRatio();
    }


    /**
    Coupled with gearbox to make Gear (non static inner class) useful
     */
    private class Gear {
        private int gearNumber;
        private double ratio;

        public Gear(int gearNumber, double ratio) {
            this.gearNumber = gearNumber;
            this.ratio = ratio;
            Gearbox.this.currentGear = gearNumber; //to access a field in outer class
        }

        public double driveSpeed(int revs) {
            return revs * this.ratio;
        }

        public double getRatio() {
            return ratio;
        }
    }
}
