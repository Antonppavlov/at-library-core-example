package ru.bcs.test.demo.account.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.bcs.at.library.core.cucumber.annotations.Name;
import ru.bcs.at.library.core.cucumber.annotations.Optional;
import ru.bcs.at.library.core.cucumber.api.CorePage;

@Name("Корзина")
public class AddToCardPage extends CorePage {

    @Optional
    @Name("money")
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"money\"]")
    private SelenideElement money;

    @Optional
    @Name("button_back")
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"button_back\"]")
    private SelenideElement button_back;

    @Optional
    @Name("buy_it_here")
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"buy_it_here\"]")
    private SelenideElement buy_it_here;

}
