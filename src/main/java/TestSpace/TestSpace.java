package TestSpace;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import Models.Account;
import Models.Request;
import Models.Time;

/**
 * @author huynhkimai
 * @author ilovemilord
 */
@SuppressWarnings("unused")
public class TestSpace {
    public static void main(String[] args) {
        // File myFile = new File("src/main/resources/JSONs/UsersBank.JSON");
        // System.out.println("Found: " + myFile.getAbsolutePath());

        // GsonBuilder builder = new GsonBuilder();

        // Account account = Account.getInstance();

        // try (FileWriter writer = new FileWriter(myFile)) {
        // writer.write(builder.setPrettyPrinting().create().toJson(account));
        // // writer.write("0");
        // } catch (IOException e) {
        // e.printStackTrace();
        // }

        Time currtime = new Time(123, 45, 6, 4);
        Request a = new Request("3", "4", "AWdAWS", currtime, currtime, false);
        System.out.println(a);
        a.save();
    }
}
