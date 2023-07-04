package DirectMethod;

import java.awt.event.ActionEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DoubleClickMethod {

	public static void main(String[] args) throws InterruptedException {
		

		System.setProperty("driver.chromedriver.driver","./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/login.do");
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='pwd']")).sendKeys("manager");
		
		driver.findElement(By.xpath("//a[.='LoginButton']")).click();
		
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(@classs,'content administration')]")).click();
        driver.findElement(By.xpath("//a[.='Logo & Color Scheme']")).click();
        driver.findElement(By.xpath("//input[contains(@id,'uploadNewLogoOption')]")).click();
        WebElement target =driver.findElement(By.name("formCustomInterfaceLogo.logo"));
        
        Actions act = new Actions(driver);
        act.doubleClick(target).perform();  
	
	}

}
