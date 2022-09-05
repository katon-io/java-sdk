package io.katon.api.common;

public enum TransactionFundingStrategy {
    PROJECT("project"), OWNER("owner");

    private String label;
    
    private TransactionFundingStrategy(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
