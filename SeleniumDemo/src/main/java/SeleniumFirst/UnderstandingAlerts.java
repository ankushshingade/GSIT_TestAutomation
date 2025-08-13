package SeleniumFirst;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Wait;

public class UnderstandingAlerts {

	public static void main(String[] args) throws InterruptedException {
		//Wait implicitWait = new 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demoqa.com/alerts");
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
		WebElement clickAlert = driver.findElement(By.id("alertButton"));
		try 
		{
			System.out.println("Executing TRY block.");
			clickAlert.click();
		}catch(Exception e) 
		{
			System.out.println("Executing CATCH block.");
			js.executeScript("arguments[0].scrollIntoView(true)", clickAlert);
			clickAlert.click();
			
		}
		
		
		Alert alert = driver.switchTo().alert();
		
		String alertText = alert.getText();
		System.out.println(alertText);
		alert.accept();
		
		driver.findElement(By.id("timerAlertButton")).click();
		Thread.sleep(6000);
		Alert timerAlert = driver.switchTo().alert();
		Thread.sleep(2000);
		System.out.println(timerAlert.getText());
		timerAlert.accept();
		
		driver.findElement(By.id("confirmButton")).click();
		Alert confirmAlert = driver.switchTo().alert();
		System.out.println(confirmAlert.getText());
		confirmAlert.dismiss();
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
		
		driver.findElement(By.id("confirmButton")).click();
		confirmAlert = driver.switchTo().alert();
		System.out.println(confirmAlert.getText());
		confirmAlert.accept();
		System.out.println(driver.findElement(By.id("confirmResult")).getText());
		
		driver.findElement(By.id("promtButton")).click();
		Alert promtAlert = driver.switchTo().alert();
		promtAlert.sendKeys("Ankush");
		System.out.println(promtAlert.getText());
		promtAlert.accept();
		System.out.println(driver.findElement(By.id("promptResult")).getText());
		Thread.sleep(4000);
		driver.quit();

	}

}
