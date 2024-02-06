package ExempleTNG;

import org.testng.annotations.Listeners;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;

@Listeners(ExempleTNG.Listener.class)

public class TestNG {
	WebDriver driver;
	String url;
	
	@DataProvider (name="data1")
	public static Object[][] data1(){
		return new Object[][] {{ "nm.makroum@gmail.com","JavaJ2ee@@"}};
	}

  @Test (dataProvider = "data1")
  public void f(String Param1, String Param2) throws InterruptedException {
	  
	  driver.findElement(By.className("btn-enter")).click();
	  Thread.sleep(2000);
	  driver.findElement(By.id("login_username")).sendKeys(Param1);
	  Thread.sleep(2000);
	 driver.findElement(By.id("login_password")).sendKeys(Param2);
	 Thread.sleep(2000);
	 driver.findElement(By.id("login-button")).click();
  }
  
  @Parameters ("browser")
  @BeforeMethod
  public void beforeMethod(String browser) {
	  url = "https://probook.progideo.com";
	  if (browser.equalsIgnoreCase("firefox")) {
		  // Chemin vers le driver Gecko (pour Firefox uniquement)
		  System.setProperty("webdriver.gecko.driver",
				  "C:\\Users\\Formation\\Desktop\\formation selenium\\edgedriver_win64\\msedgedriver.exe");

		  // Invocation du navigateur Firefox, qui sera identifié avec le nom
		  driver = new FirefoxDriver();
	  } else if (browser.equalsIgnoreCase("chrome")) {
		  // Chemin vers le driver Chrome
		  System.setProperty("webdriver.chrome.driver","C:\\Users\\Formation\\Desktop\\formation selenium\\chromedriver-win64\\chromedriver.exe");
		  driver = new ChromeDriver();
	  }
	  else if (browser.equalsIgnoreCase("edge")) {
		  System.setProperty("webdriver.edge.driver",
						"C:\\Users\\Formation\\Desktop\\formation selenium\\edgedriver_win64\\msedgedriver.exe");
		  driver = new EdgeDriver();
	  }
	  
	  driver.get(url);
  }

  @AfterMethod
  public void afterMethod() {
	  
	  driver.close();
	  
  }

}
