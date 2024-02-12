package com.zebrunner.carina.demo.gui.carinademo.common;

import com.zebrunner.carina.webdriver.gui.AbstractUIObject;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class NavViewComponentBase extends AbstractUIObject {
    
    public NavViewComponentBase(WebDriver driver, SearchContext searchContext) {
        super(driver, searchContext);
    }
}
