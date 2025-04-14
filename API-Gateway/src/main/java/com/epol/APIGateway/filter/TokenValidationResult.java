package com.epol.APIGateway.filter;

public class TokenValidationResult {
    private boolean valid;
    private String userRole;
    private String userId;

    public boolean isValid() {
        return valid;
    }

    public String getUserRole() {
        return userRole;
    }

    public String getUserId() {
        return userId;
    }
}
