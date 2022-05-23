package com.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigClass 
{
		Properties pro;
		public ConfigClass() throws IOException
		{
			File fi =new File("./Configuration/config.properties");
			FileInputStream fis= new FileInputStream(fi);
			pro=new Properties();
			pro.load(fis);
		}
		public String getDataFromConfig(String keyToSearch)
		{
			return pro.getProperty(keyToSearch);
		}
		public String getBrowser()
		{
			return pro.getProperty("Browser");
		}
		public String getURL()
		{
			return pro.getProperty("URL");
		}
	
}
