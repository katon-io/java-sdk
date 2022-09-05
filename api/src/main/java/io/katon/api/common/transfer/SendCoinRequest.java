package io.katon.api.common.transfer;

import java.util.Optional;

public class SendCoinRequest {
    private Long amount;
    private String receiver;
    private Optional<Long> fee;

    SendCoinRequest(Long amount, String receiver, Optional<Long> fee) {
        this.amount = amount;
        this.receiver = receiver;
        this.fee = fee;
    }

    public Long getAmount() {
        return this.amount;
    }

    public String getReceiver() {
        return this.receiver;
    }

    public Optional<Long> getFee() {
        return this.fee;
    }

}
