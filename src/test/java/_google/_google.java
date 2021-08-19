package _google;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class _google 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");
		
		WebElement textBox = driver.findElement(By.xpath("//input[@type= 'text']"));
		textBox.sendKeys("iPhone 12");
		
		WebElement searchButton = driver.findElement(By.xpath("//div[@class = 'FPdoLc lJ9FBc']//input[@value = 'Google Search']"));
		searchButton.click();
		
		driver.close();
	}
}
