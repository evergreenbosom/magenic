package org.example.pagemodels;

import com.magenic.jmaqs.selenium.BaseSeleniumPageModel;
import com.magenic.jmaqs.selenium.LazyWebElement;
import com.magenic.jmaqs.selenium.SeleniumConfig;
import com.magenic.jmaqs.selenium.SeleniumTestObject;
import com.magenic.jmaqs.selenium.factories.UIWaitFactory;
import com.magenic.jmaqs.utilities.helper.exceptions.ExecutionFailedException;
import com.magenic.jmaqs.utilities.helper.exceptions.TimeoutException;
import org.openqa.selenium.By;

public class SwaggerApiPageModel extends BaseSeleniumPageModel {

    /**
     * The URL for the page.
     */
    private static final String PAGE_URL = SeleniumConfig.getWebSiteBase() + "";

    /**
     * Welcome Message Selector.
     */
    private static final By SWAGGER_API_TEXT = By.cssSelector("#api_info > div.info_title");
    private LazyWebElement error = getLazyElement(SWAGGER_API_TEXT,"Magenic Automation Test Site API");


    public String getSwaggerApiPageText() throws InterruptedException, TimeoutException, ExecutionFailedException {
        return UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(SWAGGER_API_TEXT).getText();
    }

    /**
     * Instantiates a new Home page model.
     *
     * @param testObject the test object
     */
    public SwaggerApiPageModel(SeleniumTestObject testObject) {
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

        return UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(SWAGGER_API_TEXT).isDisplayed();
    }
    public Automation Navigageto () throws InterruptedException, TimeoutException, ExecutionFailedException {
        //UIWaitFactory.getWaitDriver(getWebDriver()).waitForClickableElement(About_Page).click();
        //  Error.click();
        return new Automation();

    }


}