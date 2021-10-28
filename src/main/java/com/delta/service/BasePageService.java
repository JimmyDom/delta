package com.delta.service;


import com.delta.config.Credential;
import com.delta.page.MainPage;

import static com.codeborne.selenide.Selenide.open;

public class BasePageService extends CommonService{
    private final Credential credential = new Credential();
    private final MainPage mainPage = new MainPage();

    private String getLogin(String user) {
        return credential.getUserCredential().get(String.format("%sLogin", user));
    }
    private String getPass(String user) {
        return credential.getUserCredential().get(String.format("%sPass", user));
    }

    public void loginUser(String user) {
        open(credential.getUrl());
        inputText(mainPage.getLoginField(), getLogin(user));
        inputText(mainPage.getPassField(), getPass(user));
        clickButton(mainPage.getComeIn());
    }
}
