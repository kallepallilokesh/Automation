package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StalementException {
public static void main(String[] args) {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.saucedemo.com");
	//1010
	WebElement UN = driver.findElement(By.xpath("//input[@id='user-name']"));
	driver.navigate().refresh();
	UN.sendKeys("admin");//2020
}
}
