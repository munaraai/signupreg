package Registeration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Booking_signup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\driver\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.booking.com");
		driver.findElement(By.xpath("//a[@class='bui-button bui-button--secondary js-header-login-link']//span[@class='bui-button__text'][normalize-space()='Register']")).click();
		driver.findElement(By.name("username")).sendKeys("monmon.raai@hotmail.com");
		driver.findElement(By.xpath(" //button[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("new_password")).sendKeys("Password123");
		driver.findElement(By.id("confirmed_password")).sendKeys("Password123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
	}
		
		
		
		
		
	}


