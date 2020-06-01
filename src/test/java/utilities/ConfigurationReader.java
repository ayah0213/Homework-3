package utilities;


import java.io.FileInputStream;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties configFile;

    static {
        try {
            String path = System.getProperty("user.dir") + "/configuration.properties";
            FileInputStream input = new FileInputStream(path);
            configFile = new Properties();
            configFile.load(input);
            input.close();
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException("The Config file didin't load");
        }
    }
public static String getProperty(String keyName){
        return configFile.getProperty(keyName);



        }
    }