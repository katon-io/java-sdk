package io.katon.api.common;

public class Wallet {
    private String id;
    private String userId;
    private String accountId;
    private String projectId;
    private BlockchainSpecificWallets[] blockchainSpecificWallets;

    private Wallet(String id, String userId, String accountId, String projectId, BlockchainSpecificWallets[] blockchainSpecificWallets) {
        this.id = id;
        this.userId = userId;
        this.accountId = accountId;
        this.projectId = projectId;
        this.blockchainSpecificWallets = blockchainSpecificWallets;
    }

    String getId() {
        return this.id;
    }

    String getUserId() {
        return this.userId;
    }

    String getAccountId() {
        return this.accountId;
    }

    String getProjectId() {
        return this.projectId;
    }
    
    BlockchainSpecificWallets[] getBlockchainSpecificWallets() {
        return this.blockchainSpecificWallets;
    }


}