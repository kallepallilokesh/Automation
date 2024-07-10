package GenericUtilities;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtility {
public String readDataFromPf(String key) throws Throwable
{
	FileInputStream fis = new FileInputStream(IconstantUtility.propertypath);
	Properties p = new Properties();
	p.load(fis);
	String value = p.getProperty(key);
	return value;
}
}
