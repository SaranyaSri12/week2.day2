package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestCase2 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Contacts")).click();
		driver.findElement(By.partialLinkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("Sara");
		driver.findElement(By.id("lastNameField")).sendKeys("Srini");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Sara");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("Sri");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("IT");
        WebElement descriptiondetails = driver.findElement(By.name("description"));
        descriptiondetails.sendKeys("basicdetails");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("abc@gmail.com");
		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd = new Select(state);
		dd.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.partialLinkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_description")).clear();
		driver.findElement(By.id("updateContactForm_importantNote")).sendKeys("primary_details");
		WebElement update= driver.findElement(By.xpath("//input[@value='Update']"));
		update.click();
		System.out.println("The Title is"+driver.getTitle());
	
		
		
		
		
		
		
		
	
	
		
		
		
		
		
	}

}
