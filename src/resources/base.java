package resources;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class base {

	
	public WebDriver driver;
	Properties prop = new Properties();

	public void propertyfile() throws IOException
	{FileInputStream file = null;
	try {
		file = new FileInputStream("C:\\work\\Introduction\\src\\info.properties");
	} catch (FileNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	try {
		prop.load(file);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
		
		
	}
	
	public WebDriver browser() throws IOException {
		
		propertyfile();
		//System.out.println(prop.getProperty("url"));
		String url=prop.getProperty("url");
		String browser = prop.getProperty("browser");
		if (browser.equals("chrome")) {
			System.out.println("chrome is invoked");
			System.setProperty("webdriver.chrome.driver", "D:\\swetha\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			driver.get(url);
			
			

			
		} else {
			System.out.println("firefox has to be invoked");
		}
		
		
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		return driver; 
	}
	
	/*public WebDriver url() throws IOException
	{
		
		propertyfile();
		
		String url=prop.getProperty("url");
		
	if(url != null)
			{
				System.out.println("load the url");
			}
	
	else
	{
		System.out.println("url is null");
	}
	
	
	
	return driver;
		
	} */
	
}
