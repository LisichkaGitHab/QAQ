import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class TestOne {
    public static void main(String[] args){
        System.setProperty("webdriver.chrome.driver","C:\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//
        driver.get("http://a.testaddressbook.com/sign_in/");
        driver.findElement(By.id("session_email")).sendKeys("123@mail.ru");
        driver.findElement(By.name("session[password]")).sendKeys("123");
        driver.findElement(By.cssSelector("input[value=\"Sign in\"]")).click();

        //driver.findElement(By.xpath("//button[@class=\"navbar-toggler navbar-toggler-right collapsed\"]")).click();
        driver.findElement(By.xpath("//a[@class=\"nav-item nav-link\"]")).click();
        driver.findElement(By.xpath("//a[@class=\"row justify-content-center\"]")).click();
//новый адрес
        driver.findElement(By.cssSelector("input[name=\"address[first_name]\"]")).sendKeys("Ivan");
        driver.findElement(By.cssSelector("input[name=\"address[last_name]\"]")).sendKeys("Ivanov");
        driver.findElement(By.cssSelector("input[name=\"address[address1]\"]")).sendKeys("Limozha str. 135-12");
        driver.findElement(By.cssSelector("input[name=\"address[city]\"]")).sendKeys("Grodno");
        driver.findElement(By.cssSelector("input[name=\"address[zip_code]\"]")).sendKeys("230015");
        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
        driver.findElement(By.xpath("//a[text()='List']")).click();

//редактирование
                //driver.findElement(By.cssSelector("//td[text()='Ivan']")).click();
        driver.findElement(By.xpath("//a[text()='Edit']")).click();
        driver.findElement(By.cssSelector("input[name=\"address[first_name]\"]")).sendKeys("ko");
        driver.findElement(By.cssSelector("input[type=\"submit\"]")).click();
        driver.findElement(By.xpath("//a[text()='List']")).click();
//удаление
        driver.findElement(By.xpath("//a[@data-confirm=\"Are you sure?\"]")).click();
        driver.findElement(By.xpath("//a[@rel=\"nofollow\"]")).click();
//выход
        //driver.findElement(By.xpath("//a[@data-test=\"sign-out\"]")).click();



         //driver.close();
         //driver.quit();
    }

}
