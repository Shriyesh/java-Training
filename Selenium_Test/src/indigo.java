import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class indigo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/selenium/chromedriver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.goibibo.com/ ");
		System.out.println(driver.findElement(By.xpath("//[@id='gi_oneway_label']")).getText());
		/*List<WebElement>l1= driver.findElements(By.xpath("//input[@type='radio']"));
		l1.get(1).click();*/
		driver.findElement(By.xpath(".//*[@id='remember_me']")).click();
	
		//driver.findElement(By.xpath(".//*[@id='searchWidgetCommon']/div/div[3]/div[1]/div[1]/div/i")).sendKeys("15/08/2017");
		
		/*driver.findElement(By.xpath(".//*[@id='roundWay']/form/div[1]/div/div/ul/li[3]/div/div[1]")).click();
		driver.findElement(By.xpath(".//*[@id='globalModal']/div/div/div[3]/button")).click();
		*/
	
		//driver.close();
	}

}
