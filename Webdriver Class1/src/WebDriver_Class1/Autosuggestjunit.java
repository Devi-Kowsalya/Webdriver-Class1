package WebDriver_Class1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class Autosuggestjunit {

	public static void main(String[] args)throws InterruptedException {
		int j=1;
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJ\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://junit.org/junit5/docs/current/api");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		//Thread.sleep(3000);
		while(driver.findElements(By.xpath("//*[@id='i"+j+"']/th/a")).size() == 1)
		{
			System.out.println(driver.findElement(By.xpath("//*[@id='i"+j+"']/th/a")).getText());
			j++;
		}
		driver.close();

	}

}
