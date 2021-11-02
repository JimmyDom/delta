package com.delta.api;

import com.delta.config.Endpoint;
import com.delta.config.Role;
import com.delta.service.ApiService;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("/atms/security")
public class Security {
    Endpoint point = new Endpoint();
    ApiService api = new ApiService();


    @DisplayName("Доступность /atms/security пользователем с правами Incasso")
    @Test
    void checkGetSecurityIncasso200() {
        api.checkStatusEndpoint(Role.INCASSO, point.getATMS() + "/1" + point.getSECURITY()).statusCode(200);
    }

    @DisplayName("Недоступность /atms/security пользователем с правами Security")
    @Test void checkGetSecuritySecurity200() {
        api.checkStatusEndpoint(Role.SECURITY, point.getATMS() + "/1" + point.getSECURITY()).statusCode(200);
    }

    @DisplayName("Доступность /atms/security пользователем с правами Admin")
    @Test void checkGetSecurityAdmin200() {
        api.checkStatusEndpoint(Role.ADMIN, point.getATMS() + "/1" + point.getSECURITY()).statusCode(200);
    }

    @DisplayName("Доступность /atms/security пользователем с правами Logistic")
    @Test
    void checkGetSecurityLogistic200() {
        api.checkStatusEndpoint(Role.LOGISTIC, point.getATMS() + "/1" + point.getSECURITY()).statusCode(200);
    }

    @DisplayName("Недоступность /atms/security пользователем с правами Business")
    @Test void checkGetSecurityBusiness200() {
        api.checkStatusEndpoint(Role.BUSINESS, point.getATMS() + "/1" + point.getSECURITY()).statusCode(200);
    }

    @DisplayName("Недоступность /atms/security пользователем с правами Telecom")
    @Test void checkGetSecurityTelecom403() {
        api.checkStatusEndpoint(Role.TELECOM, point.getATMS() + "/1" + point.getSECURITY()).statusCode(403);
    }

    @DisplayName("Недоступность /atms/security пользователем с правами ReadUser")
    @Test void checkGetSecurityReadUser403() {
        api.checkStatusEndpoint(Role.READ_USER, point.getATMS() + "/1" + point.getSECURITY()).statusCode(403);
    }

    @DisplayName("Недоступность /atms/security пользователем с правами TechSupport")
    @Test void checkGetSecurityTechSupport403() {
        api.checkStatusEndpoint(Role.TECH_SUPPORT, point.getATMS() + "/1" + point.getSECURITY()).statusCode(403);
    }
}
