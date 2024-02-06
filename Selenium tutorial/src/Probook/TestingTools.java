package Probook;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestingTools {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		String url = "https://www.testingtoolsguide.net/";
		String element;
		WebElement welcome;
		
		//Chemin vers le driver Gecko (pour Firefox uniquement)
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Formation\\Desktop\\formation selenium\\chromedriver-win64\\chromedriver.exe");
		
				WebDriver driver = new ChromeDriver();
				driver.get(url);
				Thread.sleep(2000);
				
		WebElement Var = driver.findElement(By.xpath("//a[contains(text(),'Pages')]"));		
		Actions action = new Actions(driver);
		action.moveToElement(Var).perform();
		driver.findElement(By.id("menu-item-95")).click();
		
		
	
		element = driver.getTitle();
		welcome = driver.findElement(By.className("widgettitle"));
		System.out.println("Le titre de la page est : "+element);
		System.out.println("Le titre de la page est : "+welcome.getText());
		

	}

}
