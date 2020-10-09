package org.example.test;

import com.magenic.jmaqs.selenium.BaseSeleniumTest;
import com.magenic.jmaqs.utilities.helper.exceptions.ExecutionFailedException;
import com.magenic.jmaqs.utilities.helper.exceptions.TimeoutException;
import org.example.pagemodels.*;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import sun.awt.windows.ThemeReader;

public class MagenicAutoHomeModelTest extends BaseSeleniumTest {

    //@Test (priority = 1)
    public void errorTextTest() throws InterruptedException, TimeoutException, ExecutionFailedException {
        MagenicAutoHomeModel page = new MagenicAutoHomeModel(this.getTestObject());
        page.openLoginPage();
        page.clickOnErrorLink();
        ErrorPageModel error = new ErrorPageModel(this.getTestObject());
        String expected = "No error this time";
        String actual = error.getErrorText();
        Assert.assertEquals(actual, expected, "Verify the error text message");
    }

    @Test(priority = 1)
    public void asyncPageTest() throws InterruptedException, TimeoutException, ExecutionFailedException {
        MagenicAutoHomeModel page = new MagenicAutoHomeModel(this.getTestObject());
        page.openLoginPage();
        page.clickOnAsncLink();
        AsyncPageModel async = new AsyncPageModel(this.getTestObject());
        String actual = async.getLoadedText();
        String expected = "Loaded";
        System.out.println("Expected: " + expected);
        System.out.println("Actual :" + actual);
        Assert.assertEquals(actual, expected, "Verify the Loaded text present");
    }

    @Test(priority = 2)
    public void swaggerApiTest() throws InterruptedException, TimeoutException, ExecutionFailedException {
        MagenicAutoHomeModel page = new MagenicAutoHomeModel(this.getTestObject());
        page.openLoginPage();
        page.clickOnSwaggerApiLink();
        Thread.sleep(5000);
        SwaggerApiPageModel swaggerapi = new SwaggerApiPageModel(this.getTestObject());
        String actual = swaggerapi.getSwaggerApiPageText();
        String expected = "Magenic Automation Test Site API";
        System.out.println("Actual:" + actual);
        System.out.println("Expected :" + expected);
        Assert.assertEquals(actual, expected, "Verify The Magenic Automation Test Site API Text Present ");
    }

    @Test(priority = 3)
    public void showDailogTest() throws InterruptedException, TimeoutException, ExecutionFailedException {
        MagenicAutoHomeModel page = new MagenicAutoHomeModel(this.getTestObject());
        page.openLoginPage();
        page.clickOnShowDailogLink();
        ShowDailogPageModel showdailog = new ShowDailogPageModel(this.getTestObject());
        String actual = showdailog.getShowDailogText();
        String expected = "Close";
        System.out.println("Actual:" + actual);
        System.out.println("Expected:" + expected);
        Assert.assertEquals(actual, expected, "Verify the Close Button Present");
        showdailog.clickCloseButton();
    }

    @Test(priority = 4)
    public void showDailog2Test() throws InterruptedException, TimeoutException, ExecutionFailedException {
        MagenicAutoHomeModel page = new MagenicAutoHomeModel(this.getTestObject());
        page.openLoginPage();
        page.clickOnShowDailogLink2();
        ShowDailog2PageModel showdailog = new ShowDailog2PageModel(this.getTestObject());
        String actual = showdailog.getShowDailogText();
        String expected = "Download complete";
        System.out.println("Actual:" + actual);
        System.out.println("Expected:" + expected);
        Assert.assertEquals(actual, expected, "Verify the Close Button Present");
        showdailog.clickCloseButton();
    }

    @Test(priority = 5)
    public void javascriptAllertTest() throws InterruptedException, TimeoutException, ExecutionFailedException {
        MagenicAutoHomeModel page = new MagenicAutoHomeModel(this.getTestObject());
        page.openLoginPage();
        page.clickOnJavascriptAllertLink();
        Alert alert = getWebDriver().switchTo().alert();
        alert.accept();
    }

    @Test(priority = 6)
    public void alertWithConfirmTest() throws InterruptedException, TimeoutException, ExecutionFailedException {
        MagenicAutoHomeModel page = new MagenicAutoHomeModel(this.getTestObject());
        page.openLoginPage();
        page.clickOnJAlertWithConfirmLink();
        Alert alert = getWebDriver().switchTo().alert();
        alert.accept();
    }

    @Test(priority = 7)
    public void bootstrapTest() throws InterruptedException, TimeoutException, ExecutionFailedException {
        MagenicAutoHomeModel page = new MagenicAutoHomeModel(this.getTestObject());
        page.openLoginPage();
        page.clickOnBootstrapModalLink();
        BootStrapPageModel bootstrap = new BootStrapPageModel(this.getTestObject());
        String actual = bootstrap.getBootStrapText();
        String expected = "Modal title";
        System.out.println("Actual:" + actual);
        System.out.println("Expected:" + expected);
        Assert.assertEquals(actual, expected, "Verify the Close Button Present");
        bootstrap.clickBootStrapCloseButton();

    }

    // @Test(priority = 8)
    public void dragAndDropTest() throws InterruptedException {
        MagenicAutoHomeModel page = new MagenicAutoHomeModel(this.getTestObject());
        page.openLoginPage();
        page.dragAndDropSourcToTarget();

    }

    // @Test(priority = 9)
    public void dragAndNewDropTest() throws InterruptedException, TimeoutException, ExecutionFailedException {
        MagenicAutoHomeModel page = new MagenicAutoHomeModel(this.getTestObject());
        page.openLoginPage();
        page.dragAndDropSourcToTarget();
        page.dragAndDropSourcToNewTarget();
    }

    @Test(priority = 10)
    public void datePickerTest() throws InterruptedException, TimeoutException, ExecutionFailedException {
        MagenicAutoHomeModel page = new MagenicAutoHomeModel(this.getTestObject());
        page.openLoginPage();
        page.clickDatePicker();
        Thread.sleep(5000);
    }

    @Test(priority = 11)
    public void slideBarTest() throws InterruptedException, TimeoutException, ExecutionFailedException {
        MagenicAutoHomeModel page = new MagenicAutoHomeModel(this.getTestObject());
        page.openLoginPage();
        Thread.sleep(5000);
        page.clickSlideBar();
        Thread.sleep(5000);
    }

    @Test(priority = 12)
    public void checkBoxTest() throws InterruptedException, TimeoutException, ExecutionFailedException {
        MagenicAutoHomeModel page = new MagenicAutoHomeModel(this.getTestObject());
        page.openLoginPage();
        page.setCheckBox1();
        Thread.sleep(5000);
        Boolean cb = page.vaCheckBox1();
        System.out.println("Check Box 1 Selected: " + cb);
        page.setCheckBox1();
        Boolean cba = page.vaCheckBox1();
        System.out.println("Check Box 1 Selected After Second Click: " + cba);
        page.setCheckBox2();
        Thread.sleep(5000);
        Boolean cb2 = page.vaCheckBox2();
        System.out.println("Check Box 2 Selected: " + cb2);
        page.setCheckBox2();
        Boolean cba2 = page.vaCheckBox2();
        System.out.println("Check Box 2 Selected After Second Click: " + cba2);


    }

    @Test(priority = 13)
    public void radioButtonTest() throws InterruptedException, TimeoutException, ExecutionFailedException {
        MagenicAutoHomeModel page = new MagenicAutoHomeModel(this.getTestObject());
        page.openLoginPage();
        page.setRadioButton2();
        Thread.sleep(5000);
        Boolean rb2 = page.vaRadioButton2();
        System.out.println("Check Box 1 Selected: " + rb2);
        page.setRadioButton2();
        Boolean rba = page.vaRadioButton2();
        System.out.println("Check Box 1 Selected After Second Click: " + rba);
        page.setRadiobtn1();
        Thread.sleep(5000);
        Boolean rb1 = page.vaRadioButton1();
        System.out.println("Check Box 2 Selected: " + rb1);
        page.setRadiobtn1();
        Boolean rba1 = page.vaRadioButton1();
        System.out.println("Check Box 2 Selected After Second Click: " + rba1);

    }

    @Test(priority = 14)
    public void dorpDownNameTest() throws InterruptedException, TimeoutException, ExecutionFailedException {
        MagenicAutoHomeModel page = new MagenicAutoHomeModel(this.getTestObject());
        page.openLoginPage();
        page.selectName();
        Thread.sleep(5000);


    }

    @Test(priority = 15)
    public void firstNameTest() throws InterruptedException, TimeoutException, ExecutionFailedException {
        MagenicAutoHomeModel page = new MagenicAutoHomeModel(this.getTestObject());
        page.openLoginPage();
        page.inputFirstName();
        page.inputLastName();
        Thread.sleep(5000);
    }

    @Test(priority = 16)
    public void upLoadPhotoTest() throws InterruptedException, TimeoutException, ExecutionFailedException {
        MagenicAutoHomeModel page = new MagenicAutoHomeModel(this.getTestObject());
        page.openLoginPage();
        page.setUploadPhoto();

    }

    @Test(priority = 17)
    public void computerPartsTest() throws InterruptedException, TimeoutException, ExecutionFailedException {
        MagenicAutoHomeModel page = new MagenicAutoHomeModel(this.getTestObject());
        page.openLoginPage();
        page.setComputerParts();
        Thread.sleep(5000);
        String comparts = page.getComputurePartsText();
        System.out.println("Computer Parts : "+comparts);
        Boolean cps= page.vaComputerParts();
        System.out.println("Computer Parts Keyboard Selected: " + cps);

    }
    @Test(priority = 18)
    public void contextClickText() throws InterruptedException, TimeoutException, ExecutionFailedException {
        MagenicAutoHomeModel page = new MagenicAutoHomeModel(this.getTestObject());
        page.openLoginPage();
        page.setContextMenuBox();
        Thread.sleep(5000);


    }

    @Test(priority = 19)
    public void clothingTableTest() throws InterruptedException, TimeoutException, ExecutionFailedException {
        MagenicAutoHomeModel page = new MagenicAutoHomeModel(this.getTestObject());
        page.openLoginPage();
      String  clt =  page.getClothingTableText();

        System.out.println("Clothing Table Text: "+ clt);


    }


}