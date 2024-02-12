package com.zebrunner.carina.demo.gui.carinademo.android;

import com.zebrunner.carina.demo.gui.carinademo.common.ComponentBase;
import com.zebrunner.carina.demo.gui.carinademo.common.HomePageBase;
import com.zebrunner.carina.demo.gui.carinademo.common.LoginPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = HomePageBase.class)
public class AndroidHomePage extends HomePageBase {
    @FindBy(id = "next_button")
    private ExtendedWebElement nextBtn;

    public AndroidHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginPageBase clickNextBtn() {
        nextBtn.click();
        return initPage(LoginPageBase.class);
    }
}
