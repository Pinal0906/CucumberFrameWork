package com.automation.pages;

import com.automation.utils.PropertyReaderUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class CartPage extends BasePage {
    @FindBy(id = "user-name")
    WebElement userName;

    @FindBy(id = "password")
    WebElement passWord;

    @FindBy(id = "login-button")
    WebElement loginBtn;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCart;

    @FindBy(className = "shopping_cart_link")
    WebElement cartIcon;

    @FindBy(xpath = "//span[@class=\"title\" and text()=\"Your Cart\"]")
    WebElement cartPageLogo;

    @FindBy(xpath = "//div[@class=\"inventory_item_name\"]")
    WebElement cartItem;

    @FindBy(id= "checkout")
    WebElement checkOut;

    @FindBy(xpath = "//div[@class=\"inventory_item_name\"]")
    List<WebElement> listOfTitleOnCartPage;


    public void openWebsite() {

        driver.get(PropertyReaderUtils.getProperty("url"));

    }

    public void doLogin() {
        userName.sendKeys(PropertyReaderUtils.getProperty("userName"));
        passWord.sendKeys(PropertyReaderUtils.getProperty("password"));
        loginBtn.click();
    }

    public void verifyHomePage() {
        HomePage homePage = new HomePage();
        homePage.verifyHomePage();

    }

    public void addToCart() {
        addToCart.click();
        cartIcon.click();
    }

    public void verifyUserIsOnCartPage() {
        Assert.assertTrue(cartPageLogo.isDisplayed(), "You are not on the cart page");
        Assert.assertTrue(cartItem.isDisplayed(), "The item is not added to the cart");
        }

    public void verifyProductDetail() {

        HomePage homepage = new HomePage();

        String titleOnCartPage = listOfTitleOnCartPage.get(0).getText();
        System.out.println(homepage.titleOnHomePage);
        System.out.println("titleOnCartPage = " + titleOnCartPage);

        Assert.assertEquals(titleOnCartPage,homepage.titleOnHomePage, "The item is not same");


    }
public void verifyUserClicksOnCheckOutBtn(){
        checkOut.click();
    }
}
