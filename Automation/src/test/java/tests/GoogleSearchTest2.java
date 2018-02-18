package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class GoogleSearchTest2 extends BaseTest {

    @Test(priority = 1, description = "User should write phrase in search box")
    public void userEnteredPhraseInSearchBox() {
        //when
        Pages.searchFor("Selenium");
        //then
        // boolean checkIfPhraseIsPresent = Pages.checkIfValueIsPresent("Selenium - Web Browser Automation");
        Assert.assertTrue(resultPages.checkIfValueIsPresent("Selenium - Web Browser Automation"));
    }

    @Test(priority = 2, description = "User after clicking link should see correct pages")
    public void shouldDisplayCorrectSite() {
        //when
        resultPages.clickOnLink("Selenium - Web Browser Automation");
        //then
        Assert.assertTrue(resultPages.CheckIfLinkIsPresent("http://www.seleniumhq.org/"));
    }

}
