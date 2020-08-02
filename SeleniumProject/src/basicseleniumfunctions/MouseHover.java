package basicseleniumfunctions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MouseHover {

	public static void main(String[] args) {
		//Set ChromeDriver Path
		System.setProperty("webdriver.chrome.driver","D:\\Java Programs\\Drivers\\chromedriver.exe");
		ChromeDriver dr=new ChromeDriver();
		dr.manage().window().maximize();
		dr.get("https://www.flipkart.com/");
		
		//Implicit Wait
		dr.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		dr.findElement(By.xpath("//button[@class=\"_2AkmmA _29YdH8\"]")).click();
		Actions act=new Actions(dr);
		act.moveToElement(dr.findElement(By.xpath("//span[text()='Men']"))).build().perform();
		
		//Explicit Wait
		WebDriverWait wait=new WebDriverWait(dr,5);
		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("//a[text()='T-Shirts']"))));
		dr.findElement(By.xpath("//a[text()='T-Shirts']")).click();
		wait.until(ExpectedConditions.visibilityOf(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]"))));
		act.dragAndDropBy(dr.findElement(By.xpath("(//div[@class='_3aQU3C'])[1]")), 66, 0).build().perform();
		
		System.out.println("Script Passed");
		

	}

}
