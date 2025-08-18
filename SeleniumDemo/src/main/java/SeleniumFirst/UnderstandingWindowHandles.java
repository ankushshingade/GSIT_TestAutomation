package SeleniumFirst;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class UnderstandingWindowHandles {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); //  FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://demoqa.com/browser-windows");
		
		JavascriptExecutor js = (JavascriptExecutor) driver; 
		WebElement eleName = driver.findElement(By.id("tabButton"));
		js.executeScript("arguments[0].scrollIntoView(true)", eleName);
		eleName.click();
		
		Set<String> handles = driver.getWindowHandles();
		String currentHandle = driver.getWindowHandle();
		System.out.println("All handles: "+handles);
		System.out.println("Current handle: "+currentHandle);
		
////		Used for loop for switching window handle
//		for(String a: handles) {
//			if(a.equals(currentHandle)) {
//				System.out.println("Parent window handle."+a);
//			}
//			else {
//				System.out.println("New TAB window handle."+a);
//				driver.switchTo().window(a);
//			}
//		}
		
		Iterator<String> it = handles.iterator();
		String nextWindowHandle = it.next();
		if(!currentHandle.equals(nextWindowHandle)) {
			driver.switchTo().window(nextWindowHandle);
			System.out.println("IF case: "+nextWindowHandle);
		}
		else {
			nextWindowHandle = it.next();
			System.out.println("ELSE case: "+nextWindowHandle);
			driver.switchTo().window(nextWindowHandle);
			System.out.println("Window handle changed");
			System.out.println("New tab: "+driver.findElement(By.id("sampleHeading")).getText());
		}
		System.out.println(handles);
		//driver.close();
		driver.switchTo().window(currentHandle);
//		js.executeScript("arguments[0].scrollIntoView(true)", eleName);
//		eleName.click();
		WebElement newWindow = driver.findElement(By.id("windowButton"));
		newWindow.click();
		
		handles = driver.getWindowHandles();
		String currentTitle = driver.getTitle();
		System.out.println("Current title: "+currentTitle);
		//currentHandle = driver.getWindowHandle();
		it = handles.iterator();
		nextWindowHandle = it.next();
		if(!(currentHandle.equals(nextWindowHandle))) {
			driver.switchTo().window(nextWindowHandle);
			String title = driver.getTitle();
			System.out.println("Title for '"+nextWindowHandle+"' window handle: "+title);
		}
		nextWindowHandle = it.next();
		if(!(currentHandle.equals(nextWindowHandle))) {
			driver.switchTo().window(nextWindowHandle);
			String title = driver.getTitle();
			System.out.println("Title for '"+nextWindowHandle+"' window handle: "+title);
		}
		nextWindowHandle = it.next();
		if(!(currentHandle.equals(nextWindowHandle))) {
			driver.switchTo().window(nextWindowHandle);
			String title = driver.getTitle();
			System.out.println("Title for '"+nextWindowHandle+"' window handle: "+title);
		}
		
		System.out.println(handles);
		Thread.sleep(4000);
		driver.quit();

	}

}
