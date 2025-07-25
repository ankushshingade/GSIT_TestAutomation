package SeleniumFirst;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UnderstandingCSS {

	public static void main(String[] args) throws InterruptedException {
		
		String[] userNames = {"standard_user", "locked_out_user", "problem_user", "performance_glitch_user", "error_user", "visual_user"};
		String password = "secret_sauce";
		//WebDriver driver = new ChromeDriver();
		WebDriver driver = new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.saucedemo.com/");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("#user-name")).sendKeys(userNames[0]);		// Using #ID
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input#password")).sendKeys(password);	// Using TagName#id
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input.submit-button")).click();				// Using TagName.Classname
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("button[id$='onesie']")).click();			// Using tagname[attribute$=’value’] —- ends with
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("div#shopping_cart_container")).click();		// Using TagName#id
		Thread.sleep(1500);
		System.out.println(driver.findElement(By.cssSelector("div.inventory_item_desc")).getText());	// Using TagName.Classname
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("button[name='checkout']")).click();		// Using tagname[attribute=’value’]
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input#first-name")).sendKeys(userNames[0]);
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input#last-name")).sendKeys(userNames[0]);
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input#postal-code")).sendKeys("411043");
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("input#continue")).click();
		Thread.sleep(1500);
		driver.findElement(By.cssSelector("button#finish")).click();
		Thread.sleep(1500);
		System.out.println(driver.findElement(By.cssSelector("h2.complete-header")).getText());
		System.out.println(driver.findElement(By.cssSelector("div.complete-text")).getText());
		Thread.sleep(1500);
		driver.findElement(By.cssSelector(("div.bm-burger-button"))).click();
		Thread.sleep(1500);
		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(1500);
		
		
		//driver.findElement(By.cssSelector("a#item_2_title_link")).click();
		//driver.findElement(By.linkText("Sauce Labs Onesie")).click();					// Using LinkText
		//Thread.sleep(1500);
		//String desc = driver.findElement(By.cssSelector("div.inventory_details_desc")).getText();
		//System.out.println(desc);
		
		
		Thread.sleep(3000);
		driver.quit();
	}

}
