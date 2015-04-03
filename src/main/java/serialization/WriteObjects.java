package serialization;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

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

        Person mike = new Person(50, "Mike");
        Person sue = new Person(40, "Sue");

        System.out.println(mike);
        System.out.println(sue);


        try ( FileOutputStream fileOutputStream = new FileOutputStream("people.bin") ){

            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(mike);
            objectOutputStream.writeObject(sue);

            objectOutputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
