package org.example.pagemodels;

import com.magenic.jmaqs.selenium.BaseSeleniumPageModel;
import com.magenic.jmaqs.selenium.LazyWebElement;
import com.magenic.jmaqs.selenium.SeleniumConfig;
import com.magenic.jmaqs.selenium.SeleniumTestObject;
import com.magenic.jmaqs.selenium.factories.UIWaitFactory;
import com.magenic.jmaqs.utilities.helper.exceptions.ExecutionFailedException;
import com.magenic.jmaqs.utilities.helper.exceptions.TimeoutException;
import org.openqa.selenium.By;

public class BootStrapPageModel extends BaseSeleniumPageModel {

    /**
     * The URL for the page.
     */
    private static final String PAGE_URL = SeleniumConfig.getWebSiteBase() + "";

    /**
     * Show Boot Strap Message Selector.
     */
    private static final By BOOT_STRAPMS = By.cssSelector("#myModalLabel");
    private LazyWebElement bootstrapms = getLazyElement(BOOT_STRAPMS,"Modal title");
    /**
     * Show Dailog2 Close Button Selector.
     */
    private static final By BOOT_STRAP_CLOSE_BTN = By.cssSelector("#myModal > div > div > div.modal-footer > button.btn.btn-default");
    private LazyWebElement bootstrapclbtn = getLazyElement(BOOT_STRAP_CLOSE_BTN,"");


    public String getBootStrapText() throws InterruptedException, TimeoutException, ExecutionFailedException {
        return UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(BOOT_STRAPMS).getText();
    }



    public void clickBootStrapCloseButton() throws InterruptedException, TimeoutException, ExecutionFailedException {
        UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(BOOT_STRAP_CLOSE_BTN).click();
    }

    /**
     * Instantiates a new Home page model.
     *
     * @param testObject the test object
     */
    public BootStrapPageModel(SeleniumTestObject testObject) {
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

        return UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(BOOT_STRAPMS).isDisplayed();
    }
    public Automation Navigageto () throws InterruptedException, TimeoutException, ExecutionFailedException {
        //UIWaitFactory.getWaitDriver(getWebDriver()).waitForClickableElement(About_Page).click();
        //  Error.click();
        return new Automation();

    }


}
