package session_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _chromeInvocation 
{
	public static void main(String[] args) 
	{
		//topcasting
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.amazon.in/");
		
		String titleOfApplication = driver.getTitle();
		String ExpectedTitleOfApp = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
		
		if(ExpectedTitleOfApp.equals(titleOfApplication))
		{
			System.out.println("The expected and actual tile is matching");
		}
		else
		{
			System.out.println("The two titles are not matching");
		}
		System.out.println("The title of Amazon.in is:- " +titleOfApplication);
		
		driver.close();
			
		
	}
}
