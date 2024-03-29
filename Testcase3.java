package selenium;

import org.openqa.selenium.By;  
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.chrome.ChromeDriver;
  
public class Testcase3 {  
  
    public static void main(String[] args) {  
      
           // System Property for Chrome Driver   
    	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Pavan Annambhotla\\Downloads\\chromedriver_win32\\chromedriver.exe");
    			         
          
             // Instantiate a ChromeDriver class.     
        WebDriver driver=new ChromeDriver();  
          
           // Launch Website  
        driver.navigate().to("https://www.thesparksfoundationsingapore.org");  
            
          
          //Scroll down the webpage by 5000 pixels  
        JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 5000)");  
        
      //Get list of web-elements with tagName  - a
        List<WebElement> allLinks = driver.findElements(By.tagName("div"));
        
        //Traversing through the list and printing its text along with link address
       
        System.out.println(allLinks.size());
        
        
    }  
  
}