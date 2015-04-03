package serializingarrays;

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

        try ( FileInputStream fileInputStream = new FileInputStream("test.ser") ){

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            //reading in a serialised array object of type Person from a file
            Person[] people = (Person[]) objectInputStream.readObject();

            //reading in a serialised ArrayList object of type Person from a file
            @SuppressWarnings(value = "unchecked") //we are suppressing this cast due to TYPE ERASURE
                                                    //in the information at compile time is lost for the Person type
                                                    // to stop you putting the wrong type of object into the ArrayList
            ArrayList<Person> peopleArraylist = (ArrayList<Person>) objectInputStream.readObject();

            System.out.println("Array");
            for(Person personArray: people){
                System.out.println(personArray);
            }

            System.out.println("Arraylist");
            for(Person personArrayList: peopleArraylist){
                System.out.println(personArrayList);
            }

            int numOfPeople = objectInputStream.readInt();

            System.out.println("Arraylist one object at a time");
            for (int i=0; i < numOfPeople; i++){
                Person person = (Person) objectInputStream.readObject();
                System.out.println(person);
            }

            objectInputStream.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            //this will be thrown if you try to read the objects of a class which are not part of this program
            // or compile classes
            //e.printStackTrace();
        }
    }
}
