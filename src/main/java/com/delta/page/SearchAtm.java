package com.delta.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class SearchAtm extends MainPage {
    private final SelenideElement searchButton = $(By.xpath("//button/span[text() = \"Найти\"]"));
    private final SelenideElement dataRow1 = $(By.xpath("//tr[@data-row=1]"));

    public SelenideElement getSearchButton() {
        return searchButton;
    }

    public SelenideElement getDataRow1() {
        return dataRow1;
    }
}
