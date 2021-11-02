package com.delta.service;


import com.codeborne.selenide.SelenideElement;
import com.delta.config.Credential;
import com.delta.config.Role;
import com.delta.page.MainPage;

import static com.codeborne.selenide.Selenide.*;

public class BasePageService extends CommonService{
    private final Credential credential = new Credential();
    private final MainPage mainPage = new MainPage();

    private String getLogin(Role role) {
        return credential.getUserCredential().get(role + "_LOGIN");
    }
    private String getPass(Role role) {
        return credential.getUserCredential().get(role + "_PASS");
    }

    public void loginUser(Role user) {
        open(credential.getUrl());
        localStorage().clear();
        refresh();
        inputText(mainPage.getLoginField(), getLogin(user));
        inputText(mainPage.getPassField(), getPass(user));
        clickButton(mainPage.getComeIn());
    }

    public void checkVisibleLinkPage(SelenideElement button, SelenideElement elementPage) {
        clickButton(button);
        isElementDisplayed(elementPage);
    }
}
