package com.automation.pages;

import com.automation.utils.PropertyReaderUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage extends BasePage{
    @FindBy(id = "user-name")
    WebElement userName;

    @FindBy(id = "password")
    WebElement passWord;

    @FindBy(id = "login-button")
    WebElement loginBtn;

    @FindBy(id= "react-burger-menu-btn")
    WebElement burgerBtn;

    @FindBy(id= "logout_sidebar_link")
    WebElement logOutBtn;


    public void openWebsite() {

        driver.get(PropertyReaderUtils.getProperty("url"));

    }

    public void doLogin() {
        userName.sendKeys(PropertyReaderUtils.getProperty("userName"));
        passWord.sendKeys(PropertyReaderUtils.getProperty("password"));
        loginBtn.click();

    }
    public void doLogout(){
    burgerBtn.click();
    logOutBtn.click();
    }

}

