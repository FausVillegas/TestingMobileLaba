package com.zebrunner.carina.demo.gui.carinademo.common;

import com.zebrunner.carina.utils.factory.ICustomTypePageFactory;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public abstract class NavViewComponentBase extends AbstractUIObject implements ICustomTypePageFactory {
    
    public NavViewComponentBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }

    public abstract ChartsPageBase clickChartsBtn();
}
