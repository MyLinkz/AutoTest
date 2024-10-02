package Dropdown;

import Initialization.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

    public class Radion_Test extends Init {
    public static void main(String[] args) throws Exception {
        Setup();
        driver.navigate().to("https://practice.expandtesting.com/radio-buttons");

        //Blue
        WebElement button_radio_blue = driver.findElement(By.id("blue"));
        boolean isSelectedBlue = button_radio_blue.isSelected();
        Thread.sleep(1000);

        if (isSelectedBlue)
        {
            System.out.println("Blue đã được chọn");
        } else
        {
            System.out.println("Blue chưa được chọn");

            button_radio_blue.click();
            Thread.sleep(1000);
            if (button_radio_blue.isSelected())
            {
                System.out.println("Bạn đã chọn Blue");
            }
        }

        //Red
        WebElement button_radio_red = driver.findElement(By.id("red"));
        boolean isSelectedRed = button_radio_red.isSelected();
        Thread.sleep(1000);

        if (isSelectedRed)
        {
            System.out.println("Red đã được chọn");
        } else
        {
            System.out.println("Red chưa được chọn");

            button_radio_red.click();
            Thread.sleep(1000);
            if (button_radio_red.isSelected())
            {
                System.out.println("Bạn đã chọn Red");
            }
        }
        //Yellow
        WebElement button_radio_yellow = driver.findElement(By.id("yellow"));
        boolean isSelectedyellow = button_radio_yellow.isSelected();
        Thread.sleep(1000);

        if (isSelectedyellow)
        {
            System.out.println("Yellow đã được chọn");
        } else
        {
            System.out.println("Yellow chưa được chọn");

            button_radio_yellow.click();
            Thread.sleep(1000);
            if (button_radio_yellow.isSelected()) {
                System.out.println("Bạn đã chọn Yellow ");
            }
        }
        //Black
        WebElement button_radio_black = driver.findElement(By.id("black"));
        boolean isSelectedblack = button_radio_black.isSelected();
        Thread.sleep(1000);

        if(isSelectedblack)
        {
            System.out.println("Black đã được chọn");
        }
        else
        {
            System.out.println("Black chưa được chọn");

            button_radio_black.click();
            Thread.sleep(1000);
            if (button_radio_black.isSelected()){
                System.out.println("Bạn đã chọn Black  ");
            }
        }
        //Green
        WebElement button_radio_Green = driver.findElement(By.id("green"));
        boolean isSelectedGreen = button_radio_Green.isSelected();
        Thread.sleep(1000);

        if(isSelectedGreen)
        {
            System.out.println("Green đã được chọn");
        }
        else
        {
            System.out.println("Green chưa được chọn");

            button_radio_Green.click();
            Thread.sleep(1000);
            if (button_radio_Green.isSelected()){
                System.out.println("Bạn đã chọn Green  ");
            }
        }
        TearDown();
    }
}
