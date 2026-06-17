package pages;

import static com.codeborne.selenide.Selenide.$;

public class BasePage {

    public CartPage openCart() {
        $(".shopping_cart_link").click();
        return new CartPage();
    }
}
