package Test.Rohit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class loginFacebook {
	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
        System.setProperty("wdm.targetPath", "./drivers");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
		driver.get("https://app.talentlms.com/login");
		driver.findElement(By.xpath("//input[@name='domain']")).sendKeys("rohitworld111");
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("rohit.world111");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("8860144470");
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Assert.assertEquals(driver.getTitle(), "rohitworld111 | Home");
		Assert.assertTrue(driver.findElements(By.xpath("//a[text()='Logout']")).size()==1);
		Assert.assertTrue(driver.findElements(By.xpath("//a[text()='Login']")).size()==0);
		
		
		driver.findElement(By.xpath("//div/a[text()='Add user']")).click();
		driver.findElement(By.xpath("//input[@name='name']")).sendKeys("Sushil");
		driver.findElement(By.xpath("//input[@name='surname']")).sendKeys("Singh");
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("rohit.world151@gmail.com");
		driver.findElement(By.xpath("//input[@name='login']")).sendKeys("Sushilsingh");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("8860144470");
		driver.findElement(By.xpath("//textarea[@name='description']")).sendKeys("My First Page ");
		driver.findElement(By.xpath("//label[text()='User type']/..//span[@class='select2-arrow']")).click();
		driver.findElement(By.xpath("//li/div[text()='Learner-Type']")).click();
		
		System.out.println("All tests completed !!");
//		driver.close();
	}
}
