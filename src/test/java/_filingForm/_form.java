package _filingForm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.chrome.ChromeDriver;

public class _form 
{
	public static void main(String[] args) 
	{
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("http://demo.automationtesting.in/");
		
		WebElement searchButton = driver.findElement(By.id("enterimg"));
		searchButton.click();
		
		WebElement firstName = driver.findElement(By.xpath("//input[@placeholder = 'First Name']"));
		firstName.sendKeys("Kusum");
		
		WebElement lastName = driver.findElement(By.xpath("//input[@placeholder = 'Last Name']"));
		lastName.sendKeys("Saonerkar");
		
		WebElement address = driver.findElement(By.xpath("//textarea[@ng-model = 'Adress']"));
		address.sendKeys("F wing, Amazona Casa Rio, Palava Dombivali, Mumbai.");
		
		WebElement email = driver.findElement(By.xpath("//input[@ng-model = 'EmailAdress']"));
		email.sendKeys("kusum.saonerkar@gmail.com");
		
		WebElement phone = driver.findElement(By.xpath("//input[@ng-model = 'Phone']"));
		phone.sendKeys("7972487882");
		
		WebElement gender = driver.findElement(By.xpath("//input[@value ='FeMale']"));
		gender.click();
		
		WebElement hobby = driver.findElement(By.xpath("//input[@id ='checkbox3']"));
		hobby.click();
		
		WebElement password1 = driver.findElement(By.xpath("//input[@id ='firstpassword']"));
		password1.sendKeys("nehu@123");
		
		WebElement password2 = driver.findElement(By.xpath("//input[@id ='secondpassword']"));
		password2.sendKeys("nehu@123");
	}
}
