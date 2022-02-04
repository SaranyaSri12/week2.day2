package week2.day2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver =new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Find Leads")).click();
		driver.findElement(By.partialLinkText("Email")).click();
		
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("hari@testleaf.com");
		driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
		Thread.sleep(3000);
		WebElement Firstname = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]//a"));
		String Firstname1 = Firstname.getText();
		System.out.println("First Resulting name is:- " +Firstname1);
		Firstname.click();
		WebElement titlecheck = driver.findElement(By.xpath("//a[text()='Duplicate Lead']"));
		String title = titlecheck.getText();
		System.out.println("The Tile is"+title);
		String title2= "Duplicate Lead";
		if(title.equalsIgnoreCase(title2))
		{
			System.out.println("Title matches");
		}else {
			System.out.println("Title not matching");
		}
		driver.close();
		
		
		
		
	}
}
		
