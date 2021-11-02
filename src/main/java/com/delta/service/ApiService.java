package com.delta.service;

import com.delta.config.Credential;
import com.delta.config.Endpoint;
import com.delta.config.Role;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;
import io.restassured.specification.RequestSpecification;

import java.util.Base64;

public class ApiService {
    Credential cred = new Credential();
    Endpoint point = new Endpoint();

    private String encode(String user, String pass) {
        return new String(Base64.getEncoder().encode((user + ":" + pass).getBytes()));
    }

    private RequestSpecification requestToken(String user, String pass) {
        String authorization = encode(cred.getLOGIN_AUTH_CLIENT(), cred.getPASS_AUTH_CLIENT());

        return RestAssured.given()
                .header("authorization", "Basic " + authorization)
                .contentType(ContentType.URLENC)
                .queryParam("grant_type", "password")
                .queryParam("username", user)
                .queryParam("password", pass);
    }


    public String getAccessToken(String user, String pass) {
        return
                requestToken(user, pass)
                        .post(cred.getAPI_BASE_URL() + point.getAPI_TOKEN())
                        .then()
                        .assertThat()
                        .statusCode(200)
                        .extract()
                        .path("access_token")
                        .toString();
    }

    public ValidatableResponse checkStatusEndpoint(Role role, String endpoint) {
        RequestSpecification request = RestAssured.given()
                .contentType(ContentType.JSON)
                .accept(ContentType.ANY);

        return request
                .header("Authorization", "Bearer " +
                        getAccessToken(cred.getUserCredential().get(role + "_LOGIN"), cred.getUserCredential().get(role + "_PASS")))
                .get(cred.getAPI_BASE_URL() + endpoint)
                .then()
                .assertThat();
    }

    public ValidatableResponse checkGetToken(String user, String pass) {
        return requestToken(user, pass)
                .post(cred.getAPI_BASE_URL() + point.getAPI_TOKEN())
                .then()
                .assertThat();
    }

}
