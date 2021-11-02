package com.delta.api;

import com.delta.config.Endpoint;
import com.delta.config.Role;
import com.delta.service.ApiService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("/atms/limits")
public class Limits {
    Endpoint point = new Endpoint();
    ApiService api = new ApiService();


    @DisplayName("Доступность /atms/limits пользователем с правами Incasso")
    @Test void checkGetCollectionIncasso200() {
        api.checkStatusEndpoint(Role.INCASSO, point.getATMS() + "/1" + point.getLIMITS()).statusCode(200);
    }

    @DisplayName("Недоступность /atms/limits пользователем с правами Security")
    @Test void checkGetCollectionSecurity200() {
        api.checkStatusEndpoint(Role.SECURITY, point.getATMS() + "/1" + point.getLIMITS()).statusCode(200);
    }

    @DisplayName("Доступность /atms/limits пользователем с правами Admin")
    @Test void checkGetCollectionAdmin200() {
        api.checkStatusEndpoint(Role.ADMIN, point.getATMS() + "/1" + point.getLIMITS()).statusCode(200);
    }

    @DisplayName("Недоступность /atms/limits пользователем с правами Logistic")
    @Test
    void checkGetCollectionLogistic403() {
        api.checkStatusEndpoint(Role.LOGISTIC, point.getATMS() + "/1" + point.getLIMITS()).statusCode(403);
    }

    @DisplayName("Недоступность /atms/limits пользователем с правами Business")
    @Test void checkGetCollectionBusiness403() {
        api.checkStatusEndpoint(Role.BUSINESS, point.getATMS() + "/1" + point.getLIMITS()).statusCode(403);
    }

    @DisplayName("Недоступность /atms/limits пользователем с правами Telecom")
    @Test void checkGetCollectionTelecom403() {
        api.checkStatusEndpoint(Role.TELECOM, point.getATMS() + "/1" + point.getLIMITS()).statusCode(403);
    }

    @DisplayName("Недоступность /atms/limits пользователем с правами ReadUser")
    @Test void checkGetCollectionReadUser403() {
        api.checkStatusEndpoint(Role.READ_USER, point.getATMS() + "/1" + point.getLIMITS()).statusCode(403);
    }

    @DisplayName("Недоступность /atms/limits пользователем с правами TechSupport")
    @Test void checkGetCollectionTechSupport403() {
        api.checkStatusEndpoint(Role.TECH_SUPPORT, point.getATMS() + "/1" + point.getLIMITS()).statusCode(403);
    }
}
