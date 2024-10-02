package Dropdown;
import Initialization.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class Checkbox_test extends Init {
    public static void main(String[] args) throws Exception {
        Setup();
        driver.navigate().to("https://practice.expandtesting.com/checkboxes");

        //Checkbox 1
        WebElement checkbox1 = driver.findElement(By.id("checkbox1"));
        boolean isSelected1 = checkbox1.isSelected();
        Thread.sleep(1000);

        if (isSelected1) {
            System.out.println("Checkbox1 đã được chọn");
            Thread.sleep(1000);

            // Bỏ chọn checkbox1
            checkbox1.click();
            Thread.sleep(1000);

            // Kiểm tra nếu checkbox1 đã bị bỏ chọn
            if (!checkbox1.isSelected()) {
                System.out.println("Checkbox1 đã bị bỏ chọn");
            }
        } else {
            System.out.println("Checkbox1 chưa được chọn");
        }

        //Checkbox 2
        WebElement checkbox2 = driver.findElement(By.id("checkbox2"));
        boolean isSelected2 = checkbox2.isSelected();
        Thread.sleep(1000);

        if (isSelected2) {
            System.out.println("Checkbox2 đã được chọn");
            Thread.sleep(1000);

            // Bỏ chọn checkbox2
            checkbox2.click();
            Thread.sleep(1000);

            // Kiểm tra nếu checkbox2 đã bị bỏ chọn
            if (!checkbox2.isSelected()) {
                System.out.println("Checkbox2 đã bị bỏ chọn");
            }
        } else {
            System.out.println("Checkbox2 chưa được chọn");
        }

        //  Kiểm tra cả hai checkbox đã chọn
        if (checkbox1.isSelected() && checkbox2.isSelected()) {
            System.out.println("Cả Checkbox1 và Checkbox2 đều đã chọn");
        } else if (checkbox1.isSelected()) {
            System.out.println("Chỉ Checkbox1 đã chọn");
        } else if (checkbox2.isSelected()) {
            System.out.println("Chỉ Checkbox2 đã chọn");
        }
        //Chọn lại cả hai checkbox trước khi kiểm tra
        if (!checkbox1.isSelected()) {
            checkbox1.click();  // Chọn lại checkbox1 nếu chưa được chọn
        }
        if (!checkbox2.isSelected()) {
            checkbox2.click();  // Chọn lại checkbox2 nếu chưa được chọn
        }

        //  Kiểm tra cả hai checkbox đã bị bỏ chọn
        if (!checkbox1.isSelected() && !checkbox2.isSelected()) {
            System.out.println("Cả Checkbox1 và Checkbox2 đều đã bị bỏ chọn");
        } else if (!checkbox1.isSelected()) {
            System.out.println("Chỉ Checkbox1 đã bị bỏ chọn");
        } else if (!checkbox2.isSelected()) {
            System.out.println("Chỉ Checkbox2 đã bị bỏ chọn");
        }

        TearDown();
    }
}
