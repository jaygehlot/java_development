package timbuchalka_innerclasses;

/**
 * Created by jayg on 12/08/2017.
 */
public class MainApp {

    public static void main(String[] args) {
        Gearbox mcLaren = new Gearbox(6);
        mcLaren.addGear(1, 5.3);



        //Gearbox.Gear first = mcLaren.new Gear(1, 12.3);
        //Gearbox.Gear second = new Gearbox.Gear(1, 12.3);
        // for the above to work, Gear needs to be a static inner class
        //System.out.println(first.driveSpeed(1000));
    }


}
