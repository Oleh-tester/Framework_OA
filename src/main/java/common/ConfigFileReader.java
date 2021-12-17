package common;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {

    private Properties properties;
    private final String propertyFilePath = "src/main/resources/config.properties";


    public ConfigFileReader() {
        BufferedReader reader;
        try {
            reader = new BufferedReader(new FileReader(propertyFilePath));
            properties = new Properties();
            try {
                properties.load(reader);
                reader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new RuntimeException("Configuration.properties not found at " + propertyFilePath);
        }
    }

    public String getEmailDev() {
        String emailDev = properties.getProperty("emailDev");
        if (emailDev != null) return emailDev;
        else throw new RuntimeException("emailDev not specified in the Configuration.properties file.");
    }

    public String getPassDev() {
        String passDev = properties.getProperty("passDev");
        if (passDev != null) return passDev;
        else throw new RuntimeException("implicitlyWait not specified in the Configuration.properties file.");
    }

    public String getAppLoginUrl() {
        String LOGIN_URL = properties.getProperty("LOGIN_URL");
        if (LOGIN_URL != null) return LOGIN_URL;
        else throw new RuntimeException("LOGIN_URL not specified in the Configuration.properties file.");
    }
    public String getDefaultAfterLogin(){
        String AFTER_LOGIN_URL = properties.getProperty("AFTER_LOGIN_URL");
        if (AFTER_LOGIN_URL != null) return AFTER_LOGIN_URL;
        else throw new RuntimeException("AFTER_LOGIN_URL not specified in the Configuration.properties file.");
    }
    public String getUpgradeUrl(){
        String UPGRADE_PAGE = properties.getProperty("UPGRADE_PAGE");
        if (UPGRADE_PAGE != null) return UPGRADE_PAGE;
        else throw new RuntimeException("UPGRADE_PAGE Url not specified in the Configuration.properties file.");
    }
    public String getDriverPath() {
        String chromeDriverPath = properties.getProperty("driverPath");
        if (chromeDriverPath != null) return chromeDriverPath;
        else throw new RuntimeException("driverPath isn't specified on the Configuration.properties file.");
    }
}
