package tasks.homework.xpath.task3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class WeatherMinskTest {
    static WebDriver driver = new ChromeDriver();

    public static void main(String[] args) {

        String currentDay = new SimpleDateFormat("EEEE", new Locale("be")).format(new Date());
        System.out.println(currentDay);

        driver.get("https://google.com");
        driver.findElement(By.name("q")).sendKeys("погода Минск");
        WebElement elementSearch = driver.findElement(By.xpath("//input[@title='Шукаць']"));
        elementSearch.sendKeys(Keys.ARROW_DOWN);
        elementSearch.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//div[@aria-label='" + currentDay + "']/../following-sibling::div[1]")).click();

        if (Integer.parseInt(currentDay) > 12) {
            System.out.println(driver
                    .findElement(By.xpath("//*[contains(normalize-space(@aria-label), '12:00') and contains(@aria-label,'Celsius')][1]"))
                    .getAttribute("aria-label"));
        } else {
            System.out.println(driver
                    .findElement(By.xpath("//*[contains(normalize-space(@aria-label), '12:00') and contains(@aria-label,'Celsius')][2]"))
                    .getAttribute("aria-label"));
        }
    }
}
