import java.io.IOException;

import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.WebDriver;

import resources.base;

public class homepagenavigation extends base {
	@Test
public void login() throws IOException
{
	driver=browser();
	//driver=url();
	
	qaclickacademyhomepage qaclickacademyhomepageobject = new qaclickacademyhomepage();
	
	qaclickacademyhomepageobject.getlogin(driver);
	qaclickacademyhomepageobject.nothanks();
	
	
}
	
	@BeforeTest
	public void beforetrest()
	{
		
	}
	
	@After
	public void test()
	{
		
	}
	

}
