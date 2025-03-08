package PageLocators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CreateCustomerLocators {

    //Add button
    @FindBy(xpath = "(//span[@class='mat-mdc-button-persistent-ripple mdc-icon-button__ripple']/following-sibling::mat-icon)[2]")
    public static WebElement addBtn;
    @FindBy(xpath = "(//label[contains(.,'Legal Name')]/following::input)[1]")
    public static WebElement legalName;
    @FindBy(xpath = "//input[@formcontrolname='tradeName']")
    public static WebElement tradeName;
    @FindBy(xpath = "(//label[contains(.,'GST No.')]/following::input)[1]")
    public static WebElement gstNo;
    @FindBy(xpath = "(//label[contains(.,'PAN No.')]/following::input)[1]")
    public static WebElement panNo;
    @FindBy(xpath = "//input[@formcontrolname='name']")
    public static WebElement customername;
    @FindBy(xpath = "//input[@formcontrolname='address1']")
    public static WebElement customeraddress1;
    @FindBy(xpath = "//input[@formcontrolname='address2']")
    public static WebElement customeraddress2;
    @FindBy(xpath = "//*[contains(@id,'mat-select-value-2')]")
    public static WebElement country;

    @FindBy(xpath = "(//mat-option[@aria-selected='false'])")
    public static List<WebElement> countryList;
    @FindBy(xpath = "(//span[@class='mdc-list-item__primary-text'])")
    public static List<WebElement> state;
    @FindBy(xpath = "(//span[@class='mdc-list-item__primary-text'])")
    public static List<WebElement> city;
    @FindBy(xpath = "//input[@formcontrolname='pincode']")
    public static WebElement customerPincode;
    @FindBy(xpath = "//input[@formcontrolname='mobile']")
    public static WebElement mobile;
    @FindBy(xpath = "//input[@formcontrolname='alternateMobile']")
    public static WebElement alternateMobile;
    @FindBy(xpath = "///input[@type='email']")
    public static WebElement email;
    @FindBy(xpath = "//input[@formcontrolname='telephone']")
    public static WebElement telephone;
    @FindBy(xpath = "//input[@formcontrolname='fax']")
    public static WebElement fax;


    //Button
    @FindBy(xpath = "(//i[text()='add']/following-sibling::span)[3]")
    public static WebElement addBtnAddress;
    @FindBy(xpath = "(//*[contains(@class,'mdc-button__label')])[2]")
    public static WebElement nextBtn;
    @FindBy(xpath = "(//span[text()='Save']/following-sibling::span)[2]")
    public static WebElement saveBtn;

    @FindBy(xpath = "(//button[@id='hasGst-button']//span)[1]")
    public static WebElement gstBtn;


}
