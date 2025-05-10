package com.automation.pages;

import com.automation.utils.DriverUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class BasePage {

    WebDriver driver = DriverUtils.getDriver();

    public BasePage(){
// this is very important we need to initialize all the element we mentioned in all pages
        PageFactory.initElements(driver,this);
    }
}
