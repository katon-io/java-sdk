package io.katon.api.common.transfer;

import java.util.Optional;

public class WithdrawCoinRequest {
    private Long amount;
    private String receiverAddress;
    private Optional<Long> fee;

    WithdrawCoinRequest(Long amount, String receiverAddress, Optional<Long> fee) {
        this.amount = amount;
        this.receiverAddress = receiverAddress;
        this.fee = fee;
    }

    public Long getAmount() {
        return this.amount;
    }

    public String getReceiverAddress() {
        return this.receiverAddress;
    }

    public Optional<Long> getFee() {
        return this.fee;
    }

}
