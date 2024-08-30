package augweek2.home;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Week2assignments {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/");
		WebElement Username = driver.findElement(By.id("username"));
		Username.sendKeys("demosalesmanager");
		WebElement pwd = driver.findElement(By.id("password"));
		pwd.sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Create Account")).click();
		WebElement desc = driver.findElement(By.name("description"));
		desc.sendKeys("Selenium Automation Tester.");
		WebElement empcount = driver.findElement(By.name("numberEmployees"));
		empcount.sendKeys("3");
		WebElement Sitename = driver.findElement(By.name("officeSiteName"));
		Sitename.sendKeys("LeafTaps");
		driver.findElement(By.className("smallSubmit"));
					String heading = driver.getTitle();
		System.out.println(heading);
		driver.close();
		
	
		
		
		
	}

}
