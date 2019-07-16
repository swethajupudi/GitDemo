import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class qaclickacademyhomepage {

//	WebElement driver = driver.findElement(By.xpath("a[]"))
	
	
	public WebDriver driver;
	
	By loginbutton =By.xpath("//a[contains(@href,'sign_in')]");
	By nothanks=By.xpath("//button[text()='NO THANKS']");
	
	public WebDriver getlogin(WebDriver driver) {
		// TODO Auto-generated method stub
		
		this.driver=driver;
		driver.findElement(loginbutton).click();
		
		return driver;
	}
	


public void nothanks()
{

	driver.findElement(nothanks).click();
}




 	
}
