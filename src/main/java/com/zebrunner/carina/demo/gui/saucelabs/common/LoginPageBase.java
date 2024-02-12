package com.zebrunner.carina.demo.gui.saucelabs.common;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class LoginPageBase extends AbstractPage {
    public LoginPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract void typeName(String name);

    public abstract void typePassword(String password);

    public abstract ProductsPageBase clickLoginBtn();

    public abstract boolean isLoginErrorMessagePresent();

    public abstract void clickStandardUserBtn();
}
