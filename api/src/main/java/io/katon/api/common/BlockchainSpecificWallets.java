package io.katon.api.common;

public class BlockchainSpecificWallets {
    private String address;
    private Blockchain blockchain;

    BlockchainSpecificWallets(String address, Blockchain blockchain) {
        this.address = address;
        this.blockchain = blockchain;
    }

    public String getAddress() {
        return this.address;
    }

    public Blockchain getBlockchain() {
        return this.blockchain;
    }
}
