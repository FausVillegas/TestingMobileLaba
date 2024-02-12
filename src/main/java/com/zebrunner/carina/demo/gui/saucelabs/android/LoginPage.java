package com.zebrunner.carina.demo.gui.saucelabs.android;

import com.zebrunner.carina.demo.gui.saucelabs.common.LoginPageBase;
import com.zebrunner.carina.demo.gui.saucelabs.common.ProductsPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = LoginPageBase.class)
public class LoginPage extends LoginPageBase {
    @FindBy(xpath = "//android.widget.TextView[@text=\"standard_user\"]")
    private ExtendedWebElement standardUserBtn;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Username\"]")
    private ExtendedWebElement usernameInput;

    @FindBy(xpath = "//android.widget.EditText[@content-desc=\"test-Password\"]")
    private ExtendedWebElement passwordInput;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]")
    private ExtendedWebElement loginBtn;

    @FindBy(xpath = "//android.view.ViewGroup[@content-desc=\"test-Error message\"]")
    private ExtendedWebElement loginErrorMessage;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @Override
    public void typeName(String name) {
        usernameInput.type(name);
    }

    @Override
    public void typePassword(String password) {
        passwordInput.type(password);
    }

    @Override
    public ProductsPageBase clickLoginBtn() {
        loginBtn.click();
        return initPage(getDriver(), ProductsPageBase.class);
    }

    @Override
    public boolean isLoginErrorMessagePresent() {
        return loginErrorMessage.isElementPresent();
    }

    @Override
    public void clickStandardUserBtn() {
        standardUserBtn.click();
    }
}
