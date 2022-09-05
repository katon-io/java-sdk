package io.katon.api.common.balance;

import java.math.BigInteger;
import java.util.Optional;

import io.katon.api.common.Blockchain;
import io.katon.api.common.Scope;

public class CoinBalance {
    private Optional<String> coinId;
    private String coinNetworkIdentifier;
    private String coinName;
    private String balanceOf;
    private BigInteger balance;
    private Integer decimals;
    private Blockchain blockchain;
    private Optional<String> imageUrl;
    private Scope scope;

    public CoinBalance(Optional<String> coinId, String coinNetworkIdentifier, String coinName, String balanceOf,
            BigInteger balance, Integer decimals, Blockchain blockchain, Optional<String> imageUrl, Scope scope) {
        this.coinId = coinId;
        this.coinNetworkIdentifier = coinNetworkIdentifier;
        this.coinName = coinName;
        this.balanceOf = balanceOf;
        this.balance = balance;
        this.decimals = decimals;
        this.blockchain = blockchain;
        this.imageUrl = imageUrl;
        this.scope = scope;
    }

    public Optional<String> getCoinId() {
        return this.coinId;
    }

    public void setCoinId(Optional<String> coinId) {
        this.coinId = coinId;
    }

    public String getCoinNetworkIdentifier() {
        return this.coinNetworkIdentifier;
    }

    public void setCoinNetworkIdentifier(String coinNetworkIdentifier) {
        this.coinNetworkIdentifier = coinNetworkIdentifier;
    }

    public String getCoinName() {
        return this.coinName;
    }

    public void setCoinName(String coinName) {
        this.coinName = coinName;
    }

    public String getBalanceOf() {
        return this.balanceOf;
    }

    public void setBalanceOf(String balanceOf) {
        this.balanceOf = balanceOf;
    }

    public BigInteger getBalance() {
        return this.balance;
    }

    public void setBalance(BigInteger balance) {
        this.balance = balance;
    }

    public Integer getDecimals() {
        return this.decimals;
    }

    public void setDecimals(Integer decimals) {
        this.decimals = decimals;
    }

    public Blockchain getBlockchain() {
        return this.blockchain;
    }

    public void setBlockchain(Blockchain blockchain) {
        this.blockchain = blockchain;
    }

    public Optional<String> getImageUrl() {
        return this.imageUrl;
    }

    public void setImageUrl(Optional<String> imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Scope getScope() {
        return this.scope;
    }

    public void setScope(Scope scope) {
        this.scope = scope;
    }

}
