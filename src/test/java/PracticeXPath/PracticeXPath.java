package PracticeXPath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by alex on 11.01.2017.
 */
public class PracticeXPath {

    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://techno-geek.co.uk/SeleniumPractice/Form.html");
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("oleksiisuprun@gmail.com");
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("oAlex");
        driver.findElement(By.xpath("//input[@id='address']")).sendKeys("Lepse st, 36B");
        driver.findElement(By.xpath("//input[@id='hobby']")).sendKeys("Tennis");
        driver.findElement(By.xpath("//input[@id='submit']")).click();

    }
}