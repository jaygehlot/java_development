package serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 27/11/14
 * Time: 20:45
 * To change this template use File | Settings | File Templates.
 */
public class ReadObjects {

    public static void main(String[] args) {
        System.out.println("Read objects");

        try ( FileInputStream fileInputStream = new FileInputStream("people.bin") ){

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Person person1 = (Person) objectInputStream.readObject(); //need to cast to Person type, because readObject return Object
            Person person2 = (Person) objectInputStream.readObject();

            objectInputStream.close();

            System.out.println(person1);
            System.out.println(person2);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            //this will be thrown if you try to read the objects of a class which are not part of this program
            // or compile classes
            e.printStackTrace();
        }
    }
}
