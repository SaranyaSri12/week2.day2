package week2.day2;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {
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
	
	driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("Hema");
	
	driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]")).click();
	Thread.sleep(3000);
	WebElement Firstname = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName'][1]//a"));
	String Firstname1 = Firstname.getText();
	System.out.println("First Resulting name is:- " +Firstname1);
	Firstname.click();
	WebElement title = driver.findElement(By.xpath("//div[text()='View Lead']"));
	String titleck = title.getText();
	System.out.println("The title is"+titleck);
	driver.findElement(By.xpath("//a[contains(text(),'Edit')]")).click();
	driver.findElement(By.id("updateLeadForm_companyName")).clear();
	driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("CTS");
	
	WebElement updateck =driver.findElement(By.xpath("//input[@value='Update']"));
	updateck.click();
	
	 WebElement textUpdateCheck =driver.findElement(By.id("viewLead_companyName_sp"));
	String textUpdateCk = textUpdateCheck.getText();
	 System.out.println("The Updated text"+" "+textUpdateCk);
	 
	driver.close();

}
}

