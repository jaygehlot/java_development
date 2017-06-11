package gson_example;

import com.google.gson.Gson;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;


public class JsonToDataObject {

    public static void main(String[] args) {
        Gson gson = new Gson();

        try{
            BufferedReader br = new BufferedReader(new FileReader("file.json"));

            //convert the json string back to object
            DataObject obj = gson.fromJson(br, DataObject.class);

            System.out.println(obj);

        } catch(FileNotFoundException e) {
            e.printStackTrace();
        }
    }

}

