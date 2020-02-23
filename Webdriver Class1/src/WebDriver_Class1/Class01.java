
package WebDriver_Class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class01 {

	public static void main(String[] args) throws InterruptedException {
 System.setProperty("webdriver.chrome.driver","D:\\eclipse-jee-mars-1-win32\\eclipse\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //
        driver.get("http://demo.guru99.com/V4/index.php");
        driver.findElement(By.name("uid")).sendKeys("mgr123");
        driver.findElement(By.name("password")).sendKeys("mgr!23");
        driver.findElement(By.name("btnLogin")).click();
        driver.findElement(By.linkText("Log out")).click();
        Thread.sleep(3000);
        driver.close();
       
       
}

}
