package io.katon.api.common.balance;

import io.katon.api.common.Metadata;

public class CoinBalanceListResponse {

    private Metadata metadata;
    private CoinBalance coinBalance;

    public CoinBalanceListResponse(Metadata metadata, CoinBalance coinBalance) {
        this.metadata = metadata;
        this.coinBalance = coinBalance;
    }

    public Metadata getMetadata() {
        return this.metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public CoinBalance getCoinBalance() {
        return this.coinBalance;
    }

    public void setCoinBalance(CoinBalance coinBalance) {
        this.coinBalance = coinBalance;
    }

}
