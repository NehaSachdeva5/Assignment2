package testBase;

import static org.testng.Assert.assertEquals;

import java.io.File;
import java.nio.file.Files;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class TestBase {

	@Test
	public static void test1() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();		
		//WebDriverManager.chromedriver().setup();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php?");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(40));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(40));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Sign in')]")));
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		
//		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//input[@name='email'])[1]")));
//		driver.findElement(By.xpath("(//input[@name='email'])[1]")).sendKeys("admin@xyz.com");
//		driver.findElement(By.xpath("//input[@name='passwd']")).sendKeys("admin@123");
//		driver.findElement(By.xpath("//button[@name='SubmitLogin']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='email_create']")));
		driver.findElement(By.xpath("//input[@id='email_create']")).sendKeys("seiyojounitrs-7015@yopmail.com");
		driver.findElement(By.xpath("//button[@id='SubmitCreate']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='id_gender1' and @value='1']")));
		
		driver.findElement(By.xpath("//input[@id='id_gender1' and @value='1']")).click();
		driver.findElement(By.xpath("//input[@id='customer_firstname']")).sendKeys("Tester");
		driver.findElement(By.xpath("//input[@id='customer_lastname']")).sendKeys("Try");
		driver.findElement(By.xpath("//input[@id='email']"));
		driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("admin@123");
		
		Select sel1 = new Select(driver.findElement(By.id("days")));
		sel1.selectByValue("4");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Select sel2 = new Select(driver.findElement(By.id("months")));
		sel2.selectByValue("2");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		Select sel3 = new Select(driver.findElement(By.id("years")));
		sel3.selectByValue("2021");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='firstname']")));
		
		driver.findElement(By.xpath("//input[@id='firstname']"));
		driver.findElement(By.xpath("//input[@id='lastname']"));
		driver.findElement(By.xpath("//input[@id='company']")).sendKeys("company1");
		driver.findElement(By.xpath("//input[@id='address1']")).sendKeys("XYZ");
		driver.findElement(By.xpath("//input[@id='city']")).sendKeys("Delhi");
		
		Select selstate = new Select(driver.findElement(By.id("id_state")));
		selstate.selectByValue("5");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='postcode']")));
		
		driver.findElement(By.xpath("//input[@id='postcode']")).sendKeys("90232");
		
		Select selcon = new Select(driver.findElement(By.id("id_country")));
		selcon.selectByValue("21");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='phone_mobile']")));
		
		driver.findElement(By.xpath("//input[@id='phone_mobile']")).sendKeys("9927358810");
		driver.findElement(By.xpath("//input[@id='alias']"));
		
		driver.findElement(By.xpath("//button[@name='submitAccount']")).click(); 
			
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Return to Home']")));
		
		Actions action= new Actions(driver);
		
		driver.findElement(By.xpath("//a[@title='Return to Home']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Women']")));
		
		WebElement mouse_od = driver.findElement(By.xpath("//a[@title='Women']"));
		action.moveToElement(mouse_od).perform();
		
		driver.findElement(By.xpath("(//a[@title='Summer Dresses'])[1]")).click();
		driver.findElement(By.xpath("//input[@name='layered_id_attribute_group_2']")).click();
		WebElement productSort = driver.findElement(By.id("selectProductSort"));	
		Select d_list = new Select(productSort);
		d_list.selectByVisibleText("Price: Lowest first");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h5//a[@title='Printed Chiffon Dress']")));
		
		WebElement mouse_od1 = driver.findElement(By.xpath("//h5//a[@title='Printed Chiffon Dress']"));
		action.moveToElement(mouse_od1).perform();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Add to cart' and @data-id-product='7']")));
		
		driver.findElement(By.xpath("//a[@title='Add to cart' and @data-id-product='7']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@title='Continue shopping']")));
		
		driver.findElement(By.xpath("//span[@title='Continue shopping']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//img[@src=\"http://automationpractice.com/img/p/1/2/12-home_default.jpg\"]")));
		
		WebElement mouse_od2 = driver.findElement(By.xpath("//img[@src=\"http://automationpractice.com/img/p/1/2/12-home_default.jpg\"]"));
		action.moveToElement(mouse_od2).perform();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[@title='Add to cart' and @data-id-product='5']")));
		
		driver.findElement(By.xpath("//a[@title='Add to cart' and @data-id-product='5']")).click();
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@title,'Proceed to checkout')]")));
		//Thread.sleep(8000);
		driver.findElement(By.xpath("//a[contains(@title,'Proceed to checkout')]")).click();
		
		String assertV = driver.findElement(By.xpath("//span[contains(text(),\"$47.38\") and @id='total_price']")).getText();
		assertEquals(assertV, "$47.38");
		
		
		
//		TakesScreenshot take_screenshot = ((TakesScreenshot)driver);
//		File src = take_screenshot.getScreenshotAs(OutputType.FILE);
//		File newfile = new File("E:/Java Practice/Assignment2/target/ss/ss.jpg");
//		
//		Files.copy(src, new File("E:/Java Practice/Assignment2/target/ss/ss.jpg"));
//		//Files.copy(src, newfile);
//		
		driver.quit(); 
		
				
	}

}
