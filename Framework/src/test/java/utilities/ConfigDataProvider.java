package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ConfigDataProvider {
	
	public Properties properties;

	public ConfigDataProvider() {
		File src = new File("./Config/Config.properties");
		try {
			FileInputStream fis = new FileInputStream(src);
			properties = new Properties();
			properties.load(fis);
		} catch (Exception e) {
			System.out.println("***Unable to read config file***"+ e.getMessage());
		}
	}
	
	public String getDataFromConfig(String keyToSearch)
	{
	return properties.getProperty(keyToSearch)	;
	}
	
	public String getBrowser()
	{
		return properties.getProperty("Browser");
	}
	
	public String getUrl()
	{
		return properties.getProperty("Url");
	}

}
