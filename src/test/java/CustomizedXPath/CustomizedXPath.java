package CustomizedXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
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
        boolean a = (driver.findElement(By.xpath("//input [@id='under_13']")).isSelected());
        System.out.println("Age element under 13 is selected (true / false): " + a);
        driver.findElement(By.xpath("//input [@id='job']")).sendKeys("Analyst");
        driver.findElement(By.xpath("//input [@id='address']")).sendKeys("Kiev, Ukraine, Lepse, st 26B");
        driver.findElement(By.cssSelector("#development")).click();
        boolean b = (driver.findElement(By.cssSelector("#development")).isSelected());
        System.out.println("Age element Interests (true / false): " + b);
        driver.findElement(By.cssSelector("#biodata")).sendKeys("Not sure what's the difference of a Curriculum Vitae (CV) vs a Resume, then this is your source for understanding why a CV is not a resume and how they differ.");
        driver.findElement(By.cssSelector("#hobby")).sendKeys("Tennis");
        wait.until(ExpectedConditions.elementToBeClickable(By.id("submit")));
    }
}
