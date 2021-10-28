package com.delta.ui;

import com.delta.page.SearchAtm;
import com.delta.page.ViewAtm;
import com.delta.service.BasePageService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;



class RoleModelTest {
    BasePageService service = new BasePageService();
    SearchAtm searchAtm = new SearchAtm();
    ViewAtm viewAtm = new ViewAtm();


    @DisplayName("AAA-T9 Отображение деталей ATM для пользователя с правами ATM Logistic")
    @Test void loginTechUser() {
        service.loginUser("Logistic");
        service.clickButton(searchAtm.getSearchAtmMenu());
        service.clickButton(searchAtm.getSearchButton());
        service.clickButton(searchAtm.getDataRow1());

        service.clickButton(viewAtm.getInfoLink());
        service.isElementDisplayed(viewAtm.getAtmNumberField());
        service.clickButton(viewAtm.getMerchantLink());
        service.isElementDisplayed(viewAtm.getMakeRequestField());
        service.clickButton(viewAtm.getVendorLink());
        service.isElementDisplayed(viewAtm.getVendorField());
        service.clickButton(viewAtm.getAvailabilityLink());
        service.isElementDisplayed(viewAtm.getOrganizationAccessField());
        service.clickButton(viewAtm.getGeoDataLink());
        service.isElementDisplayed(viewAtm.getAddressField());
        service.clickButton(viewAtm.getBusinessLink());
        service.isElementDisplayed(viewAtm.getAtmBusinessTypeField());
        service.clickButton(viewAtm.getSecurityLink());
        service.isElementDisplayed(viewAtm.getPlacementCodeField());
        service.clickButton(viewAtm.getEncashLink());
        service.isElementDisplayed(viewAtm.getCurrencyField());

        service.isElementHidden(viewAtm.getLimitsLink());

    }
}

