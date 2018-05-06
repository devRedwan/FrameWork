package excel;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class Readprofile {

	public static void main(String[] args) throws IOException {
		
		
		Properties pf = new Properties();
		FileInputStream fl = new FileInputStream("C:\\Users\\Redwan\\workspace\\FrameWork\\long.properties");// FIleInputStream always requires that we put the file location  with the class
        pf.load(fl);
		System.out.println(pf.getProperty("value"));
	
	   Enumeration en = pf.keys() ; // Enumeration is a interface that helps to read the properties file. it stores all properties data in one place and allows to read them one by one. To run enumeration you need help from the Properties file
       while (en.hasMoreElements()){
    	   String name = (String) en.nextElement();
    	   String value = pf.getProperty(name);
    	   
    	   System.out.println(name+":"+value);
    	   
       }
	
	
	}

}
