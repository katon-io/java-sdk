package io.katon.api.common.transfer;

import java.util.Optional;

public class ReceiveCoinRequest {
    private Long amount;
    private String sender;
    private Optional<Long> fee;

    ReceiveCoinRequest(Long amount, String sender, Optional<Long> fee) {
        this.amount = amount;
        this.sender = sender;
        this.fee = fee;
    }

    public Long getAmount() {
        return this.amount;
    }

    public String getSender() {
        return this.sender;
    }

    public Optional<Long> getFee() {
        return this.fee;
    }

}
