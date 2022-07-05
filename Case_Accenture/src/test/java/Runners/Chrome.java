package Runners;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Chrome {

	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	
	public static void DriverChrome()
	{
	//Configurando e e abrindo o chrome driver\\
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\User\\Git\\Desafio_Accenture\\Case_Accenture\\driver\\chromedriver.exe");
			
			
			driver = new ChromeDriver();
			wait = new WebDriverWait(driver, 10);
			driver.manage().window().maximize();
			driver.get("http://sampleapp.tricentis.com/101/app.php");
			
}
}
