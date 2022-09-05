package io.katon.api.common.transfer;

import io.katon.api.common.Blockchain;

public class TransferResponse {
    private String transaction;
    private Blockchain blockchain;

    TransferResponse(String transaction, Blockchain blockchain) {
        this.transaction = transaction;
        this.blockchain = blockchain;
    }

    public String getTransaction() {
        return this.transaction;
    }

    public Blockchain getBlockchain() {
        return this.blockchain;
    }

}
