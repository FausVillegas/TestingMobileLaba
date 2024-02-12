package com.zebrunner.carina.demo.gui.saucelabs.android;

import com.zebrunner.carina.demo.gui.saucelabs.common.LoginPageBase;
import com.zebrunner.carina.demo.gui.saucelabs.common.ProductsPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import org.openqa.selenium.WebDriver;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ProductsPageBase.class)
public class ProductsPage extends ProductsPageBase {
    public ProductsPage(WebDriver driver) {
        super(driver);
    }
}
