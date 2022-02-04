package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class XpathLearn {
public static void main(String[] args)  {
	//Absolute xpath-start with single slash and root//
	//index starts with 1//
	//time consuming-not used mostly,risky(dom struct chng)//
	// relative xpath-starts wuth // ,mention tag name//
	WebDriverManager.chromedriver().setup();
	ChromeDriver  driver =new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	WebElement elementUsername = driver.findElement(By.id("username"));
	elementUsername.sendKeys("Demosalesmanager");
	WebElement elementPassword = driver.findElement(By.id("password"));
	elementPassword.sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();

driver.findElement(By.xpath("//a[text()='Leads']")).click();
driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Saranya");
driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("S");
driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("wipro");
driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();


	
}
}
