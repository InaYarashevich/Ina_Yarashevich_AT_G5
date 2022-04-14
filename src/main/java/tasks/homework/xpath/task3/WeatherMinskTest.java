package tasks.homework.xpath.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class WeatherMinskTest {

    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        DateFormat dtf = new SimpleDateFormat("HH");
        String now = dtf.format(new Date());

        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("погода Минск");
        WebElement el = driver.findElement(By.xpath("//input[@title='Шукаць']"));
        el.sendKeys(Keys.ARROW_DOWN);
        el.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//div[@id='wob_dp']/div[@data-wob-di='1']")).click();

        if (Integer.parseInt(now) > 12) {
            System.out.println(driver
                    .findElement(By.xpath("//*[contains( normalize-space(@aria-label), '12:00') and contains(@aria-label,'Celsius')][1]"))
                    .getAttribute("aria-label"));
        } else {
            System.out.println(driver
                    .findElement(By.xpath("//*[contains( normalize-space(@aria-label), '12:00') and contains(@aria-label,'Celsius')][2]"))
                    .getAttribute("aria-label"));
        }
    }
}
