package io.katon.api.common.balance;

import java.math.BigDecimal;
import java.nio.Buffer;
import java.util.Optional;

import io.katon.api.common.Blockchain;
import io.katon.api.common.Scope;
import io.katon.api.common.token.TokenMedias;

public class TokenBalance {
    private Optional<String> tokenId;
    private String tokenNetworkIdentifier;
    private String tokenName;
    private Optional<TokenMedias> tokenMedias;
    private String[] tokenUris;
    private Double tokenRoyalties;
    private Buffer tokenMetadata;
    private Boolean isNft;

    private String collectionId;
    private String collectionNetworkIdentifier;
    private Optional<String> collectionImgUrl;
    private Optional<String> collectionName;
    private Optional<Scope> collectionScope;

    private String balanceOf;
    private BigDecimal balance;
    private Blockchain blockchain;

    public TokenBalance(Optional<String> tokenId, String tokenNetworkIdentifier, String tokenName,
            Optional<TokenMedias> tokenMedias, String[] tokenUris, Double tokenRoyalties, Buffer tokenMetadata,
            Boolean isNft, String collectionId, String collectionNetworkIdentifier, Optional<String> collectionImgUrl,
            Optional<String> collectionName, Optional<Scope> collectionScope, String balanceOf, BigDecimal balance,
            Blockchain blockchain) {
        this.tokenId = tokenId;
        this.tokenNetworkIdentifier = tokenNetworkIdentifier;
        this.tokenName = tokenName;
        this.tokenMedias = tokenMedias;
        this.tokenUris = tokenUris;
        this.tokenRoyalties = tokenRoyalties;
        this.tokenMetadata = tokenMetadata;
        this.isNft = isNft;
        this.collectionId = collectionId;
        this.collectionNetworkIdentifier = collectionNetworkIdentifier;
        this.collectionImgUrl = collectionImgUrl;
        this.collectionName = collectionName;
        this.collectionScope = collectionScope;
        this.balanceOf = balanceOf;
        this.balance = balance;
        this.blockchain = blockchain;
    }

    public Optional<String> getTokenId() {
        return this.tokenId;
    }

    public void setTokenId(Optional<String> tokenId) {
        this.tokenId = tokenId;
    }

    public String getTokenNetworkIdentifier() {
        return this.tokenNetworkIdentifier;
    }

    public void setTokenNetworkIdentifier(String tokenNetworkIdentifier) {
        this.tokenNetworkIdentifier = tokenNetworkIdentifier;
    }

    public String getTokenName() {
        return this.tokenName;
    }

    public void setTokenName(String tokenName) {
        this.tokenName = tokenName;
    }

    public Optional<TokenMedias> getTokenMedias() {
        return this.tokenMedias;
    }

    public void setTokenMedias(Optional<TokenMedias> tokenMedias) {
        this.tokenMedias = tokenMedias;
    }

    public String[] getTokenUris() {
        return this.tokenUris;
    }

    public void setTokenUris(String[] tokenUris) {
        this.tokenUris = tokenUris;
    }

    public Double getTokenRoyalties() {
        return this.tokenRoyalties;
    }

    public void setTokenRoyalties(Double tokenRoyalties) {
        this.tokenRoyalties = tokenRoyalties;
    }

    public Buffer getTokenMetadata() {
        return this.tokenMetadata;
    }

    public void setTokenMetadata(Buffer tokenMetadata) {
        this.tokenMetadata = tokenMetadata;
    }

    public Boolean isIsNft() {
        return this.isNft;
    }

    public Boolean getIsNft() {
        return this.isNft;
    }

    public void setIsNft(Boolean isNft) {
        this.isNft = isNft;
    }

    public String getCollectionId() {
        return this.collectionId;
    }

    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }

    public String getCollectionNetworkIdentifier() {
        return this.collectionNetworkIdentifier;
    }

    public void setCollectionNetworkIdentifier(String collectionNetworkIdentifier) {
        this.collectionNetworkIdentifier = collectionNetworkIdentifier;
    }

    public Optional<String> getCollectionImgUrl() {
        return this.collectionImgUrl;
    }

    public void setCollectionImgUrl(Optional<String> collectionImgUrl) {
        this.collectionImgUrl = collectionImgUrl;
    }

    public Optional<String> getCollectionName() {
        return this.collectionName;
    }

    public void setCollectionName(Optional<String> collectionName) {
        this.collectionName = collectionName;
    }

    public Optional<Scope> getCollectionScope() {
        return this.collectionScope;
    }

    public void setCollectionScope(Optional<Scope> collectionScope) {
        this.collectionScope = collectionScope;
    }

    public String getBalanceOf() {
        return this.balanceOf;
    }

    public void setBalanceOf(String balanceOf) {
        this.balanceOf = balanceOf;
    }

    public BigDecimal getBalance() {
        return this.balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public Blockchain getBlockchain() {
        return this.blockchain;
    }

    public void setBlockchain(Blockchain blockchain) {
        this.blockchain = blockchain;
    }

}
