package com.zebrunner.carina.demo.gui.carinademo.android;

import com.zebrunner.carina.demo.gui.carinademo.common.ChartsPageBase;
import com.zebrunner.carina.demo.gui.carinademo.common.NavViewComponentBase;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import net.bytebuddy.agent.builder.AgentBuilder;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class NavViewComponent extends NavViewComponentBase {

    @FindBy(xpath = "//android.widget.CheckedTextView[@text='Charts']")
    private ExtendedWebElement chartsBtn;

    public NavViewComponent(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    @Override
    public ChartsPageBase clickChartsBtn() {
        chartsBtn.click();
        return initPage(getDriver(), ChartsPageBase.class);
    }
}
