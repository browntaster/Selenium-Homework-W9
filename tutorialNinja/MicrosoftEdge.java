package tutorialNinja;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class MicrosoftEdge {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();

        driver.get("https://tutorialsninja.com/demo/");

        String title = driver.getTitle();
        System.out.println(title);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(400));

        WebElement textBox = driver.findElement(By.name("search"));
        textBox.sendKeys("Tablets");

        WebElement searchButton = driver.findElement(By.tagName("button"));
        searchButton.click();

        driver.quit();
    }
}
