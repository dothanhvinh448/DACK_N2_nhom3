package test;
import org.openqa.selenium.By;
import driver.driverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
@Test
public class dangky {
    public static void dangky() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            //1. Goto https://www.hoangkien.com/
            driver.get("https://www.hoangkien.com/");
//2. Click on tài khoản
      driver.findElement(By.xpath("//div[3]/a[1]/span[1]")).click();
//3. click Đăng ký (Đăng ký khách hàng mới)
        driver.findElement(By.id("show-form")).click();
//4. Nhập thông tin cá nhân và click đăng kí
            WebElement lastName = driver.findElement(By.id("last_name"));
            WebElement firstName = driver.findElement(By.id("first_name"));
            WebElement email = driver.findElement(By.id("email"));
            WebElement password = driver.findElement(By.id("creat_password"));
            lastName.sendKeys("Lê");
            firstName.sendKeys("Thanh");
            email.sendKeys("ab1@gmail.com");
            password.sendKeys("01042002");
            // click đăng kí
//            driver.findElement(By.xpath("//label[1]/input[1]")).click();
            driver.findElement(By.xpath("//div[6]/button[1]")).click();
        } catch (Exception e) {
            e.printStackTrace();
        }
//        driver.quit();
    }
}
