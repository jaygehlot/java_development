package readingandwritingfiles;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 23/11/14
 * Time: 15:59
 * To change this template use File | Settings | File Templates.
 */
public class FileWriterApp {

    public static void main(String[] args) {
        File file = new File("testforwritingtofile.txt");

        //the try by resources is available only in Java 7
        // and ensure bufferedReader is automatically closed
        // since BufferedReader's parent, Reader, implements AutoCloseable
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file))){
            bufferedWriter.write("First line");
            bufferedWriter.newLine();
            bufferedWriter.write("Middle line");
            bufferedWriter.newLine();
            bufferedWriter.write("Last line");
        } catch (IOException e) {
            System.out.println("Cannot read file. ");
        }
    }
}
