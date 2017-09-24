import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/selenium/chromedriver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Set<Cookie>asd= driver.manage().getCookies();
		System.out.println(asd.size());
		Iterator<Cookie> iterator = asd.iterator(); 
	      
		   // check values
		   while (iterator.hasNext()){
		   System.out.println("Value: "+iterator.next() + " ");
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver .get("https://www.ebay.in/");
		driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul/li[5]/a")).click();
		driver.close();
		
		

	}

}}
