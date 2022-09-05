package io.katon.api.common.coins;

public enum Coins {
    EGLD("EGLD"),
    KTON("KTON");

    private String label;

    private Coins(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }
}
