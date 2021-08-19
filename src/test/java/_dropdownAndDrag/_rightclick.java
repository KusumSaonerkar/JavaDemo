package _dropdownAndDrag;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class _rightclick 
{
WebDriver driver;
	
	@Before
	public void rightclick()
	{
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/slider/#colorpicker");
		
	}
	@Test
	public void Testrightclick() throws InterruptedException 
	{
		WebElement frame = driver.findElement(By.xpath("//iframe[@class= 'demo-frame']"));
		driver.switchTo().frame(frame);
		
		WebElement rectangle = driver.findElement(By.xpath("//div[@id='red']/span"));
		
		Thread.sleep(2000);
		Actions act = new Actions(driver);
		act.contextClick(rectangle).build().perform();
	}
	@After
	public void closewindow() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();
	}
}
