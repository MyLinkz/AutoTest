package Dropdown;

import Initialization.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.concurrent.TimeUnit;
import java.util.ArrayList;

public class Dropdown_test extends Init {
    public static void main(String[] args) throws Exception {
        Setup();
        driver.navigate().to("https://practice.expandtesting.com/dropdown");
        Thread.sleep(2000);
        //Handle Static Dropdown
        WebElement selectelement1 = driver.findElement(By.id("country"));

        Select Select1 = new Select(selectelement1);

        Select1.selectByValue("AL");
        System.out.println("Da chon Albania ");
        Thread.sleep(1000);

        Select1.selectByVisibleText("Algeria");
        System.out.println("Da chon Algeria ");
        Thread.sleep(1000);

        Select1.selectByIndex(1);
        System.out.println("Da chon Afghanistan");

    TearDown();

}
}
