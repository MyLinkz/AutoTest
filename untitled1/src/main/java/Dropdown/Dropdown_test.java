package Dropdown;

import Initialization.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
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

        //Value
        Select1.selectByValue("AL");
        System.out.println("Da chon Albania ");
        Thread.sleep(1000);

        //Text
        Select1.selectByVisibleText("Algeria");
        System.out.println("Da chon Algeria ");
        Thread.sleep(1000);

        //Vi tri
        Select1.selectByIndex(1);
        System.out.println("Da chon Afghanistan");

        //check Multiple
        if(Select1.isMultiple() == true){
            System.out.println("Multiple");
        }
        else{
            System.out.println("UnMultiple");
        }
        Thread.sleep(1000);
         //count phan tu
        System.out.println(Select1.getOptions().size());

        //Kiem tra gia tri option da duoc chon
        System.out.println(Select1.getFirstSelectedOption().getText());
        if(Select1.getFirstSelectedOption().getText() == "Albania" ){
            System.out.println("Right");
        }
        else{
            System.out.println("Wrong");
        }
       List<WebElement> getAllOption = Select1.getOptions();
        for(int i=0; i<getAllOption.size(); i++)
        {
            System.out.println(getAllOption.get(i).getText());
        }


    TearDown();

}
}
