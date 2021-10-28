package com.delta.service;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class CommonService {

    public void clickButton(SelenideElement element) {
        element.click();
    }

    public void inputText(SelenideElement element, String text) {
        element.val(text);
    }

    public void isElementDisplayed(SelenideElement element) {
        element.shouldHave(Condition.visible);
    }

    public void isElementHidden(SelenideElement element) {
        element.shouldHave(Condition.hidden);
    }
}
