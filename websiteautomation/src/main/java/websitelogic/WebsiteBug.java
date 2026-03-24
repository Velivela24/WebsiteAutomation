package websitelogic;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.github.javafaker.Faker;

public class WebsiteBug {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		driver.get("https://with-bugs.practicesoftwaretesting.com/#/auth/login");
		WebElement emailEle = driver.findElement(By.xpath("//input[@id='email']"));
		emailEle.sendKeys(new Faker().name().firstName());
		WebElement passwordEle = driver.findElement(By.xpath("//input[@id='password']"));
		passwordEle.sendKeys(new Faker().name().lastName());
		
		driver.quit();
	}

}
