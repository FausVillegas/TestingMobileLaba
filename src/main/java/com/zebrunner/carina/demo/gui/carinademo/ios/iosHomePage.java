package com.zebrunner.carina.demo.gui.carinademo.android;

import com.zebrunner.carina.demo.gui.carinademo.common.HomePageBase;
import com.zebrunner.carina.demo.gui.carinademo.common.LoginPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.IOS_PHONE, parentClass = HomePageBase.class)
public class iosHomePage extends HomePageBase {
    public iosHomePage(WebDriver driver) {
        super(driver);
    }

    @Override
    public LoginPageBase clickNextBtn() {
        throw new UnsupportedOperationException("Not implemented for iOS");
    }
}
