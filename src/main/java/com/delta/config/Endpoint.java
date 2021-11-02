package com.delta.config;

import lombok.Data;

@Data
public class Endpoint {
    private final String API_TOKEN = "/oauth/token";
    private final String CREATE_ATM = "/api/atms";
    private final String CATALOGS = "/catalogs";
    private final String ATMS = "/atms";
    private final String LIMITS = "/limits";
    private final String SECURITY = "/security";
}
