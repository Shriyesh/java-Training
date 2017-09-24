import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Table {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/selenium/chromedriver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver .get("http://www.espncricinfo.com/");
		driver.findElement(By.xpath(".//*[@id='favfeed-quicklinks']/li[1]/a/div[2]/span[1]")).click();
		driver.findElement(By.xpath(".//*[@id='global-nav-secondary']/div/ul[2]/li[4]/a/span[1]")).click();
		/*WebElement table= driver.findElement(By.xpath(".//*[@id='main-container']/div/div[2]/div[2]/article[1]/div/table/tbody[2]/tr[4]/td/span[1]"));
		List<WebElement>noofrows=table.findElements(By.tagName("tr"));
		List<WebElement>noofcols=table.findElements(By.tagName("td"));
		System.out.println("No of rows in a table"+noofrows.size());
		System.out.println("No of rows in a table"+noofcols.size());*/
	}

}
