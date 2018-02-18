package tests;

import GooglePages.GooglePage;
import GooglePages.ResultPages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public class BaseTest {
    protected WebDriver driver;
    protected GooglePage Pages;
    protected ResultPages resultPages;

    @BeforeClass
    public void initTest() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://www.google.pl");
        Pages = new GooglePage(driver);
        resultPages = new ResultPages(driver);

    }

    @AfterClass
    public void Close() {
        driver.quit();
    }
}

