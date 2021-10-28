package com.delta.page;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Data
public class ViewAtm extends MainPage {

    private final SelenideElement infoLink = $(By.xpath("//a[text() = \"Инфо\"]"));
    private final SelenideElement merchantLink = $(By.xpath("//a[text() = \"Мерчант\"]"));
    private final SelenideElement vendorLink = $(By.xpath("//a[text() = \"Вендоры\"]"));
    private final SelenideElement availabilityLink = $(By.xpath("//a[text() = \"Доступность\"]"));
    private final SelenideElement geoDataLink = $(By.xpath("//a[text() = \"Геоданные\"]"));
    private final SelenideElement businessLink = $(By.xpath("//a[text() = \"Бизнес\"]"));
    private final SelenideElement securityLink = $(By.xpath("//a[text() = \"Безопасность\"]"));
    private final SelenideElement encashLink = $(By.xpath("//a[text() = \"Инкассация\"]"));
    private final SelenideElement limitsLink = $(By.xpath("//a[text() = \"Лимиты\"]"));
    private final SelenideElement atmNumberField = $(By.xpath("//span[text() = \"Номер АТМ\"]"));
    private final SelenideElement makeRequestField = $(By.xpath("//span[text() = \"Заведение заявки\"]"));
    private final SelenideElement vendorField = $(By.xpath("//div[text() = \"Вендор\"]"));
    private final SelenideElement organizationAccessField = $(By.xpath("//span[text() = \"Организация доступов\"]"));
    private final SelenideElement addressField = $(By.xpath("//span[text() = \"Адрес\"]"));
    private final SelenideElement atmBusinessTypeField = $(By.xpath("//span[text() = \"АТМ бизнес-тип\"]"));
    private final SelenideElement placementCodeField = $(By.xpath("//span[text() = \"Код места размещения\"]"));
    private final SelenideElement currencyField = $(By.xpath("//span[text() = \"Валютность\"]"));

}
