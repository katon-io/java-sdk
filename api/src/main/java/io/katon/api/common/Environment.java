package io.katon.api.common;

public enum Environment {
    PROD("prod"), SANDBOX("sandbox");

    private String label;
    
    private Environment(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
