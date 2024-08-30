package augweek2.home;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAccountcreation {

	public static void main(String[] args) {
	
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	    driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	   WebElement firstnameWE = driver.findElement(By.name("firstname"));
	   firstnameWE.sendKeys("Apple");
	   WebElement lastnameWE = driver.findElement(By.name("lastname"));
	   lastnameWE.sendKeys("Orange");
	   WebElement inputs = driver.findElement(By.name("reg_email__"));
	   inputs.sendKeys("989900000");
	   WebElement Pwd = driver.findElement(By.id("password_step_input"));
	   Pwd.sendKeys("Hexagon123@");
	   WebElement Days = driver.findElement(By.id("day"));
	   Days.sendKeys("2");
	  WebElement monthWE = driver.findElement(By.id("month"));
	 Select monthobj=new Select(monthWE);
	 monthobj.selectByValue("7");
	 WebElement YearWE = driver.findElement(By.name("birthday_year"));
	 Select Yearobj=new Select(YearWE);
	 Yearobj.selectByValue("2000");
	 driver.findElement(By.xpath("//input[@type='radio'and @name='sex'and@value='2']")).click();

	 		
	 		
	 		
	 

	 
	 
	 
	    
		
		

	}

}
