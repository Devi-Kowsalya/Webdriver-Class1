package WebDriver_Class1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mygurulogin {

	
public static void main(String[] args) throws InterruptedException {
	String tData = "f";
    System.setProperty("webdriver.chrome.driver","C:\\Users\\RAJ\\Desktop\\drivers\\chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        
        driver.get("http://demo.guru99.com/V4/index.php");
        driver.findElement(By.name("uid")).sendKeys("mgr123");
        driver.findElement(By.name("password")).sendKeys("mgr!23");
        driver.findElement(By.name("btnLogin")).click();
        driver.findElement(By.linkText("New Customer")).click();
        driver.findElement(By.name("name")).sendKeys("Devi Kowsalya");
        
      //Radio option handling
      		List<WebElement> rad1= driver.findElements(By.name("rad1"));
      		System.out.println(rad1.size());

      		for(int i = 0; i<rad1.size();i++)
      		{
      			System.out.println(rad1.get(i).getAttribute("value"));
      			//Click radio option based on tData
      			if (rad1.get(i).getAttribute("value").equals(tData))
      			{
      				rad1.get(i).click();
      			}
      		}

      		//Check correct object is clicked
      		for(int i=0; i<rad1.size();i++)
      		{
      			if (rad1.get(i).getAttribute("value").equals(tData))
      				if(rad1.get(i).getAttribute("checked").equals("true")) 
      				{
      					System.out.println("Female Clicked");
      				}

      			//System.out.println(tripTypes.get(i).getAttribute("value") +"-->" +tripTypes.get(i).getAttribute("checked"));
      		}

      		driver.findElement(By.id("dob")).sendKeys("06051993");
      		driver.findElement(By.name("addr")).sendKeys("70 EB Colony");
      		driver.findElement(By.name("city")).sendKeys("Coimbatore");
      		driver.findElement(By.name("state")).sendKeys("Tamilnadu");
      		driver.findElement(By.name("pinno")).sendKeys("641113");
      		driver.findElement(By.name("telephoneno")).sendKeys("8903565980");
      		driver.findElement(By.name("emailid")).sendKeys("kowsalya.govindaraj@gmail.com");
      		driver.findElement(By.name("password")).sendKeys("Kowsi@1993");
      		driver.findElement(By.name("sub")).click(); 		
      		Thread.sleep(3000);
      		
      		}
    	        
        
       // driver.findElement(By.linkText("Log out")).click();
        //Thread.sleep(3000);
       // driver.close();
       
       
}

