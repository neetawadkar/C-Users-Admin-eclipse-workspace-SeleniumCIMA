package ClientApplication;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClientScreeningManager {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://cimatest-csm.analogyplus.com/"); //Opening CSM 
		driver.manage().window().maximize();
		driver.findElement(By.id("input-field")).sendKeys("csm@cima.org");
		driver.findElement(By.xpath("/html/body/div/div/div/div/div[2]/div/div/div[1]/input")).sendKeys("temp@1234");
		driver.findElement(By.xpath("/html/body/div/div/div/div/button")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[2]/div[3]/div[3]/table[1]/tbody[1]/tr[1]")).click();


	}

}
