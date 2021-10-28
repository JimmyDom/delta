package com.delta.page;

import com.codeborne.selenide.SelenideElement;
import lombok.Data;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

@Data
public class MainPage {

    private final SelenideElement loginField = $(By.name("login"));
    private final SelenideElement passField = $(By.name("password"));
    private final SelenideElement comeIn = $(By.tagName("button"));
    private final SelenideElement searchAtmMenu = $(By.xpath("//div[text() = \"Найти АТМ\"]"));
}
