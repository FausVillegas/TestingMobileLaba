package com.zebrunner.carina.demo;

import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.demo.gui.carinademo.android.ChartsPage;
import com.zebrunner.carina.demo.gui.carinademo.android.HomePage;
import com.zebrunner.carina.demo.gui.carinademo.common.ChartsPageBase;
import com.zebrunner.carina.demo.gui.carinademo.common.HomePageBase;
import com.zebrunner.carina.demo.gui.carinademo.common.LoginPageBase;
import com.zebrunner.carina.demo.gui.carinademo.common.WebViewPageBase;
import com.zebrunner.carina.demo.mobile.gui.pages.common.CarinaDescriptionPageBase;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;


public class MobileCarinaExampleTest implements IAbstractTest, IMobileUtils {

    @Test()
    @MethodOwner(owner = "fausvillegas")
    public void testNavView() {
        HomePageBase homePageBase = initPage(getDriver(), HomePageBase.class);
        LoginPageBase loginPage = homePageBase.clickNextBtn();
        loginPage.login();
        WebViewPageBase webViewPageBase = initPage(getDriver(), WebViewPageBase.class);
        webViewPageBase.clickNavigateBtn();
        assertTrue(webViewPageBase.usernameTextViewIsPresent(),"The nav view isn't present");
    }

    @Test()
    @MethodOwner(owner = "fausvillegas")
    public void testChartsPage() {
        HomePageBase homePageBase = initPage(getDriver(), HomePageBase.class);
        LoginPageBase loginPage = homePageBase.clickNextBtn();
        loginPage.login();
        WebViewPageBase webViewPage = initPage(getDriver(), WebViewPageBase.class);
        webViewPage.clickNavigateBtn();
        ChartsPageBase chartsPage = webViewPage.getNavViewComponent().clickChartsBtn();
        assertTrue(chartsPage.isChartsTitlePresent(),"ChartsPage isn't open");
    }
}
