package org.example.pagemodels;

import com.magenic.jmaqs.selenium.BaseSeleniumPageModel;
import com.magenic.jmaqs.selenium.LazyWebElement;
import com.magenic.jmaqs.selenium.SeleniumConfig;
import com.magenic.jmaqs.selenium.SeleniumTestObject;
import com.magenic.jmaqs.selenium.factories.UIWaitFactory;
import com.magenic.jmaqs.utilities.helper.exceptions.ExecutionFailedException;
import com.magenic.jmaqs.utilities.helper.exceptions.TimeoutException;
import org.openqa.selenium.By;

/**
 * The type Home page model.
 */
public class HomePageModel extends BaseSeleniumPageModel {

  /**
   * The URL for the page.
   */
  private static final String PAGE_URL = SeleniumConfig.getWebSiteBase() + "Static/Training1/HomePage.html";

  /**
   * Welcome Message Selector.
   */
  private static final By WELCOME_MESSAGE = By.cssSelector("#About");

  private static final By About_Page = By.cssSelector("#About");
  private  LazyWebElement About = new LazyWebElement(this.getTestObject(), By.cssSelector("#About"),
          "Lazyaboutele");

  /**
   * Instantiates a new Home page model.
   *
   * @param testObject the test object
   */
  public HomePageModel(SeleniumTestObject testObject) {
    super(testObject);
  }

  /**
   * Check if home page has been loaded
   Check if home page has been loaded
   *
   * @return True if the page was loaded
   */
  public boolean isPageLoaded() {
    //return UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(WELCOME_MESSAGE).isDisplayed();

    return UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(WELCOME_MESSAGE).isDisplayed();
  }
  public Automation Navigageto () throws InterruptedException, TimeoutException, ExecutionFailedException {
    //UIWaitFactory.getWaitDriver(getWebDriver()).waitForClickableElement(About_Page).click();
    About.click();
    return new Automation();

  }


}
