package XPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by alex on 10.01.2017.
 */
public class Locators {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://techno-geek.co.uk/callmycab");
        driver.manage().window().maximize();
        driver.findElement(By.xpath(".//*[@id='navbar']/ul/li[1]/a/nav/span[2]")).click();
    }
}
