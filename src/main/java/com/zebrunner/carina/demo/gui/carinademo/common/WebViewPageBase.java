package com.zebrunner.carina.demo.gui.carinademo.common;

import com.zebrunner.carina.demo.gui.carinademo.android.NavViewComponent;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public abstract class WebViewPageBase extends AbstractPage {
    public WebViewPageBase(WebDriver driver) {
        super(driver);
    }
    public abstract void clickNavigateBtn();
    public abstract boolean usernameTextViewIsPresent();
    public abstract NavViewComponent getNavViewComponent();
}
