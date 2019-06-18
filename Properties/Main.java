package Properties;

import java.io.IOException;
import java.util.Properties;

public class Main {
    public static void main(String[] args) throws IOException {
        Properties prpos = new Properties();
        prpos.load(Main.class.getResourceAsStream("setting.properties"));

        String url = prpos.getProperty("url");
        String name = prpos.getProperty("name");

        String description = prpos.getProperty("course.description");
        System.out.println(url);
        System.out.println(name);
        System.out.println(description);
    }
}
