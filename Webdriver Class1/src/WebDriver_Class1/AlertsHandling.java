package WebDriver_Class1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsHandling {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\RAJ\\Desktop\\drivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.automationtesting.in/Windows.html");
		driver.findElement(By.linkText("Open New Seperate Windows")).click();
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
		Set<String> winIds=driver.getWindowHandles();
		System.out.println(winIds.size());
		Iterator<String> wIds = winIds.iterator();
		String pWin=wIds.next();
		String cWin=wIds.next();
		
		System.out.println("Parent Window: "+pWin);
		System.out.println("Child Window: "+cWin);
		
		//switch to child window
		driver.switchTo().window(cWin);
		//Child Window Coding
		driver.findElement(By.linkText("Download")).click();
		System.out.println(driver.getTitle());
		//Close Child Window
		driver.close();
		//switch back to parent window
		driver.switchTo().window(pWin);
		System.out.println(driver.getTitle());
		driver.close();
	}

}
