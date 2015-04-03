package readingandwritingfiles;

import java.io.*;

/**
 * Created with IntelliJ IDEA.
 * User: 41629Ja
 * Date: 22/11/14
 * Time: 15:54
 * To change this template use File | Settings | File Templates.
 */
public class FileReaderApp {

    public static void main(String[] args) {
        File f = new File("test.txt");
        BufferedReader bufferedReader = null;
        try{
            System.out.println(f.getCanonicalPath());  //prints out where File object is looking for the file
        } catch (IOException e){

        }
        try{
            FileReader fileReader = new FileReader(f);
            bufferedReader = new BufferedReader(fileReader);

            String line;

            //while the string being read is not null
            //print it out
            while (   (line = bufferedReader.readLine()) !=null ){
                System.out.println(line);
            }

        } catch (FileNotFoundException e){
            System.out.println("File not found " + f.toString());
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException e) {
                System.out.println("Unable to close file");
            } catch (NullPointerException e){
                //file was probably never opened, maybe if it wasn't found
            }
        }

    }
}
