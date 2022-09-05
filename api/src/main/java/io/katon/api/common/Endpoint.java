package io.katon.api.common;

public enum Endpoint {
    SANDBOX("https://sandbox-api.katon.io"), 
    PRODUCTION("https://api.katon.io");

    private String url;
    
    private Endpoint(String url) {
        this.url = url;
    }

    public String getUrl() {
        return url;
    }
}
