package AutomateWebApp2;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterTest {
	 WebDriver driver;
		@Test
		public void FlipcartRegisterTest() {
			
			driver.get("https://www.flipkart.com/");
			driver.manage().window().maximize();
			driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div.IiD88i._351hSN > input")).sendKeys("9876543210");
			driver.findElement(By.cssSelector("body > div._2Sn47c > div > div > div > div > div._36HLxm.col.col-3-5 > div > form > div._1D1L_j > button")).click();
		}
		@BeforeMethod
		public void beforeMethod() {
			
			System.setProperty("webdriver.chrome.driver", "C:\\Phase-5\\chromedriver.exe");
			driver= new ChromeDriver();
		}
		@AfterMethod
		public void afterMethod() {
			//driver.close();
			driver=null;
		}
		

}
