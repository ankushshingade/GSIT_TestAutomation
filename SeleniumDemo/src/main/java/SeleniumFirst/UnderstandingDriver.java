package SeleniumFirst;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import io.github.bonigarcia.wdm.WebDriverManager;



public class UnderstandingDriver {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Ankush\\Downloads\\edgedriver_win64 (5)\\msedgedriver.exe");
		//WebDriverManager.edgedriver().driverVersion("139.0.3405.36").setup();

		WebDriver driver = null;
		Scanner sc = new Scanner(System.in);
		
		String browserName = sc.nextLine();		//"Chrome";
		
		switch(browserName) {
		
		case "Chrome": 
			driver = new ChromeDriver();
			break;
			
		case "Edge":
			driver = new EdgeDriver();
			break;
			
		case "Firefox":
			driver = new FirefoxDriver();
			break;
		default: System.out.println("Invalid browser name provided.");
		}

		driver.get("https://www.google.com");
		
		Thread.sleep(3000);		// Wait for 3 seconds
		
		sc.close();				// Close scanner
		driver.quit();			// driver quit
	}

}
