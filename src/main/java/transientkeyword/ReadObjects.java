package transientkeyword;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

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

        //added FileOutputStream and ObjectOutputStream to try-with-resources block
        //this will ensure the fileOutputStream and objectOutputStream streams are closed since both
        //classes ultimately implement the AutoCloseable interface
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("test.ser")) ) {

            Person person = (Person) objectInputStream.readObject();
            System.out.println(person);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e){
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
