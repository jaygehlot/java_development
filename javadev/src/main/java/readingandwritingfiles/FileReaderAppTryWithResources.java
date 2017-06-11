package readingandwritingfiles;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 23/11/14
 * Time: 00:27
 * To change this template use File | Settings | File Templates.
 */
public class FileReaderAppTryWithResources {

    public static void main(String[] args) {
        File file = new File("test.txt");

        //the try by resources is available only in Java 7
        // and ensure bufferedReader is automatically closed
        // since BufferedReader's parent, Reader, implements AutoCloseable
        //the whole point of try-with-resources to to close Readers and Streams
        //so that there is no need to close them in a finally block.
        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){
            String line;

            //while the string being read is not null
            //print it out
            while (   (line = bufferedReader.readLine()) !=null ){
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Cannot read file. ");
        }
    }
}
