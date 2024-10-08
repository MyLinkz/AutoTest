package Dropdown;

import Initialization.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;
public class Dropdown extends Init {
    public static void main(String[] args) throws Exception {
        Setup();
        driver.navigate().to("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        Thread.sleep(2000);

        // Tìm kiếm và click vào phần tử dropdown
        WebElement selecteCountryElement = driver.findElement(By.xpath("/html/body/section[1]/div[3]/div/div/div[2]/div[2]/div/a"));
        selecteCountryElement.click();

        // Tìm kiếm và click vào phần tử dropdown
//        WebElement inputCountryElement = driver.findElement(By.xpath("/html/body/section[1]/div[3]/div/div/div[2]/div[2]/div/div/div/input"));
//        inputCountryElement.sendKeys("Vietnam");
//        Thread.sleep(1000);

        WebElement inputCountryElement = driver.findElement(By.xpath("/html/body/section[1]/div[3]/div/div/div[2]/div[2]/div/div/div/input"));
        inputCountryElement.sendKeys("Cuba");
        Thread.sleep(1000);

        //Khai bao doi tuong thuoc lop action de handle keyboard cua ban phim
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).build().perform();

        TearDown();
    }
}