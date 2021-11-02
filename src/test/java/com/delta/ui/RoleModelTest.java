package com.delta.ui;

import com.delta.config.Role;
import com.delta.page.SearchAtm;
import com.delta.page.ViewAtm;
import com.delta.service.BasePageService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


@DisplayName("UI проверка отображения вкладок для пользователей с разными ролями")
class RoleModelTest {
    BasePageService service = new BasePageService();
    SearchAtm searchAtm = new SearchAtm();
    ViewAtm viewAtm = new ViewAtm();


    @DisplayName("AAA-T9 Отображение деталей ATM для пользователя с правами ATM Logistic")
    @Test void checkAtmLogisticRole() {
        service.loginUser(Role.LOGISTIC);
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
        service.loginUser(Role.INCASSO);
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
        service.loginUser(Role.SECURITY);
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
        service.loginUser(Role.BUSINESS);
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
        service.loginUser(Role.TELECOM);
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
        service.loginUser(Role.READ_USER);
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
        service.loginUser(Role.TECH_SUPPORT);
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
        service.loginUser(Role.ADMIN);
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

