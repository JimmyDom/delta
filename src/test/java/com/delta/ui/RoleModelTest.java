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
    @Test void checkAtmLogisticRole() {
        service.loginUser("Logistic");
        service.clickButton(searchAtm.getSearchAtmMenu());
        service.clickButton(searchAtm.getSearchButton());
        service.clickButton(searchAtm.getDataRow1());

        service.checkVisibleLinkPage(viewAtm.getInfoLink(), viewAtm.getAtmNumberField());
        service.checkVisibleLinkPage(viewAtm.getMerchantLink(), viewAtm.getMakeRequestField());
        service.checkVisibleLinkPage(viewAtm.getVendorLink(), viewAtm.getVendorField());
        service.checkVisibleLinkPage(viewAtm.getAvailabilityLink(), viewAtm.getOrganizationAccessField());
        service.checkVisibleLinkPage(viewAtm.getGeoDataLink(), viewAtm.getAddressField());
        service.checkVisibleLinkPage(viewAtm.getBusinessLink(), viewAtm.getAtmBusinessTypeField());
        service.checkVisibleLinkPage(viewAtm.getSecurityLink(), viewAtm.getPlacementCodeField());
        service.checkVisibleLinkPage(viewAtm.getEncashLink(), viewAtm.getCurrencyField());

        service.isElementHidden(viewAtm.getLimitsLink());
    }

    @DisplayName("AAA-T10 Отображение деталей ATM для пользователя с правами Incasso")
    @Test void checkAtmIncassoRole() {
        service.loginUser("Incasso");
        service.clickButton(searchAtm.getSearchAtmMenu());
        service.clickButton(searchAtm.getSearchButton());
        service.clickButton(searchAtm.getDataRow1());

        service.checkVisibleLinkPage(viewAtm.getInfoLink(), viewAtm.getAtmNumberField());
        service.checkVisibleLinkPage(viewAtm.getVendorLink(), viewAtm.getVendorField());
        service.checkVisibleLinkPage(viewAtm.getAvailabilityLink(), viewAtm.getOrganizationAccessField());
        service.checkVisibleLinkPage(viewAtm.getGeoDataLink(), viewAtm.getAddressField());
        service.checkVisibleLinkPage(viewAtm.getBusinessLink(), viewAtm.getAtmBusinessTypeField());
        service.checkVisibleLinkPage(viewAtm.getSecurityLink(), viewAtm.getPlacementCodeField());
        service.checkVisibleLinkPage(viewAtm.getEncashLink(), viewAtm.getCurrencyField());
        service.checkVisibleLinkPage(viewAtm.getLimitsLink(), viewAtm.getLimitsField());

        service.isElementHidden(viewAtm.getMerchantLink());
    }

    @DisplayName("AAA-T12 Отображение деталей ATM для пользователя с правами Security")
    @Test void checkAtmSecurityRole() {
        service.loginUser("Security");
        service.clickButton(searchAtm.getSearchAtmMenu());
        service.clickButton(searchAtm.getSearchButton());
        service.clickButton(searchAtm.getDataRow1());

        service.checkVisibleLinkPage(viewAtm.getInfoLink(), viewAtm.getAtmNumberField());
        service.checkVisibleLinkPage(viewAtm.getMerchantLink(), viewAtm.getMakeRequestField());
        service.checkVisibleLinkPage(viewAtm.getVendorLink(), viewAtm.getVendorField());
        service.checkVisibleLinkPage(viewAtm.getAvailabilityLink(), viewAtm.getOrganizationAccessField());
        service.checkVisibleLinkPage(viewAtm.getGeoDataLink(), viewAtm.getAddressField());
        service.checkVisibleLinkPage(viewAtm.getBusinessLink(), viewAtm.getAtmBusinessTypeField());
        service.checkVisibleLinkPage(viewAtm.getSecurityLink(), viewAtm.getPlacementCodeField());
        service.checkVisibleLinkPage(viewAtm.getEncashLink(), viewAtm.getCurrencyField());
        service.checkVisibleLinkPage(viewAtm.getLimitsLink(), viewAtm.getLimitsField());
    }

    @DisplayName("AAA-T13 Отображение деталей ATM для пользователя с правами Business")
    @Test void checkAtmBusinessRole() {
        service.loginUser("Business");
        service.clickButton(searchAtm.getSearchAtmMenu());
        service.clickButton(searchAtm.getSearchButton());
        service.clickButton(searchAtm.getDataRow1());

        service.checkVisibleLinkPage(viewAtm.getInfoLink(), viewAtm.getAtmNumberField());
        service.checkVisibleLinkPage(viewAtm.getVendorLink(), viewAtm.getVendorField());
        service.checkVisibleLinkPage(viewAtm.getAvailabilityLink(), viewAtm.getOrganizationAccessField());
        service.checkVisibleLinkPage(viewAtm.getGeoDataLink(), viewAtm.getAddressField());
        service.checkVisibleLinkPage(viewAtm.getBusinessLink(), viewAtm.getAtmBusinessTypeField());
        service.checkVisibleLinkPage(viewAtm.getSecurityLink(), viewAtm.getPlacementCodeField());
        service.checkVisibleLinkPage(viewAtm.getEncashLink(), viewAtm.getCurrencyField());

        service.isElementHidden(viewAtm.getMerchantLink());
        service.isElementHidden(viewAtm.getLimitsLink());
    }

    @DisplayName("AAA-T14 Отображение деталей ATM для пользователя с правами Telecom")
    @Test void checkAtmTelecomRole() {
        service.loginUser("Telecom");
        service.clickButton(searchAtm.getSearchAtmMenu());
        service.clickButton(searchAtm.getSearchButton());
        service.clickButton(searchAtm.getDataRow1());

        service.checkVisibleLinkPage(viewAtm.getInfoLink(), viewAtm.getAtmNumberField());
        service.checkVisibleLinkPage(viewAtm.getVendorLink(), viewAtm.getVendorField());
        service.checkVisibleLinkPage(viewAtm.getAvailabilityLink(), viewAtm.getOrganizationAccessField());
        service.checkVisibleLinkPage(viewAtm.getGeoDataLink(), viewAtm.getAddressField());
        service.checkVisibleLinkPage(viewAtm.getBusinessLink(), viewAtm.getAtmBusinessTypeField());

        service.isElementHidden(viewAtm.getMerchantLink());
        service.isElementHidden(viewAtm.getSecurityLink());
        service.isElementHidden(viewAtm.getEncashLink());
        service.isElementHidden(viewAtm.getLimitsLink());
    }

    @DisplayName("AAA-T15 Отображение деталей ATM для пользователя с правами Read User")
    @Test void checkAtmReadUserRole() {
        service.loginUser("ReadUser");
        service.clickButton(searchAtm.getSearchAtmMenu());
        service.clickButton(searchAtm.getSearchButton());
        service.clickButton(searchAtm.getDataRow1());

        service.checkVisibleLinkPage(viewAtm.getInfoLink(), viewAtm.getAtmNumberField());
        service.checkVisibleLinkPage(viewAtm.getAvailabilityLink(), viewAtm.getOrganizationAccessField());
        service.checkVisibleLinkPage(viewAtm.getGeoDataLink(), viewAtm.getAddressField());
        service.checkVisibleLinkPage(viewAtm.getBusinessLink(), viewAtm.getAtmBusinessTypeField());

        service.isElementHidden(viewAtm.getMerchantLink());
        service.isElementHidden(viewAtm.getVendorLink());
        service.isElementHidden(viewAtm.getSecurityLink());
        service.isElementHidden(viewAtm.getEncashLink());
        service.isElementHidden(viewAtm.getLimitsLink());
    }

    @DisplayName("AAA-T17 Отображение деталей ATM для пользователя с правами Technical support")
    @Test void checkAtmTechSupportRole() {
        service.loginUser("TechSupport");
        service.clickButton(searchAtm.getSearchAtmMenu());
        service.clickButton(searchAtm.getSearchButton());
        service.clickButton(searchAtm.getDataRow1());

        service.checkVisibleLinkPage(viewAtm.getInfoLink(), viewAtm.getAtmNumberField());
        service.checkVisibleLinkPage(viewAtm.getMerchantLink(), viewAtm.getMakeRequestField());
        service.checkVisibleLinkPage(viewAtm.getVendorLink(), viewAtm.getVendorField());
        service.checkVisibleLinkPage(viewAtm.getAvailabilityLink(), viewAtm.getOrganizationAccessField());
        service.checkVisibleLinkPage(viewAtm.getGeoDataLink(), viewAtm.getAddressField());
        service.checkVisibleLinkPage(viewAtm.getBusinessLink(), viewAtm.getAtmBusinessTypeField());
        service.checkVisibleLinkPage(viewAtm.getEncashLink(), viewAtm.getCurrencyField());

        service.isElementHidden(viewAtm.getSecurityLink());
        service.isElementHidden(viewAtm.getLimitsLink());
    }

    @DisplayName("AAA-T19 Отображение деталей ATM для пользователя с правами Administrator")
    @Test void checkAtmAdminRole() {
        service.loginUser("Admin");
        service.clickButton(searchAtm.getSearchAtmMenu());
        service.clickButton(searchAtm.getSearchButton());
        service.clickButton(searchAtm.getDataRow1());

        service.checkVisibleLinkPage(viewAtm.getInfoLink(), viewAtm.getAtmNumberField());
        service.checkVisibleLinkPage(viewAtm.getMerchantLink(), viewAtm.getMakeRequestField());
        service.checkVisibleLinkPage(viewAtm.getVendorLink(), viewAtm.getVendorField());
        service.checkVisibleLinkPage(viewAtm.getAvailabilityLink(), viewAtm.getOrganizationAccessField());
        service.checkVisibleLinkPage(viewAtm.getGeoDataLink(), viewAtm.getAddressField());
        service.checkVisibleLinkPage(viewAtm.getBusinessLink(), viewAtm.getAtmBusinessTypeField());
        service.checkVisibleLinkPage(viewAtm.getSecurityLink(), viewAtm.getPlacementCodeField());
        service.checkVisibleLinkPage(viewAtm.getEncashLink(), viewAtm.getCurrencyField());
        service.checkVisibleLinkPage(viewAtm.getLimitsLink(), viewAtm.getLimitsField());
    }
}

