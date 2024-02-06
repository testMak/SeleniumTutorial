package Probook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.bidi.script.ExceptionDetails;
public class Login {

	public static void main(String[] args) throws InterruptedException {
		
		String url = "https://probook.progideo.com";
		String expectedTitle1 = "Vue d'ensemble - ProBook";
		String actualTitle1 = null;
		String username = "nm.makroum@gmail.com";
		String password = "JavaJ2ee@@";
		String expectedTitle2 = "(3) Vue d'ensemble - ProBook";
		String actualTitle2 = null;
		String nom = "nadia makroum";
		WebElement element;
		//Chemin vers le driver Gecko (pour Firefox uniquement)
		System.setProperty("webdriver.edge.driver",
		//"C:\\Users\\Formation\\Desktop\\formation selenium\\chromedriver-win64\\chromedriver.exe");
				"C:\\Users\\Formation\\Desktop\\formation selenium\\edgedriver_win64\\msedgedriver.exe");
		//Invocation du navigateur Firefox, qui sera identifié avec le nom "driver".
		WebDriver driver = new EdgeDriver();
		//Ouvrir la page "http://probook.progideo.com".
		driver.get(url);
		//On clique sur le lien "Se connecter / s'inscrire".
		driver.findElement(By.className("btn-enter")).click();
	
		//On affiche dans le log un message d'information
		//System.out.println("Login page title : expected value is "+expectedTitle1+"actual value is "+actualTitle1);
		assertEquals(actualTitle2, expectedTitle1);
		//Si le test échoue, on affiche un message d'erreur
		
		//Thread.sleep(2000);
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("login_username")));
		
		
		
		
		//On bascule sur la fenêtre modale
		driver.switchTo().activeElement();
		//On saisit le username et le password
		driver.findElement(By.id("login_username")).click();
		driver.findElement(By.id("login_username")).sendKeys(username);
		driver.findElement(By.id("login_password")).sendKeys(password);
		//On clique sur le bouton "Sign in"
		driver.findElement(By.id("login-button")).click();
		//Thread.sleep(2000);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.id("account-dropdown-link")));
		element = driver.findElement(By.id("account-dropdown-link"));
		//On récupère le titre de la page actuelle
		String nom1 = element.getText();

		//On vérifie le titre de la page suite à la tentative de connexion
		actualTitle2 = driver.getTitle();
		//On affiche dans le log un message d'information
		//System.out.println("Login result : expected value is "+expectedTitle2+" actualvalue is "+actualTitle2);
		System.out.println("nom : nadia makroum "+nom+"actual value is "+nom1);
		assertEquals(actualTitle2, expectedTitle1);

		//Si le test échoue, on affiche un message d'erreur
		if (!nom.contentEquals(nom1)) {
			System.out.println("Test Failed");
			}
		//if (!actualTitle2.contentEquals(expectedTitle2)) {
		//System.out.println("Test Failed");
		//}
		//On ferme Firefox
		driver.close();

		}
	
	}


