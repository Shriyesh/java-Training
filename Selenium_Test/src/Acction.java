import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acction {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D:/selenium/chromedriver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Actions act=new Actions(driver);
		WebElement element1= driver.findElement(By.xpath(".//*[@id='nav-link-yourAccount']"));
		WebElement element2= driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']"));
		//driver.findElement(By.xpath(".//*[@id='twotabsearchtextbox']")).sendKeys("football");
		//act.moveToElement(element1).build().perform();
		act.keyDown(Keys.SHIFT).moveToElement(element2).click().sendKeys("studs").build().perform();
		act.contextClick(element1).build().perform();
		//act.contextClick();
		

	}

}
