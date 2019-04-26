package ru.bcs.test.demo.account.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import ru.bcs.at.library.core.cucumber.annotations.Name;
import ru.bcs.at.library.core.cucumber.annotations.Optional;
import ru.bcs.at.library.core.cucumber.api.CorePage;

@Name("Домашняя")
public class HomePage extends CorePage {

    @Optional
    @Name("Яйцо 1")
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"egg\"])[1]")
    private SelenideElement egg;

    @Optional
    @Name("Яйцо 2")
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"egg\"])[2]")
    private SelenideElement egg2;

    @Optional
    @Name("Яйцо 3")
    @FindBy(xpath = "(//XCUIElementTypeButton[@name=\"egg\"])[3]")
    private SelenideElement egg3;

    @Optional
    @Name("Кнопка Старт")
    @FindBy(xpath = "//XCUIElementTypeButton[@name=\"start\"]")
    private SelenideElement buttonStart;

}
