import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Customized_xpath {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/selenium/chromedriver/chromedriver.exe");
		WebDriver c1= new ChromeDriver();
		c1.get("https://www.goodreads.com/");
		//Doing through xpath
		/*c1.findElement(By.xpath("//input[@id='userSignInFormEmail']")).sendKeys("shriyeshthakre@rocketmail.com");
		c1.findElement(By.xpath("//input[@id='user_password']")).sendKeys("fcbarcelona1");
		c1.findElement(By.xpath("//input[@value='Sign in']")).click();
		c1.findElement(By.xpath("html/body/div[1]/div/div/header/ul/li[5]/div/a/span/span/img")).click();
		c1.findElement(By.xpath("html/body/div[1]/div/div/header/ul/li[5]/div/div/ul/li[12]/a")).click();*/
		//Doing through css
		c1.findElement(By.cssSelector("[id='userSignInFormEmail']")).sendKeys("shriyeshthakre@rocketmail.com");
		c1.findElement(By.cssSelector("[id='user_password']")).sendKeys("fcbarcelona1");
		c1.findElement(By.cssSelector("[value='Sign in']")).click();
		//c1.findElement(By.xpath("html/body/div[1]/div/div/header/ul/li[5]/div/div/ul/li[12]/a")).click();
		c1.close();

	}

}
