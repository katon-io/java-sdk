package io.katon.api.common.balance;

import io.katon.api.common.Metadata;

public class TokenBalanceListResponse {
    private Metadata metadata;
    private TokenBalance[] balances;


    public TokenBalanceListResponse(Metadata metadata, TokenBalance[] balances) {
        this.metadata = metadata;
        this.balances = balances;
    }

    public Metadata getMetadata() {
        return this.metadata;
    }

    public void setMetadata(Metadata metadata) {
        this.metadata = metadata;
    }

    public TokenBalance[] getBalances() {
        return this.balances;
    }

    public void setBalances(TokenBalance[] balances) {
        this.balances = balances;
    }

}

