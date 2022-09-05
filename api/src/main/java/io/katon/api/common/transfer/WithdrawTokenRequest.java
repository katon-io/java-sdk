package io.katon.api.common.transfer;

public class WithdrawTokenRequest {
    private Long amount;
    private String receiverAddress;

    WithdrawTokenRequest(Long amount, String receiverAddress) {
        this.amount = amount;
        this.receiverAddress = receiverAddress;
    }

    public Long getAmount() {
        return this.amount;
    }

    public String getReceiverAddress() {
        return this.receiverAddress;
    }

}
