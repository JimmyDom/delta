package com.delta.api;

import com.delta.config.Endpoint;
import com.delta.config.Role;
import com.delta.service.ApiService;
import io.restassured.response.ExtractableResponse;
import io.restassured.response.Response;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.util.Assert;

@DisplayName("/catalogs")
public class Catalogs {
    Endpoint point = new Endpoint();
    ApiService api = new ApiService();


    @DisplayName("Проверка /catalogs с правами ATM Logistic статус 200")
    @Test void checkCatalogLogisticStatus200() {
        api.checkStatusEndpoint(Role.LOGISTIC, point.getCATALOGS()).statusCode(200);
    }

    @DisplayName("Проверка /catalogs с правами ATM Incasso статус 200")
    @Test void checkCatalogIncassoStatus200() {
        api.checkStatusEndpoint(Role.INCASSO, point.getCATALOGS()).statusCode(200);
    }

    @DisplayName("Проверка /catalogs с правами ATM Security статус 200")
    @Test void checkCatalogSecurityStatus200() {
        api.checkStatusEndpoint(Role.SECURITY, point.getCATALOGS()).statusCode(200);
    }

    @DisplayName("Проверка /catalogs с правами ATM Business статус 200")
    @Test void checkCatalogBusinessStatus200() {
        api.checkStatusEndpoint(Role.BUSINESS, point.getCATALOGS()).statusCode(200);
    }

    @DisplayName("Проверка /catalogs с правами ATM Telecom статус 200")
    @Test void checkCatalogTelecomStatus200() {
        api.checkStatusEndpoint(Role.TELECOM, point.getCATALOGS()).statusCode(200);
    }

    @DisplayName("Проверка /catalogs с правами ATM ReadUser статус 200")
    @Test void checkCatalogReadUserStatus200() {
        api.checkStatusEndpoint(Role.READ_USER, point.getCATALOGS()).statusCode(200);
    }

    @DisplayName("Проверка /catalogs с правами ATM TechSupport статус 200")
    @Test void checkCatalogTechSupportStatus200() {
        api.checkStatusEndpoint(Role.TECH_SUPPORT, point.getCATALOGS()).statusCode(200);
    }

    @DisplayName("Проверка /catalogs с правами ATM Admin статус 200")
    @Test void checkCatalogAdminStatus200() {
        api.checkStatusEndpoint(Role.ADMIN, point.getCATALOGS()).statusCode(200);
    }

    @DisplayName("Проверка Token с несуществующими параметрами")
    @Test void checkTokenStatus400() {
        api.checkGetToken("Test", "Test").statusCode(400);
        ExtractableResponse<Response> request = api.checkGetToken("Test", "Test").extract();
        Assert.isTrue(request.path("error").toString().equals("invalid_grant"),
                "Сообщение об ошибке не содержит invalid_grant");
    }
}
