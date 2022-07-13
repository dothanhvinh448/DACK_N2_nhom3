package test;
import org.openqa.selenium.By;
import driver.driverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.openqa.selenium.support.ui.Select;
@Test
public class thanhtoan {
    public static void thanhtoan() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
//1. Goto https://www.hoangkien.com/
            driver.get("https://www.hoangkien.com/");
// chọn sản phẩm là iphone thêm vào giỏ hàng
            driver.findElement(By.xpath("//div[1]/div[1]/div[1]/div[1]/ul[1]/li[1]/a[1]")).click();
            driver.findElement(By.xpath("//div[1]/div[1]/div[4]/form[1]/a[1]/span[1]")).click();
            Thread.sleep(2000);
            // click mua hàng
            driver.findElement(By.xpath("//div[4]/div[1]/button[1]\n")).click();
            // đăng nhập
//            driver.findElement(By.xpath("//div[3]/a[1]/span[1]")).click();
//            WebElement email = driver.findElement(By.xpath("//div[1]/input[1]"));
//            WebElement pass = driver.findElement(By.xpath("//div[2]/input[1]"));
//            email.sendKeys("ab1@gmail.com");
//            pass.sendKeys("01042002");
//            driver.findElement(By.xpath("//div[4]/button[1]")).click();
//
//3 Nhập form thanh toán
//            WebElement hoten = driver.findElement(By.xpath("//*[@id='billingName']"));
//            WebElement phone = driver.findElement(By.xpath("//*[@id='billingPhone']"));
//            WebElement address = driver.findElement(By.xpath("//*[@id='billingAddress']"));
//            hoten.sendKeys("abcde@gmail.com");
//            phone.sendKeys("01042002");
//            address.sendKeys("binh dinh");
//            WebElement dropdownElement1 = driver.findElement(By.xpath("//*[@id='select2-billingProvince-container']"));
//            Select selectOption1 = new Select(dropdownElement1);
//           selectOption1.selectByVisibleText("An Giang");
//            WebElement dropdownElement2 = driver.findElement(By.xpath("//*[@id='select2-billingProvince-container']"));
//            Select selectOption2 = new Select(dropdownElement2);
//            selectOption2.selectByVisibleText("Thành phố Long Xuyên");
        } catch (Exception e) {
            e.printStackTrace();
        }
//        driver.quit();
    }
}
