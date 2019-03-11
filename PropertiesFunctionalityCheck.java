package com.collections;
import java.util.*;
import java.io.*;

public class PropertiesFunctionalityCheck
{
	public static void main(String[] args) throws FileNotFoundException, IOException
	{
		// constant values to be used in the program should not be hardcoded. if any change required in constant value in future, need to 
		// recompile, rebuild, redeploy the program in future and it also force to restart the server to apply the changes, which is big impact to customer
		
		//Above problem can be overcome by using properties file, such type of constant values should be configured in properties file.
		//main advantage of this approach is change in properties file => to apply the changes just redeploy is enough which doesnt create business impact to client
		
		//key and value of properties file should be only of "String" type only.
		
		// One Constructor
		// new properties();
		
		//Five methods
		//1. String setProperty(String pname, String pValue) => if pname is already available, new pvalue will replace old pvalue and return old pvalue
		//2. String getProperty(String propertyName) => return pvalue if available, else null will be returned.
		//3. Enumeration propertyNames() => returns enumeration list of pname in property object
		//4. void load(InputStream is) => load properties from property file into java properties object.
		//5. void store(OutputStream os, String comment) => store properties from java properties object into properties file.
		
		Properties properties = new Properties();
		FileInputStream fis = new FileInputStream("abc.propert");
		properties.load(fis);
		System.out.println(properties);
		String ret = properties.getProperty("pwd");
		System.out.println(ret);
		String newRet = properties.getProperty("newadd");
		System.out.println(newRet);
		properties.setProperty("baskar", "jaasritha");
		properties.setProperty("user", "jaasritha");
		FileOutputStream fos = new FileOutputStream("abc.propert");
		properties.store(fos, "Comment Updated By BaskarKS on 6th Dec 2018");
	}
}