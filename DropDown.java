package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	ChromeDriver  driver =new ChromeDriver();
	driver.get("http://leaftaps.com/opentaps/control/login");
	driver.manage().window().maximize();
	WebElement elementUsername = driver.findElement(By.id("username"));
	elementUsername.sendKeys("DemoCSR");
	WebElement elementPassword = driver.findElement(By.id("password"));
	elementPassword.sendKeys("crmsfa");
	driver.findElement(By.className("decorativeSubmit")).click();
	driver.findElement(By.partialLinkText("CRM/SFA")).click();
	driver.findElement(By.partialLinkText("Leads")).click();
	driver.findElement(By.partialLinkText("Create Lead")).click();
	
	WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select dd = new Select(source);
	dd.selectByVisibleText("Employee");
	
	WebElement industry= driver.findElement(By.id("createLeadForm_industryEnumId"));
	Select dd1 = new Select(industry);
	dd1.selectByValue("IND_FINANCE");
	
	WebElement ownership = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select dd2 = new Select(ownership);
	dd2.selectByIndex(2);
	
	
	
	
	
}
}
