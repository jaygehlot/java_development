package transientkeyword;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObjects {

    public static void main(String[] args) {

        System.out.println("Writing objects...");

        //added FileOutputStream and ObjectOutputStream to try-with-resources block
        //this will ensure the fileOutputStream and objectOutputStream streams are closed since both
        //classes ultimately implement the AutoCloseable interface

        try (ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("test.ser")) ){

            Person person = new Person(5, "Jay", 30);
            Person.setCount(88);
            objectOutputStream.writeObject(person);


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
