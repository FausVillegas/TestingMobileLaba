package com.zebrunner.carina.demo.gui.carinademo.common;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public abstract class ChartsPageBase extends AbstractPage {
    public ChartsPageBase(WebDriver driver) {
        super(driver);
    }

    public abstract boolean isChartsTitlePresent();
}
