package ClientApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.*;
//import org.openqa.selenium.JavascriptExecutor;



public class FirstClient {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws NoSuchElementException {
//browser driver path
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	ChromeDriver driver=new ChromeDriver();
	//JavascriptExecutor js = (JavascriptExecutor) driver;
	driver.get("https://cimatest-client.analogyplus.com/"); //Opening Client Application 
	driver.manage().window().maximize();
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[2]/button[1]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();
	/*driver.findElement(By.cssSelector("#mui-1")).sendKeys("abc.qwerty@test.com");
	driver.findElement(By.xpath("//input[@id='mui-1']")).sendKeys("abc.qwerty@test.com");
	js.executeScript("window.scrollBy(0,1000)");
	driver.findElement(By.id("mui-1")).click();
	driver.findElement(By.cssSelector("div.MuiOutlinedInput-root.MuiInputBase-root.MuiInputBase-colorPrimary.Mui-error.MuiInputBase-formControl.MuiInputBase-sizeSmall.css-1v4ccyo")).sendKeys("abc.qwerty@test.com");
	driver.findElement(By.xpath("/html/body/div/div/div/div[2]/div[4]/div[2]/div[2]/div/input")).sendKeys("1234567890");*/
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();
	driver.findElement(By.cssSelector("label[for='18_Yes']")).click();
	/*driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[2]/button[1]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/label[1]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[2]/button[1]")).click();
	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/main[1]/div[2]/button[1]")).click();
	driver.findElement(By.className("Button_linkLike__tb7a7")).click();	
	driver.findElement(By.id("application-id")).sendKeys("1MFKWBW");							
    driver.findElement(By.id("pin-number")).sendKeys("5892");	
    driver.findElement(By.linkText("Login")).click();*/
		System.out.println(driver.getTitle());
		//driver.quit();
	}

}
