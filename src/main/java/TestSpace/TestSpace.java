package TestSpace;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

/**
 * @author huynhkimai
 * @author ilovemilord
 */
@SuppressWarnings("unused")
public class TestSpace {
    public static void main(String[] args) {

        GsonBuilder builder = new GsonBuilder();
        Gson gson = builder.create();
        GOP gop = new GOP();
        System.out.println(builder.setPrettyPrinting().create().toJson(gop));

    }
}
