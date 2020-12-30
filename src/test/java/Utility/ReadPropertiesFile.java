package Utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadPropertiesFile {

    public Properties getProperty(){
        Properties properties = new Properties();
        FileInputStream fileInputStream = null;
        try{
            properties.load(new FileInputStream("src/test/resources/resources/config.properties"));
        }catch (IOException e){
            e.printStackTrace();
        }
        return properties;
    }
}
