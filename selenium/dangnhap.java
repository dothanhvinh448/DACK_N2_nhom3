package test;
import org.openqa.selenium.By;
import driver.driverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
@Test
public class dangnhap {
    public static void dangnhap() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //1. Goto https://www.hoangkien.com/
            driver.get("https://www.hoangkien.com/");
//2. Click on đăng nhập
            driver.findElement(By.xpath("//div[3]/a[1]/span[1]")).click();
            WebElement email = driver.findElement(By.xpath("//div[1]/input[1]"));
            WebElement pass = driver.findElement(By.xpath("//div[2]/input[1]"));
            email.sendKeys("ab1@gmail.com");
            pass.sendKeys("01042002");
            driver.findElement(By.xpath("//div[4]/button[1]")).click();




        } catch (Exception e) {
            e.printStackTrace();
        }
//        driver.quit();
    }
}
