package ru.bcs.test.demo.account.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.bcs.at.library.core.cucumber.annotations.Name;
import ru.bcs.at.library.core.cucumber.annotations.Optional;
import ru.bcs.at.library.core.cucumber.api.CorePage;

@Name("Покупки")
public class BuyPage extends CorePage {

    @Optional
    @Name("money")
    @FindBy(xpath = "//XCUIElementTypeStaticText[@name=\"money\"]")
    private SelenideElement money;

    @Optional
    @Name("Назад")
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"button_back\"]")
    private SelenideElement button_back;

}
