package tests;

import org.junit.jupiter.api.Test;
import pages.CartPage;
import pages.LoginPage;
import pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class AddToCartTest {

    @Test
    void  addProductToCartTest() {

        open("https://www.saucedemo.com/");

        String productName = "Sauce Labs Backpack";

        LoginPage loginPage = new LoginPage();

        MainPage mainPage =
                loginPage.login(
                        "standard_user",
                        "secret_sauce");

        mainPage.getProductByTitle(productName).addToCart();

        CartPage cartPage = mainPage.openCart();

        cartPage.shouldContainProduct(productName);
    }
}
