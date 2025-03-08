package BusinessLogic;

import PageLocators.CreateCustomerLocators;
import PageLocators.LandingPage;
import PageLocators.LoginPage;
import Utillity.HelperFunction;
import Utillity.WebDriverFactory;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Base64;
import java.util.Properties;

import static Utillity.HelperFunction.*;

public class EWayLoginScreen {
    private static final Logger logger = LogManager.getLogger(EWayLoginScreen.class.getName());
    public static String userName;
    public static String password;
    public static EWayLoginScreen INSTANCE = new EWayLoginScreen();
    static Properties prop = new Properties();

    public static EWayLoginScreen getInstance() {
        return INSTANCE;
    }

    public static void userInfo() throws IOException {
        String filename = "src/test/resources/UserCred.properties";
        HelperFunction.class.getClassLoader().getResourceAsStream(filename);
        System.out.println(filename);
        prop.load(new FileInputStream(filename));
        userName = prop.getProperty("userName");
        password = prop.getProperty("password");

    }

    public static void loginScreen() throws IOException {
        userInfo();
        Base64.Decoder decoder = Base64.getDecoder();
        String dpassword = new String(decoder.decode(password));
        PageFactory.initElements(WebDriverFactory.driver, LoginPage.class);
        if (LoginPage.email.isDisplayed()) {
            LoginPage.email.clear();

            LoginPage.email.sendKeys(userName);
        }
        if (LoginPage.email.isDisplayed()) {
            LoginPage.password.clear();

            LoginPage.password.sendKeys(dpassword);
        }
        LoginPage.login.click();
        logger.info("Login successfull... ");

        HelperFunction.takeScreenshot();
        waitForPageToLoad(WebDriverFactory.driver, Duration.ofSeconds(70));

    }

    public static void landingPageVerify() {

        PageFactory.initElements(WebDriverFactory.driver, LandingPage.class);
        Assert.assertEquals(LandingPage.customer.getText(), "Customer");
        logger.debug(LandingPage.customer.getText(), "Notified in the Eway Landing page");

    }

    public static void verifyCustomer(String customer) {
        PageFactory.initElements(WebDriverFactory.driver, LandingPage.class);
        Assert.assertEquals(LandingPage.customer.getText(), customer, "Verified");
        logger.debug(LandingPage.customer.getText(), "Customer menu is avail");
        highlightElement(WebDriverFactory.driver, LandingPage.customer);
        LandingPage.customer.click();
        takeScreenshot();

    }

    public static void customerOnboardcreate() {
        PageFactory.initElements(WebDriverFactory.driver, CreateCustomerLocators.class);
        if (CreateCustomerLocators.addBtn.isDisplayed()) {
            CreateCustomerLocators.addBtn.click();
            logger.debug(CreateCustomerLocators.addBtn.isDisplayed());
            takeScreenshot();
            waitForPageToLoad(WebDriverFactory.driver, Duration.ofSeconds(70));

        }
    }

    public static void addCutomInfo(String isGst, String leagalName, String tradeName, String gstNo, String panNo) {
        PageFactory.initElements(WebDriverFactory.driver, CreateCustomerLocators.class);
        if (isGst.equals("Yes")) {
            CreateCustomerLocators.gstBtn.click();
            logger.debug("For the customer GST is enabled..");

        }
        if ((leagalName != null) && (tradeName != null)) {
            CreateCustomerLocators.legalName.sendKeys(leagalName);
            CreateCustomerLocators.tradeName.sendKeys(tradeName);


        }
        if (isGst.equals("Yes")) {
            CreateCustomerLocators.gstNo.isEnabled();
            CreateCustomerLocators.gstNo.sendKeys(gstNo);

        }
        if (panNo != null) {
            CreateCustomerLocators.panNo.sendKeys(panNo);

        }
        takeScreenshot();
    }

    public static void next(String next) {
        PageFactory.initElements(WebDriverFactory.driver, CreateCustomerLocators.class);
        if (CreateCustomerLocators.nextBtn.isEnabled()) {
            CreateCustomerLocators.nextBtn.click();
            logger.debug("User clicked next button ");

        }
    }

    public static void addcustomerAddress(String name, String addL1, String addL2, String country, String state, String city, String pincode) {
        PageFactory.initElements(WebDriverFactory.driver, CreateCustomerLocators.class);
if((name!=null)&&addL1!=null)
{
    CreateCustomerLocators.customername.sendKeys(name);
    CreateCustomerLocators.customeraddress1.sendKeys(addL1);
    CreateCustomerLocators.customeraddress2.sendKeys(addL2);
    logger.debug(name,addL1,addL2,"User entered successfully..");
}
if((country!=null)&&state!=null &&city!=null)
{
    CreateCustomerLocators.country.click();
    HelperFunction.selectByVisibleText(CreateCustomerLocators.country,country);
HelperFunction.listWebelement(CreateCustomerLocators.countryList,country);
}
    }
}
