package io.katon.api.common;

public enum Scope {
    PROJECT("project"), METAVERSE("metaverse");

    private String label;
    
    private Scope(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
