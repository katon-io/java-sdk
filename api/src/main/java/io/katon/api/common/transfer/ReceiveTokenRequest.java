package io.katon.api.common.transfer;

public class ReceiveTokenRequest {
    private Long amount;
    private String sender;

    ReceiveTokenRequest(Long amount, String sender) {
        this.amount = amount;
        this.sender = sender;
    }

    public Long getAmount() {
        return this.amount;
    }

    public String getSender() {
        return this.sender;
    }

}
