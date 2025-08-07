package SeleniumFirst;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;



public class AutomatingForm {

	public static void main(String[] args) throws InterruptedException {
		//WebDriver driver = new FirefoxDriver();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		//)
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Ankush");
		
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Shingade");
		
		driver.findElement(By.xpath("//input[@id='userEmail']")).sendKeys("ankush@test.com");
		
		WebElement element = driver.findElement(By.xpath("//label[text()='Male']"));		// .click(); // gender-radio-1
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].scrollIntoView(true)", element);
		element.click();
		
		driver.findElement(By.xpath("//input[@placeholder='Mobile Number']")).sendKeys("8765432109");
		
		driver.findElement(By.xpath("//input[starts-with(@id,'date')]")).click();
		
		
		WebElement selYear = driver.findElement(By.xpath("//select[@class='react-datepicker__year-select']"));
		selYear.click();
		
		Select year = new Select(selYear);
		year.selectByVisibleText("1987");
//		driver.findElement(By.xpath("//option[@value='1987']")).click();
		
		driver.findElement(By.xpath("//select[@class='react-datepicker__month-select']")).click();
		
		driver.findElement(By.xpath("//option[@value='0']")).click();
		
		driver.findElement(By.xpath("//div[text()='11']")).click();
		
		
		WebElement subjectText = driver.findElement(By.id("subjectsInput")); // driver.findElement(By.cssSelector("//input[@id='subjectsInput']"));
		subjectText.sendKeys("Computer science");
		subjectText.sendKeys(Keys.ENTER);
		subjectText.sendKeys("Histo");
		subjectText.sendKeys(Keys.ENTER);
		
		
		driver.findElement(By.xpath("//label[text()='Reading']")).click();
		
		 
		driver.findElement(By.xpath("//textarea[@placeholder='Current Address']")).sendKeys("Pune");		
		
		
		driver.findElement(By.id("uploadPicture")).sendKeys("C:\\Users\\Ankush\\Downloads\\Invite2.png");
		
		
//		driver.findElement(By.id("react-select-3-input")).sendKeys("Haryana");
//		driver.findElement(By.id("react-select-3-input")).sendKeys(Keys.ENTER);
//		
//		driver.findElement(By.id("react-select-4-input")).sendKeys("Karnal");
//		driver.findElement(By.id("react-select-4-input")).sendKeys(Keys.ENTER);
		
		WebElement stateDropDown =  driver.findElement(By.cssSelector("#state"));
		stateDropDown.click();
		
		List<WebElement> stateElements = driver.findElements(By.cssSelector("div[class=' css-11unzgr'] > div"));
		for(WebElement ele : stateElements) {
			String currentDropDownElement = ele.getText();
			System.out.println(currentDropDownElement);
			if(currentDropDownElement.equals("Haryana"))
			{
				executor.executeScript("arguments[0].scrollIntoView(true)", ele);
				ele.click();
				break;
			}
		}
		
		WebElement cityDropDown =  driver.findElement(By.cssSelector("#city"));
		cityDropDown.click();
		
		List<WebElement> cityElements = driver.findElements(By.xpath("//div[@class=' css-11unzgr']/div"));
		for(WebElement ele : cityElements) {
			String currentDropDownElement = ele.getText();
			System.out.println(currentDropDownElement);
			if(currentDropDownElement.equals("Panipat"))
			{
				executor.executeScript("arguments[0].scrollIntoView(true)", ele);
				ele.click();
				break;
			}
		}
		
		driver.findElement(By.cssSelector("#submit")).click();
		
		WebElement tableData = driver.findElement(By.cssSelector(null))
		
		
		
		Thread.sleep(5000);
		driver.quit();
	}

}
