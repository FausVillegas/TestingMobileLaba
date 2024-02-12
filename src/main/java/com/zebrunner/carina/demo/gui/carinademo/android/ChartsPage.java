package com.zebrunner.carina.demo.gui.carinademo.android;

import com.zebrunner.carina.demo.gui.carinademo.common.ChartsPageBase;
import com.zebrunner.carina.demo.gui.carinademo.common.WebViewPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = ChartsPageBase.class)
public class ChartsPage extends ChartsPageBase {
    @FindBy(xpath = "//android.widget.TextView[@text=\"Charts\"]")
    private ExtendedWebElement chartsTitle;

    public ChartsPage(WebDriver driver) {
        super(driver);
    }
    @Override
    public boolean isChartsTitlePresent() {
        return chartsTitle.isElementPresent();
    }
}
