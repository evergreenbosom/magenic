package org.example.pagemodels;

import com.magenic.jmaqs.selenium.BaseSeleniumPageModel;
import com.magenic.jmaqs.selenium.LazyWebElement;
import com.magenic.jmaqs.selenium.SeleniumConfig;
import com.magenic.jmaqs.selenium.SeleniumTestObject;
import com.magenic.jmaqs.selenium.factories.UIWaitFactory;
import com.magenic.jmaqs.utilities.helper.exceptions.ExecutionFailedException;
import com.magenic.jmaqs.utilities.helper.exceptions.TimeoutException;
import org.openqa.selenium.By;

public class ShowDailog2PageModel extends BaseSeleniumPageModel {

    /**
     * The URL for the page.
     */
    private static final String PAGE_URL = SeleniumConfig.getWebSiteBase() + "";

    /**
     * Show Dailog2 Message Selector.
     */
    private static final By SHOW_DAILOG2MS = By.cssSelector("#ui-id-1");
    private LazyWebElement showdailog2Ms = getLazyElement(SHOW_DAILOG2MS,"Download complete");
    /**
     * Show Dailog2 Close Button Selector.
     */
    private static final By SHOW_DAILOG2BTN = By.xpath("//*[@id=\"body\"]/div[4]/div[1]/button/span[1]");
    private LazyWebElement showdailog2Btn = getLazyElement(SHOW_DAILOG2BTN,"");


    public String getShowDailogText() throws InterruptedException, TimeoutException, ExecutionFailedException {
        return UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(SHOW_DAILOG2MS).getText();
    }



    public void clickCloseButton() throws InterruptedException, TimeoutException, ExecutionFailedException {
        UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(SHOW_DAILOG2BTN).click();
    }

    /**
     * Instantiates a new Home page model.
     *
     * @param testObject the test object
     */
    public ShowDailog2PageModel(SeleniumTestObject testObject) {
        super(testObject);
    }

    /**
     * Open the login page.
     */
    public void openLoginPage() {
        getWebDriver().navigate().to(PAGE_URL);
        // Assert.assertTrue(this.isPageLoaded(), String.format("The web page %s is not loaded", PAGE_URL));
    }

    /**
     * Check if home page has been loaded
     *
     * @return True if the page was loaded
     */
    public boolean isPageLoaded() {
        //return UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(WELCOME_MESSAGE).isDisplayed();

        return UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(SHOW_DAILOG2MS).isDisplayed();
    }
    public Automation Navigageto () throws InterruptedException, TimeoutException, ExecutionFailedException {
        //UIWaitFactory.getWaitDriver(getWebDriver()).waitForClickableElement(About_Page).click();
        //  Error.click();
        return new Automation();

    }


}
