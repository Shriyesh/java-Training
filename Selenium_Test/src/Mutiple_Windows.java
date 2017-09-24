import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mutiple_Windows {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/selenium/chromedriver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.xpath(".//*[@id='cee_closeBtn']/img")).click();
		/*Actions act=new Actions(driver);
		WebElement element1= driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[3]/ul/li[5]/div[1]/a/img"));
		act.moveToElement(element1);*/
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[3]/ul/li[4]/div[1]/span")).click();
		Thread.sleep(4000L);
		driver.findElement(By.xpath("html/body/div[1]/div[1]/div[2]/div[3]/ul/li[4]/div[2]/div[2]/div/ul/li[7]/a")).click();
		
		
		
	}

}
