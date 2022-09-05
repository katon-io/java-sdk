package io.katon.api.http;

public enum KatonHttpHeader {
    AUTHORIZATION_REFRESH("katon-ctx-refresh"), 
    CONTEXT_ORIGIN("katon-ctx-origin"),
    CONTEXT_PROJECT("katon-ctx-project"),
    PUBLIC_KEY("katon-ctx-public-key"),
    PRIVATE_KEY("katon-ctx-private-key");

    private String label;
    
    private KatonHttpHeader(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
