package GooglePages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class GooglePage {
    private WebDriver driver;
    private WebElement searchBox;
    private WebElement searchButton;

    public GooglePage(WebDriver driver) {
        this.driver = driver;
        searchBox = driver.findElement(By.id("lst-ib"));
        searchButton = driver.findElement(By.name("btnK"));
    }


    public void searchFor(String searchedValue1) {
        searchBox.clear();
        searchBox.sendKeys(searchedValue1);
        searchBox.sendKeys(Keys.TAB);
        searchButton.click();

    }


}
