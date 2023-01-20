package Utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig {

	public static Properties prop; // Properties class

	// Constructor
	public ReadConfig() {

		File src = new File(System.getProperty("user.dir")+ "/Configurations/config.properties"); // Source location of Config file
		prop = new Properties();
		try {
			// Open FileInputStream and Read data
			FileInputStream fis = new FileInputStream(src);
			prop.load(fis); // Loading config.properties file
		} catch (IOException e) {
			// TODO Auto-generated catch block

			System.out.println("Exception Is : " + e.getMessage());
		}
	}
	// Methods to read data from config.properties 
	
	public String BaseUrl() {
		return prop.getProperty("baseURL"); // Reading baseUrl property from config.properties
	}
	
	public String UserEmail1() {
		return prop.getProperty("userEmail1");
	}
	
	public String UserEmail2() {
		return prop.getProperty("userEmail2");
	}
	
	public String Password1() {
		return prop.getProperty("password1");
	}
	
	public String Password2() {
		return prop.getProperty("password2");
	}
	
	public String ChromePath() {
		return prop.getProperty("chromepath");
	}
	
	public String PostalCode() {
		return prop.getProperty("postalCode");
	}

	public String Creditcardnumber() {
		
		return prop.getProperty("creditcardnumber");
	}

	public String Creditcardcvc() {
		// TODO Auto-generated method stub
		return prop.getProperty("creditcardcvc");
	}

	public String creditcardmm() {
		// TODO Auto-generated method stub
		return prop.getProperty("creditcardmm");
	}

	public String creditcardyy() {
		// TODO Auto-generated method stub
		return prop.getProperty("creditcardyy");
	}

	public String creditcardname() {
		// TODO Auto-generated method stub
		return prop.getProperty("creditcardname");
	}
}
