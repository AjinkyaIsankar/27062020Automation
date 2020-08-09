package Libraries;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import Configuration.Configuration;

public class CommonLibrary {
		public WebDriver launchBrowser(String browsername)
	{
		WebDriver dr=null;
		
		switch(browsername)
		{
		case "Chrome":
			System.setProperty("webdriver.chrome.driver", Configuration.chromePath);
			dr=new ChromeDriver();
			break;
		case "Firefox":
			//Add gecko driver path for Firefox driver
			dr=new FirefoxDriver();
			break;
			//Add more cases for other browsers
		}
		dr.manage().window().maximize();
		dr.manage().timeouts().implicitlyWait(Configuration.implicitWait, TimeUnit.SECONDS);
		
		return dr;
		}
	}

