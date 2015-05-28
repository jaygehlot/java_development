package gson_example;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class DataObjectToJson {

    public static void main(String[] args) {
        DataObject dataObject = new DataObject();
        Gson gson = new Gson();

        //convert Java object to JSON format and returned as JSON formatted string
        String json = gson.toJson(dataObject);

        try{
            FileWriter writer = new FileWriter("file.json");
            writer.write(json);
            writer.close();

        }catch (IOException e){
            e.getMessage();
        }

        System.out.println(json);
    }
}
