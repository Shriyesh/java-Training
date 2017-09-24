import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:/selenium/chromedriver/chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver .get("https://www.ebay.in/");
		String beforeclick=driver.getTitle();
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer= driver.findElement(By.xpath(".//*[@id='footerFragment']/div"));
		System.out.println("Footer count: "+footer.findElements(By.tagName("a")).size());
		WebElement footerpart= driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[4]/ul"));
		System.out.println("Footer 2nd column count: "+footerpart.findElements(By.tagName("a")).size());
		for(int i=0;i<footerpart.findElements(By.tagName("a")).size();i++)
		{
		//System.out.println(footerpart.findElements(By.tagName("a")).get(i).getText());
			if (footerpart.findElements(By.tagName("a")).get(i).getText().equalsIgnoreCase("Site Map"))
			{
				footerpart.findElements(By.tagName("a")).get(i).click();
				break;
			}
		}
		
		String afterclick=driver.getTitle();
		if(beforeclick.equalsIgnoreCase(afterclick))
		{
			System.out.println("Page has not been navigated");
			
		}
		else
		{System.out.println("Page has been navigated");}
		boolean abc= driver.findElement(By.xpath("html/body/table/tbody/tr[2]/td/table[2]/tbody/tr[5]/td/table/tbody/tr/td[2]")).isDisplayed();
	if(abc==true)
	{System.out.println("Pass");}
	else
	{
		System.out.println("Fail");
	}
	
	}

}
