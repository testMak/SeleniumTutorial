package Probook;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreationEspace {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		String url = "https://probook.progideo.com/";
		
		WebElement welcome;
		
		//Chemin vers le driver Gecko (pour Firefox uniquement)
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Formation\\Desktop\\formation selenium\\chromedriver-win64\\chromedriver.exe");
		
				WebDriver driver = new ChromeDriver();
				driver.get(url);	
				driver.findElement(By.className("btn-enter")).click();
				Thread.sleep(2000);

				driver.findElement(By.id("login_username")).click();
				driver.findElement(By.id("login_username")).sendKeys("nm.makroum@gmail.com");
				driver.findElement(By.id("login_password")).sendKeys("JavaJ2ee@@");
				driver.findElement(By.id("login-button")).click();
				Thread.sleep(2000);
				driver.findElement(By.id("space-menu")).click(); 
				Thread.sleep(2000);
				//driver.findElement(By.xpath("//a[@class='btn btn-info col-md-12']")).click();
				
				//driver.findElement(By.id("space-name")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("//strong[@class='space-name'][normalize-space()='espace mak']")).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[1]/div[1]/div[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[2]/div[1]/button[1]")).click();
				Thread.sleep(2000);
				driver.findElement(By.linkText("Membres")).click();
				Thread.sleep(2000);
								List<WebElement> rows = driver.findElements(By.cssSelector("[class ='table table-hover'] tr"));
								
								for (int i = 1; i <= rows.size()-1; i++){
									System.out.println("Ligne "+i+" :"+driver.findElement(By.xpath("//table[@class='table table-hover']/tbody/tr["+i+"]/td[2]")).getText());
									//System.out.println("Ligne "+i+" :"+driver.findElement(By.xpath("//table[@class='table table-hover']/tbody/tr["+i+"]/td[5]")).getText());

									}
			
	}

}
