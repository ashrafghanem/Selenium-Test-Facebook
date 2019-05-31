package najah.edu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFacebookLogin {
	static WebDriver driver;

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","src/geckodriver.exe");
		driver = new FirefoxDriver();
		String email = "ans_g1998@hotmail.com";
		String password = "/*My Password Here*/";
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys(email); // Email Field
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys(password); // Password Field
		driver.findElement(By.xpath(".//*[@id='u_0_2']")).click(); // Log In Button
	}
}
