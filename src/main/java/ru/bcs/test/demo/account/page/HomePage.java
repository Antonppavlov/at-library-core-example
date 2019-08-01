package ru.bcs.test.demo.account.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.bcs.at.library.core.cucumber.annotations.Name;
import ru.bcs.at.library.core.cucumber.annotations.Optional;
import ru.bcs.at.library.core.cucumber.api.CorePage;

@Name("Домашняя")
public class HomePage extends CorePage {

    @Optional
    @Name("iphone")
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"iphone\"]")
    private SelenideElement iphone;

    @Optional
    @Name("mouse")
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"mouse\"]")
    private SelenideElement mouse;

    @Optional
    @Name("ps4")
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"ps4\"]")
    private SelenideElement ps4;

    @Optional
    @Name("photo")
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"photo\"]")
    private SelenideElement photo;

    @Optional
    @Name("keyboard")
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"keyboard\"]")
    private SelenideElement keyboard;

    @Optional
    @Name("notebook")
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"notebook\"]\n")
    private SelenideElement notebook;

    @Optional
    @Name("money")
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"money\"]")
    private SelenideElement money;

    @Optional
    @Name("В корзину")
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"add_to_cart\"]")
    private SelenideElement add_to_cart;

    @Optional
    @Name("Купить")
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"buy_now_button\"]")
    private SelenideElement buy_now_button;

}

