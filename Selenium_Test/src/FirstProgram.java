import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
//This is a program about logining into goodreads and then logging out with closing the browser
public class FirstProgram {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "D:/selenium/chromedriver/chromedriver.exe");
		WebDriver c1= new ChromeDriver();
		c1.get("https://www.goodreads.com/");
		//Doing through xpath
		c1.findElement(By.xpath(".//*[@id='userSignInFormEmail']")).sendKeys("shriyeshthakre@rocketmail.com");
		c1.findElement(By.xpath(".//*[@id='user_password']")).sendKeys("fcbarcelona1");
		c1.findElement(By.xpath(".//*[@id='sign_in']/div[3]/input[1]")).click();
		c1.findElement(By.xpath("html/body/div[1]/div/div/header/ul/li[5]/div/a/span/span/img")).click();
		c1.findElement(By.xpath("html/body/div[1]/div/div/header/ul/li[5]/div/div/ul/li[12]/a")).click();
		//Doing through id
		/*c1.findElement(By.id("userSignInFormEmail")).sendKeys("shriyeshthakre@rocketmail.com");
		c1.findElement(By.id("user_password")).sendKeys("fcbarcelona1");
		c1.findElement(By.className("gr-button gr-button--dark")).click();
		c1.findElement(By.className("circularIcon circularIcon--border")).click();
		c1.findElement(By.className("siteHeader__subNavLink")).click();*/
		c1.close();
		
		
		
	
		

	}

}
