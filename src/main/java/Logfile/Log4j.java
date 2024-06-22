package Logfile;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4j 
{
 private static boolean root=false;
 public static Logger getLogger(Class cls)
 {
	 if(root)
	 {
		 return Logger.getLogger(cls);
	 }
	 PropertyConfigurator.configure(System.getProperty("user.dir")+"/src/test/java/properties/log4j.properties");
	 root=true;
	 return Logger.getLogger(cls);
 }
 
}
