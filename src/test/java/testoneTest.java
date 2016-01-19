import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.remote.DesiredCapabilities;



public class testoneTest {

	WebDriver wd ;
	DesiredCapabilities desiredcaps ;
	URL url ;
	WebElement we ;
	File pathBinary ;
	FirefoxBinary Binary ;
	FirefoxProfile firefoxPro ;
	
	@Before
	public void setUp()
	{
		try{
/*			pathBinary = new File("C:\\Users\\aparmar2\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
			Binary = new FirefoxBinary(pathBinary);
			firefoxPro = new FirefoxProfile();       
			wd = new FirefoxDriver(Binary,firefoxPro);	
*/
			 
			
		desiredcaps = DesiredCapabilities.phantomjs() ;
		desiredcaps.setCapability("phantomjs.binary.path", System.getProperty("phantomjs.binary")) ;
		wd = new PhantomJSDriver(desiredcaps) ;
		wd.navigate().to(new URL("http://www.aol.com"));
		Thread.sleep(10000);
		wd.manage().window().maximize();
		try {
			Thread.sleep(10000);
			} catch (InterruptedException e) {}
		String name4 = wd.getTitle() ;
		
		System.out.println("1111" + name4 + "1111"); 
		} catch (MalformedURLException e){}
	catch (InterruptedException e) {}
	}
	
	@Test
	public void testHelloWorld()
	{

				
		System.out.println(System.getProperty("phantomjs.binary")); 
		try {
		Thread.sleep(10000);
		} catch (InterruptedException e) {}
		System.out.println("11111" + wd.getTitle() + "11111"); 
		
		//Assert.assertEquals("Hello World!", we.getText() );
	}
	
}
