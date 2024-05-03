package nopcommerce;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class MicrosoftEdge {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();

        driver.get("https://demo.nopcommerce.com/");

        String title = driver.getTitle();
        System.out.println(title);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(400));

        WebElement serchBox = driver.findElement(By.id("small-searchterms"));
        serchBox.sendKeys("computer");

        WebElement submitButton = driver.findElement(By.tagName("button"));
        submitButton.click();

        driver.quit();
    }
}
