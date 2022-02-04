package week2.day2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EmailLogin {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	ChromeDriver driver =new ChromeDriver();
	driver.get("https://acme-test.uipath.com/login");
	driver.findElement(By.xpath("//input[@id ='email']")).sendKeys("kumar.testleaf@gmail.com");
	driver.findElement(By.xpath("//input[@id ='password']")).sendKeys("leaf@12");
	driver.findElement(By.xpath("//button[contains(text(),'Login')]")).click();
	String title =driver.getTitle();
	System.out.println("The current title is"+"  "+title);
    driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//a[contains(text(),'Log Out')]")).click();
	driver.close();
	
}
}
