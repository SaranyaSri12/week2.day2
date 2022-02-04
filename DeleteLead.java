package week2.day2;

import org.apache.commons.math3.analysis.function.Max;
import org.openqa.selenium.By;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {
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
	driver.findElement(By.xpath("//span[contains(text(),'Phone')]")).click();
	
	driver.findElement(By.name("phoneNumber")).sendKeys("123456");
	
	
    WebElement lead = driver.findElement(By.xpath("//button[contains(text(),'Find Leads')]"));
 
    lead.click();
    Thread.sleep(2000);
    WebElement leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId'][1]//a"));
String leadid2 = leadID.getText();
System.out.println("The leadid is"+" "+leadid2);
leadID.click();
driver.findElement(By.xpath("//a[text()='Delete']")).click();
Thread.sleep(3000);
driver.findElement(By.partialLinkText("Find Leads")).click();
driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadid2);
driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

if(driver.findElement(By.xpath("//div[text()='No records to display']")).isDisplayed())
{
	System.out.println("No records to display");
}
else
{
	System.out.println("Records to displayed");
}
driver.close();


    
}
}
