package serializingarrays;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 27/11/14
 * Time: 20:45
 * To change this template use File | Settings | File Templates.
 */
public class WriteObjects {

    public static void main(String[] args) {

        System.out.println("Writing objects...");

        Person[] person = {new Person(25, "Nidhi"), new Person(30, "Jay")};

        ArrayList<Person> personArrayList = new ArrayList<>(Arrays.asList(person));

        try ( FileOutputStream fileOutputStream = new FileOutputStream("test.ser") ){

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            //serialise person array
            objectOutputStream.writeObject(person);

            //serialise person list
            objectOutputStream.writeObject(personArrayList);

            //write out the size of the person list
            objectOutputStream.writeInt(personArrayList.size());

            for(Person p: personArrayList){
                //serialise object by object in the person array list
                objectOutputStream.writeObject(p);
            }

            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
