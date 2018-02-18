package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest {
    private WebDriver driver;

    // private WebDriver driver = new ChromeDriver();
    @Test
    public void userShouldFindPhraseInSearchEngine() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.pl");
        WebElement searchBox = driver.findElement(By.id("lst-ib"));
        searchBox.sendKeys("Selenium");
        searchBox.sendKeys(Keys.TAB);

        Thread.sleep(2000);

        WebElement searchButton = driver.findElement(By.name("btnK"));
        searchButton.click();

        WebElement searchedLink = driver.findElement(By.linkText("Selenium - Web Browser Automation"));
        boolean checkIfElementIsPresent = searchedLink.isDisplayed();
        Assert.assertTrue(checkIfElementIsPresent);


        driver.quit();

    }
}
