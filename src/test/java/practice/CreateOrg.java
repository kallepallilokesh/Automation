package practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CreateOrg {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("http://localhost:8888/");
	//implicit wait(10)
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	//un
	driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	//pwd
	driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	//login
	driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	//maximise
	driver.manage().window().maximize();
	//click on organisation
	driver.findElement(By.xpath("//a[text()='Organizations']")).click();
	//click on look up image
	driver.findElement(By.xpath("//img[@src='themes/softed/images/btnL3Add.gif']")).click();
	//give org name
	driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys("Amazon1");
	//save it
	driver.findElement(By.xpath("//input[@name='button']")).click();
	//verify whether it is created or not
	String actText = driver.findElement(By.xpath("//span[@class='dvHeaderText']")).getText();
	if(actText.contains("Amazon1"))
	{
		System.out.println("Org is created and Tc is pass");
	}
	else
	{
		System.out.println(" Tc is failed");
		
	}
	//logout from app
	WebElement adminele = driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
	Actions a = new Actions(driver);
	a.moveToElement(adminele).perform();
	
	driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
}
}
