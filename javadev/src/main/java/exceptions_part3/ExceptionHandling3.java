package exceptions_part3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 14/06/14
 * Time: 12:43
 * To change this template use File | Settings | File Templates.
 */
public class ExceptionHandling3 {
    public static void main(String[] args) throws FileNotFoundException {
        //openFile();

        //unchecked or runtime exceptions
        System.out.println(7/0);
    }

    public static void openFile() throws FileNotFoundException {
        File file = new File("test.txt");
        FileReader fr = new FileReader(file);
    }
}
