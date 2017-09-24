import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/selenium/chromedriver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/");
	}

}
