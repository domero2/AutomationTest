package GooglePages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ResultPages {
    private WebDriver driver;

    public ResultPages(WebDriver driver) {
        this.driver = driver;
    }

    public boolean checkIfValueIsPresent(String searchPhrase) {
        WebElement searchedLink = driver.findElement(By.linkText(searchPhrase));
        return searchedLink.isDisplayed();
    }
    public void clickOnLink(String LinkText){
        WebElement linkElement = driver.findElement(By.linkText(LinkText));
        linkElement.click();
    }
    public boolean CheckIfLinkIsPresent(String ExpectedUrl){
        String actualUrl = driver.getCurrentUrl();

        return actualUrl.equals(ExpectedUrl);
    }
}
