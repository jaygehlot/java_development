package timbuchalka_interfaces.interfaces_challenge1;

import java.util.ArrayList;
import java.util.Scanner;

public class MainApp {

    public static void main(String[] args) {
        Player jay = new Player("Jay", 10, 15);
        System.out.println(jay);

        jay.setHitPoints(15);
        System.out.println(jay);
        jay.setWeapon("Bow&Arrow");
        saveOject(jay);
        objectToLoad(jay);

        Saveable werewolf = new Monsters("Werewolf", 20, 40);
        System.out.println("Strength = " + ((Monsters) werewolf).getStrength());
        saveOject(werewolf);

        //declare the type of the class using the interface, unless there is a strong
        //reason to use the class type

    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");

        while (!quit) {
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }

    public static void saveOject(Saveable objectToSave) {
        for(int i=0; i<objectToSave.write().size(); i++) {
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device");
        }
    }

    public static void objectToLoad(Saveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
