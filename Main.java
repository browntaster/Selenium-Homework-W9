import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://demo.nopcommerce.com/");

        String title = driver.getTitle();
        System.out.println(title);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(400));

        WebElement textBox = driver.findElement(By.id("small-searchterms"));
        textBox.sendKeys("computer");

        WebElement submitButton = driver.findElement(By.tagName("button"));
        submitButton.click();

      //  WebElement message = driver.findElement(By.className("item-grid"));
       // String displayMessage = message.getText();
       // System.out.println(displayMessage);

        //driver.quit();


    }
}