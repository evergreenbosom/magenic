package org.example.pagemodels;

import com.magenic.jmaqs.selenium.*;
import com.magenic.jmaqs.selenium.factories.UIWaitFactory;
import com.magenic.jmaqs.utilities.helper.exceptions.ExecutionFailedException;
import com.magenic.jmaqs.utilities.helper.exceptions.TimeoutException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MagenicAutoHomeModel<CLOTHIN_TABLE_ROW> extends BaseSeleniumPageModel {
    
    /*
    Connectiong to Jenkins
    */

    /**
     * The URL for the page.
     */
    private static final String PAGE_URL = SeleniumConfig.getWebSiteBase() + "/Automation";

    /**
     * Welcome Message Selector.
     */
    private static final By ERROR_LINK = By.xpath("//*[@id='ErrorPageLink']/a");

    //private static final By About_Page = By.cssSelector("//*[@id=\"ErrorPageLink\"]/a");
    private LazyWebElement Error = new LazyWebElement(this.getTestObject(), By.xpath("//*[@id='ErrorPageLink']/a"),
            "Lazyaboutele");
    private LazyWebElement error = getLazyElement(ERROR_LINK, "Error link");

    /*
    Async Link Slelector.
    */
    private static final By ASYNC_LINK = By.xpath("//*[@id='AsyncPageLink']/a");
    private LazyWebElement asyncLink = getLazyElement(ASYNC_LINK);

    /*
     Swagger API Link Slelector.
     */
    private static final By SWAGGER_API = By.cssSelector("#SwaggerPageLink > a");
    private LazyWebElement swaggerapi = getLazyElement(SWAGGER_API);
    /*
     Show Dailog Link Slelector.
     */
    private static final By SHOW_DIALOG = By.cssSelector("#showDialog1");
    private LazyWebElement showdailog = getLazyElement(SHOW_DIALOG);

    /*
     Show Dailog 2  Link Slelector.
     */
    private static final By SHOW_DIALOG2 = By.cssSelector("#showDialog2");
    private LazyWebElement showdailog2 = getLazyElement(SHOW_DIALOG2);

    /*
     Javascript Alert  Slelector.
     */
    private static final By JAVASCRIPT_ALERT = By.cssSelector("#javascriptAlertButton");
    private LazyWebElement javascriptallert = getLazyElement(JAVASCRIPT_ALERT);

    /*
      Javascript Alert With Confirm  Slelector.
     */
    private static final By ALERT_WITH_CONFIRM = By.cssSelector("#javascriptConfirmAlertButton");
    private LazyWebElement alertwithconfirm = getLazyElement(ALERT_WITH_CONFIRM);

    /*
      Boot Strap  Slelector.
     */
    private static final By BOOTSTRAP_MODAL = By.cssSelector("#ItemsToAutomate > button.btn.btn-primary.btn-lg");
    private LazyWebElement bootstrapmodal = getLazyElement(BOOTSTRAP_MODAL);

    /*
      Drag and Drop Source  Slelector.
     */
    private static final By DRAG_AND_DROP_SOURCE = By.cssSelector("#draggablleImageHTML5");
    private LazyWebElement draganddropsource = getLazyElement(DRAG_AND_DROP_SOURCE);

    /*
      Drag and Drop Target  Slelector.
     */
    private static final By DRAG_AND_DROP_TARGET = By.xpath("//*[@id='div2']");
    private LazyWebElement draganddroptarget = getLazyElement(DRAG_AND_DROP_TARGET);

    /*
      HTML4 Drag and Drop Source  Slelector.
     */
    private static final By DRAG_AND_DROP_SOURCE4 = By.cssSelector("#draggable > p");
    private LazyWebElement draganddropsource4 = getLazyElement(DRAG_AND_DROP_SOURCE4);

    /*
     HTML 4 Drag and Drop Target  Slelector.
     */
    private static final By DRAG_AND_DROP_TARGET4 = By.xpath("//*[@id='droppable']");
    private LazyWebElement draganddroptarget4 = getLazyElement(DRAG_AND_DROP_TARGET4);

    /*
     HTML 4 Drag and Drop New Target  Slelector.
     */
    private static final By DRAG_AND_DROP_NEWTARGET4 = By.xpath("//*[@id='droppable2']");
    private LazyWebElement draganddropnewtarget4 = getLazyElement(DRAG_AND_DROP_NEWTARGET4);

    /*
     Date Picker  Slelector.
     */
    private static final By DATE_PICKER = By.cssSelector("#ItemsToAutomate > p:nth-child(26) > img");
    private LazyWebElement datepicker = getLazyElement(DATE_PICKER);

    /*
     Date  Slelector.
     */
    private static final By DATE = By.cssSelector("#ui-datepicker-div > table > tbody > tr:nth-child(3) > td:nth-child(5) > a");
    private LazyWebElement date = getLazyElement(DATE);

    /*
     Selected Date  Slelector.
     */
    private static final By DATE_SELECTED = By.xpath("//*[@id='datepicker']");
    private LazyWebElement dates = getLazyElement(DATE_SELECTED);


    /*
     Slide Bar  Slelector.
     */
    private static final By SLIDE_BAR = By.xpath("//*[@id='slider']/span");
    private LazyWebElement slidebar = getLazyElement(SLIDE_BAR);

    /*
         Check Box 1  Slelector.
         */
    private static final By CHECK_BOX1 = By.cssSelector("#Checkbox1");
    private LazyWebElement checkbox1 = getLazyElement(CHECK_BOX1);

    /*
         Check Box 2  Slelector.
         */
    private static final By CHECK_BOX2 = By.cssSelector("#Checkbox2");
    private LazyWebElement checkbox2 = getLazyElement(CHECK_BOX2);

    /*
        Radio Button2  Slelector.
        */
    private static final By RADIO_BUTTON2 = By.xpath("//*[@id='FemaleRadio']");
    private LazyWebElement radiobtn2 = getLazyElement(RADIO_BUTTON2);

    /*
        Radio Button2  Slelector.
        */
    private static final By RADIO_BUTTON1 = By.xpath("//*[@id='MaleRadio']");
    private LazyWebElement radiobtn1 = getLazyElement(RADIO_BUTTON1);

    /*
        Name Drop Down  Slelector.
        */
    private static final By NAME_DROPDOWN = By.cssSelector("#namesDropdown");
    private LazyWebElement name = getLazyElement(NAME_DROPDOWN);

    /*
       First Name  Slelector.
       */
    private static final By FIRST_NAME = By.xpath("//*[@id='TextFields']/p[1]/input");
    private LazyWebElement firstname = getLazyElement(FIRST_NAME);

    /*
       First Name  Slelector.
       */
    private static final By LAST_NAME = By.xpath("//*[@id='TextFields']/p[2]/input");
    private LazyWebElement lastname = getLazyElement(LAST_NAME);

    /*
       Upload Photo  Slelector.
       */
    private static final By UPLOAD_PHOTO = By.xpath("//*[@id='photo']");
    private LazyWebElement uploadphoto = getLazyElement(UPLOAD_PHOTO);

    /*
       Computer Parts  Slelector.
       */
    private static final By COMPUTER_PARTS = By.xpath("//*[@id='computerParts']/option[6]");
    private LazyWebElement computerparts = getLazyElement(COMPUTER_PARTS);

    /*
       Context Menu Box  Slelector.
       */
    private static final By CONTEXT_MENU_BOX = By.xpath("//*[@id=\'rightclickmenu\']");
    private LazyWebElement context = getLazyElement(CONTEXT_MENU_BOX);

    /*
      Clothing Table  Slelector.
      */
    private static final By CLOTHING_TABLE = By.xpath("//*[@id='FoodTable']/tbody/tr[2]/td[1]");
    private LazyWebElement clothingtable = getLazyElement(CONTEXT_MENU_BOX);





    public void clickOnErrorLink() throws InterruptedException, TimeoutException, ExecutionFailedException {
        UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(ERROR_LINK).click();
    }

    /**
     * Instantiates a new Home page model.
     *
     * @param testObject the test object
     */
    public MagenicAutoHomeModel(SeleniumTestObject testObject) {
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

        return UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(ERROR_LINK).isDisplayed()
                && UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(ASYNC_LINK).isDisplayed()
                && UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(SWAGGER_API).isDisplayed();


    }

    public void clickOnAsncLink() {
        UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(ASYNC_LINK).click();

    }

    public void clickOnSwaggerApiLink() {
        UIWaitFactory.getWaitDriver(getWebDriver()).waitForClickableElement(SWAGGER_API).click();


    }

    public void clickOnShowDailogLink() {
        UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(SHOW_DIALOG).click();

    }


    public void clickOnShowDailogLink2() {
        UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(SHOW_DIALOG2).click();

    }

    public void clickOnJavascriptAllertLink() {
        UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(JAVASCRIPT_ALERT).click();

    }

    public void clickOnJAlertWithConfirmLink() {
        UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(ALERT_WITH_CONFIRM).click();

    }

    public void clickOnBootstrapModalLink() {
        UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(BOOTSTRAP_MODAL).click();

    }

    //Not Working As. Working on Single Class but not on framework.
//    public void dragAndDropSourche(){
//
//        Actions act = new Actions(getWebDriver());
//             act.clickAndHold((WebElement) DRAG_AND_DROP_SOURCE)
//                .moveToElement((WebElement) DRAG_AND_DROP_TARGET)
//                .release()
//                .build()
//                .perform();
//
//
//    }
    public void dragAndDropSourcToTarget() throws InterruptedException {
        Actions act = new Actions(getWebDriver());
//        act.clickAndHold( DRAG_AND_DROP_SOURCE4)
//                .moveToElement((WebElement) DRAG_AND_DROP_TARGET4)
//                .release();

//        act.build()
//                .perform();
//
act.dragAndDrop(getWebDriver().findElement(DRAG_AND_DROP_SOURCE),getWebDriver().findElement(DRAG_AND_DROP_TARGET)).perform();



    }
/*
Action Class is not working, Need Help
 */
    public void dragAndDropSourcToNewTarget() throws InterruptedException {
        Actions act = new Actions(getWebDriver());
        act.clickAndHold((WebElement) DRAG_AND_DROP_TARGET4)
                .moveToElement((WebElement) DRAG_AND_DROP_NEWTARGET4)
                .release();

        act.build()
                .perform();

    }

    public void clickDatePicker() {
        UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(DATE_PICKER).click();
        UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(DATE).click();
    }

    public String getSelectedDate() {
        return UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(DATE_SELECTED).getText();
    }

    public void clickSlideBar() {
        UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(SLIDE_BAR).click();

    }

    public void setCheckBox1() {
        UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(CHECK_BOX1).click();

    }

    public Boolean vaCheckBox1() {
        return UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(CHECK_BOX1).isSelected();
    }

    public void setCheckBox2() {
        UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(CHECK_BOX2).click();

    }

    public Boolean vaCheckBox2() {
        return UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(CHECK_BOX2).isSelected();
    }

    public void setRadioButton2() {
        UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(RADIO_BUTTON2).click();

    }

    public Boolean vaRadioButton2() {
        return UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(RADIO_BUTTON2).isSelected();
    }

    public void setRadiobtn1() {
        UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(RADIO_BUTTON1).click();

    }

    public Boolean vaRadioButton1() {
        return UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(RADIO_BUTTON1).isSelected();
    }

    /*
    Select Class not working.
     */
    public void selectName() {
        selectValueFromDropDown((WebElement) NAME_DROPDOWN, "Jack");
    }

    /*
    Select Class not working, Need Help.
     */
    public static void selectValueFromDropDown(WebElement element, String value) {
        Select select = new Select(element);
        select.selectByVisibleText(value);

    }

    public void inputFirstName() throws InterruptedException, TimeoutException, ExecutionFailedException {
        firstname.sendKeys("John");
        //UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(RADIO_BUTTON1).click();

    }

    public void inputLastName() throws InterruptedException, TimeoutException, ExecutionFailedException {

        UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(LAST_NAME).sendKeys("Roberts");

    }

    public void setUploadPhoto() throws InterruptedException, TimeoutException, ExecutionFailedException {

        UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(UPLOAD_PHOTO).sendKeys("C:\\Users\\MohammodH\\OneDrive - Magenic\\Desktop\\Magenic-Logo.png");

    }

    public void setComputerParts() throws InterruptedException, TimeoutException, ExecutionFailedException {

        UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(COMPUTER_PARTS).click();


    }

    public String getComputurePartsText() {
        return UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(COMPUTER_PARTS).getText();
    }

    public Boolean vaComputerParts() {
        return UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(COMPUTER_PARTS).isSelected();
    }

    public void setContextMenuBox() throws InterruptedException {
        Actions act = new Actions(getWebDriver());
        act.contextClick((WebElement) CONTEXT_MENU_BOX);
        act.build()
                .perform();

    }

    public String getClothingTableText() {
        return UIWaitFactory.getWaitDriver(getWebDriver()).waitForVisibleElement(CLOTHING_TABLE).getText();
    }
}









