package com.automation.pages;

import com.automation.utils.PropertyReaderUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{
    @FindBy(id = "user-name")
    WebElement userName;

    @FindBy(id = "password")
    WebElement passWord;

    @FindBy(id = "login-button")
    WebElement loginBtn;


    public void openWebsite() {

        driver.get(PropertyReaderUtils.getProperty("url"));

    }

    public void doLogin() {
        userName.sendKeys(PropertyReaderUtils.getProperty("userName"));
        passWord.sendKeys(PropertyReaderUtils.getProperty("password"));
        loginBtn.click();

    }

}

