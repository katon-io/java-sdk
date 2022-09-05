package io.katon.api.common.transfer;

public class SendTokenRequest {
    private Long amount;
    private String receiver;

    SendTokenRequest(Long amount, String receiver) {
        this.amount = amount;
        this.receiver = receiver;
    }

    public Long getAmount() {
        return this.amount;
    }

    public String getReceiver() {
        return this.receiver;
    }

}
