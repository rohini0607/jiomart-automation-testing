package jioo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Jiomartt {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C://Windows//chromedriver-win64.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://www.jiomart.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);

        WebElement menuElement = driver.findElement(By.xpath("//*[@id=\"btn_sign_in\"]"));
        Actions actions = new Actions(driver);
        actions.moveToElement(menuElement).click().perform();
        Thread.sleep(2000);

        WebElement numberField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phoneNumber")));
        numberField.sendKeys("***********");

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"__next\"]/div/div[2]/div/div/div[1]/div[3]/button")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[@id=\"otp-input\"]/div")).click();
        Thread.sleep(35000);
        WebElement searchField = driver.findElement(By.xpath("//*[@id=\"autocomplete-0-input\"]"));
        searchField.sendKeys("Moong dal");
        searchField.click();
        Thread.sleep(2000);
        WebElement selectedItems = driver.findElement(By.xpath("//li[@id='autocomplete-0-suggestions-item-0']"));
        selectedItems.click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@id='variant_491187257_Pack_of_1']")).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[contains(@class,'addtocartbtn')]")).click();
        driver.findElement(By.xpath("//*[@id=\"swiper-wrapper-b2344a306d86d833\"]/li[3]/a/div[4]")).click();
        driver.quit();
    }
}
