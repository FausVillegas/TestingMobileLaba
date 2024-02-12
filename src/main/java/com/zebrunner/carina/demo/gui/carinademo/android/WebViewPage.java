package com.zebrunner.carina.demo.gui.carinademo.android;

import com.itextpdf.text.pdf.parser.clipper.Clipper;
import com.zebrunner.carina.demo.gui.carinademo.common.WebViewPageBase;
import com.zebrunner.carina.utils.factory.DeviceType;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

@DeviceType(pageType = DeviceType.Type.ANDROID_PHONE, parentClass = WebViewPageBase.class)
public class WebViewPage extends WebViewPageBase {
    @FindBy(xpath = "//*[@content-desc=\"Navigate up\"]")
    private ExtendedWebElement navigateNavBtn;

    @FindBy(xpath = "//android.widget.TextView[@text=\"Lorem ipsum\"]")
    private ExtendedWebElement usernameNavTextView;

    @FindBy(id = "com.solvd.carinademoapplication:id/nav_view")
    private NavViewComponent navViewComponent;

    public WebViewPage(WebDriver driver) {
        super(driver);
    }
    @Override
    public void clickNavigateBtn() {
        navigateNavBtn.click();
    }

    @Override
    public boolean usernameTextViewIsPresent(){
        return usernameNavTextView.isElementPresent();
    }

    @Override
    public NavViewComponent getNavViewComponent() {
        return navViewComponent;
    }
}
