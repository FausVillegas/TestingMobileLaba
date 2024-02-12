package com.zebrunner.carina.demo;

import com.zebrunner.carina.core.IAbstractTest;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.demo.gui.saucelabs.common.LoginPageBase;
import com.zebrunner.carina.demo.gui.saucelabs.common.ProductsPageBase;
import com.zebrunner.carina.utils.mobile.IMobileUtils;
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class MobileSaucelabsTest implements IAbstractTest, IMobileUtils {
    @Test
    @MethodOwner(owner = "fausvillegas")
    public void testLoginUser() {

        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        assertTrue(loginPage.isPageOpened(), "Login page isn't opened");
//        String username = "standard_user";
//        String password = "secret_sauce";
//        loginPage.typeName(username);
//        loginPage.typePassword(password);
        loginPage.clickStandardUserBtn();
        ProductsPageBase productsPage = loginPage.clickLoginBtn();
        assertTrue(productsPage.isPageOpened(), "Products page isn't opened");
    }

    @Test
    @MethodOwner(owner = "fausvillegas")
    public void testWrongLoginUser() {
        String username = "wrong_user";
        String password = "wrong_pass";
        LoginPageBase loginPage = initPage(getDriver(), LoginPageBase.class);
        assertTrue(loginPage.isPageOpened(), "Login page isn't opened");
        loginPage.typeName(username);
        loginPage.typePassword(password);
        loginPage.clickLoginBtn();
        assertTrue(loginPage.isLoginErrorMessagePresent(), "Login was successful");
    }
}
