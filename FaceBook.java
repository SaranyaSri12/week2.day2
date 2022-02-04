package week2.day2;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		driver.manage().timeouts().implicitlyWait(90,TimeUnit.SECONDS);

		driver.findElement(By.xpath("//input[contains(@name,'firstname')]")).sendKeys("Saranya");
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Srinivasan");
		driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("1234");
		driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("1234");
		WebElement day = driver.findElement(By.id("day"));
		Select dd =new Select(day);
		dd.selectByValue("4");
		WebElement month = driver.findElement(By.id("month"));
		Select dd2 = new Select(month);
		dd2.selectByValue("9");
		WebElement year = driver.findElement(By.id("year"));
		Select dd3= new Select(year);
		dd3.selectByValue("1993");
		 driver.findElement(By.className("_8esa")).click();	

		
		
		
	}

}
