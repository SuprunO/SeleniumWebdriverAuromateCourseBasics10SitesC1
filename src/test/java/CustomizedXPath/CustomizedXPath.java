package CustomizedXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

/**
 * Created by alex on 10.01.2017.
 */
public class CustomizedXPath {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver =new FirefoxDriver();
        driver.get("http://techno-geek.co.uk/callmycab/callmycab/page_index/Register.php");
        driver.manage().window().maximize();
        WebDriverWait wait = new WebDriverWait(driver,10);

        //Customized XPATH

        driver.findElement(By.xpath("//input [@id='name']")).sendKeys("Alex");
        driver.findElement(By.xpath("//input [@id='phone']")).sendKeys("0934644014");
        driver.findElement(By.xpath("//input [@id='email']")).sendKeys("oleksiisuprun@gmail.com");
        driver.findElement(By.xpath("//input [@id='password']")).sendKeys("156423");
        driver.findElement(By.xpath("//input [@id='under_13']")).click();
        driver.findElement(By.xpath("//input [@id='job']")).sendKeys("Analyst");
        driver.findElement(By.xpath("//input [@id='address']")).sendKeys("Kiev,Ukraine, Lepase, st 26B");

        wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));





    }
}
