package Dropdown;
import Initialization.* ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class Handle_checkbox extends Init{
    public static void main(String[] args) throws Exception{
        Setup();
        driver.navigate().to("https://demo.guru99.com/test/radio.html");
//        driver.findElement(By.xpath("//*[@id=\"vfb-7-2\"]")).click();
//        boolean isSelected = driver.findElement(By.id("vfb-7-2")).isSelected();
//        Thread.sleep(1000);
////        if(isSelected.isDisplayed() == false)
//        {
//            System.out.println("Chưa được chọn");
//            Thread.sleep(1000);
//            driver.findElement(By.id("vfb-7-2")).click();
//            Thread.sleep(1000);
//
//            WebElement mesDisplay = driver.findElement(By.xpath("//*[@id=\"vfb-7-2\"]"));
//
//            if(mesDisplay.isDisplayed() == true)
//            {
//                System.out.println("Vua dc chon");
//                System.out.println(mesDisplay.getText());
//            }
//        }
//        else
//        {
//            System.out.println("Đã được chọn");
//        }
        //Multi
        //Kiemtra nut"Check all" co text la "check all"
        WebElement button_CheckAll = driver.findElement(By.xpath("//*[@id=\"vfb-7-2\"]"));
        if(button_CheckAll.getAttribute("value").trim().toString().equals( "Check All"))
        {
            button_CheckAll.click();
        }
        else {
            System.out.println("Khong lay duoc");
        }
        Thread.sleep(1000);
        WebElement Checkbox1 = button_CheckAll.findElement(By.xpath("//*[@id=\"vfb-6-0\"]"));
        WebElement Checkbox2 = button_CheckAll.findElement(By.xpath("//*[@id=\"vfb-6-1\"]"));
        WebElement Checkbox3 = button_CheckAll.findElement(By.xpath("//*[@id=\"vfb-6-2\"]"));


        if(Checkbox1.isSelected() == true && Checkbox2.isSelected() == true && Checkbox3.isSelected() == true)
        {
            System.out.println("Da dc chon");
        }
        else
        {
            System.out.println("Sai. Chua duoc chon het");
        }
        //Kiemtra nut checkall chuyen sang uncheckall
        WebElement button_UnCheckAll = driver.findElement(By.xpath("//*[@id=\"vfb-7-2\"]"));
        if(button_UnCheckAll.getAttribute("value").trim().toString().equals( "Un Check All"))
        {
            System.out.println("Da chuyen thanh UncheckAll");
        }
        else {
            System.out.println("Chua duoc chuyen");
        }
        TearDown();
    }
}
