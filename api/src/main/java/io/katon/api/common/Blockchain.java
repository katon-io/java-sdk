package io.katon.api.common;

public enum Blockchain {
    ELROND("elrond");

    private String name;
    
    private Blockchain(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
