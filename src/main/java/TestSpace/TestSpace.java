package TestSpace;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Time;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import Models.Account;
import Models.DataBase;
import Models.Request;
// import Models.Time;
import Models.User;
import Models.Vehicle;

/**
 * @author huynhkimai
 * @author ilovemilord
 */
@SuppressWarnings("unused")
public class TestSpace {
    Time a;

    public static void main(String[] args) {
        // DataBase.cleanDocumentsBank();
        File adminList = new File("src/main/resources/JSONs/AdminList.JSON");
        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.setPrettyPrinting().create();
        gson.toJson(gson);
    }
}
