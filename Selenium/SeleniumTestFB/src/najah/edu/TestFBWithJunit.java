package najah.edu;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFBWithJunit {
	static WebDriver driver;
	
	@Before
	public void setUp() throws Exception{
		System.setProperty("webdriver.gecko.driver","src/geckodriver.exe");
		driver = new FirefoxDriver();
	}
	@After
	public void tearDown() throws Exception{
		driver.quit();
	}
	@Test
	public void test() throws Exception{
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("ans_g1998@hotmail.com"); // Email Field
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("/*MyPasswordHere*/"); // Password Field
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click(); // Log In Button
	}
}
