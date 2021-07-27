package utils;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class UtilityTests {

	Properties property;
	FileInputStream file;
	String userdirec,prop_value;
	
	public String loadpropertyfile(String Propname)
	{
		try{
			property = new Properties();
			userdirec = System.getProperty("user.dir");
			file = new FileInputStream(userdirec+"\\src\\test\\resources\\config.properties");
			property.load(file);
			prop_value = property.getProperty(Propname);
		}
		catch(Exception e){
			e.printStackTrace();
		}
		return prop_value;
	}
	
	public void staticwait(String type,long time){
		try{
			switch(type)
			{
				case "milliseconds":
					TimeUnit.MILLISECONDS.sleep(time);
					break;
				case "microsecond":
					TimeUnit.MICROSECONDS.sleep(time);
					break;
				case "seconds":
					TimeUnit.SECONDS.sleep(time);
					break;
				case "minute":
					TimeUnit.MINUTES.sleep(time);
					break;
				case "hours":
					TimeUnit.HOURS.sleep(time);
					break;
			}
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}	
}
