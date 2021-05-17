package selenium;

import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver; 
import org.openqa.selenium.chrome.ChromeDriver;

public class Testcase4 {

public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavan Annambhotla\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver = new ChromeDriver(); 
driver.manage().window().maximize(); 
driver.manage().timeouts (). implicitlyWait (20, TimeUnit.SECONDS);

driver.get("https://www.thesparksfoundationsingapore.org/"); 
driver.findElement(By.partialLinkText("About Us")).click();

driver.navigate().back();

driver.navigate().forward();
driver.navigate().refresh();
driver.navigate().to("https://www.google.com/");
}
}