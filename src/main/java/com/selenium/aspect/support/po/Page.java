package com.selenium.aspect.support.po;

import com.selenium.aspect.support.annotation.Click;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page {

    @FindBy(id = "menu-item-40489")
    private WebElement search;

    public Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @Click
    public void clickOnSearch() {
        search.click();
    }
}
