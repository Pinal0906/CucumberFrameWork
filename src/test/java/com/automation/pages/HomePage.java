package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

public class HomePage extends BasePage{

    @FindBy(className = "title")
    WebElement productLable;

    @FindBy(xpath = "//div[@class=\"inventory_item_name \"]")
    List<WebElement> listOfTitleOnHomePage;

    @FindBy(id = "add-to-cart-sauce-labs-backpack")
    WebElement addToCart;

    @FindBy(className = "shopping_cart_link")
    WebElement cartIcon;

    String titleOnHomePage;

    public void verifyHomePage(){

        Assert.assertTrue(productLable.isDisplayed(), "You are not on HomePage");
    }

    public String getProductTile()
    {
        titleOnHomePage = listOfTitleOnHomePage.get(0).getText();
        System.out.println("titleOnHomePage = " + titleOnHomePage);
        return titleOnHomePage;
    }
    public void addToCart() {
        addToCart.click();
    }
    public void clickCartIcon(){
        cartIcon.click();
    }

}
