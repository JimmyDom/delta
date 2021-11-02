package com.delta.api;

import com.delta.config.Endpoint;
import com.delta.config.Role;
import com.delta.service.ApiService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("/api/atms")
public class Atms {
    Endpoint point = new Endpoint();
    ApiService api = new ApiService();

    @DisplayName("Проверка /atms с правами ATM Logistic статус 200")
    @Test
    void checkGetAtmLogisticStatus200() {
        api.checkStatusEndpoint(Role.LOGISTIC, point.getATMS() + "/1").statusCode(200);
    }

    @DisplayName("Проверка /atms с правами ATM Incasso статус 200")
    @Test void checkGetAtmIncassoStatus200() {
        api.checkStatusEndpoint(Role.INCASSO, point.getATMS() + "/1").statusCode(200);
    }

    @DisplayName("Проверка /atms с правами ATM Securityc статус 200")
    @Test void checkGetAtmSecurityStatus200() {
        api.checkStatusEndpoint(Role.SECURITY, point.getATMS() + "/1").statusCode(200);
    }

    @DisplayName("Проверка /atms с правами ATM Business статус 200")
    @Test void checkGetAtmBusinessStatus200() {
        api.checkStatusEndpoint(Role.BUSINESS, point.getATMS() + "/1").statusCode(200);
    }

    @DisplayName("Проверка /atms с правами ATM ReadUser статус 200")
    @Test void checkGetAtmReadUserStatus200() {
        api.checkStatusEndpoint(Role.READ_USER, point.getATMS() + "/1").statusCode(200);
    }

    @DisplayName("Проверка /atms с правами ATM Telecom статус 200")
    @Test void checkGetAtmTelecomStatus200() {
        api.checkStatusEndpoint(Role.TELECOM, point.getATMS() + "/1").statusCode(200);
    }

    @DisplayName("Проверка /atms с правами ATM TechSupport статус 200")
    @Test void checkGetAtmTechSupportStatus200() {
        api.checkStatusEndpoint(Role.TECH_SUPPORT, point.getATMS() + "/1").statusCode(200);
    }

    @DisplayName("Проверка /atms с правами ATM Admin статус 200")
    @Test void checkGetAtmAdminStatus200() {
        api.checkStatusEndpoint(Role.ADMIN, point.getATMS() + "/1").statusCode(200);
    }

    @DisplayName("Ошибка сервера /atms при выборе несуществующего АТМ")
    @Test void checkGetAtmStatus500() {
        api.checkStatusEndpoint(Role.LOGISTIC, point.getATMS() + "/0").statusCode(500);
    }
}
