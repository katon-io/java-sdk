package io.katon.api.context;

import io.katon.api.common.Blockchain;
import io.katon.api.common.Environment;

public class KatonContextOptions {
    public Blockchain defaultBlockchain;
    public Environment environment;
 
    public KatonContextOptions(Blockchain defaultBlockchain, Environment environment) {
        this.defaultBlockchain = defaultBlockchain;
        this.environment = environment;
    }

    public Blockchain getDefaultBlockchain() {
        return this.defaultBlockchain;
    }

    public void setDefaultChain(Blockchain defaultBlockchain) {
        this.defaultBlockchain = defaultBlockchain;
    }

    public Environment getEnvironment() {
        return this.environment;
    }

    public void setEnvironment(Environment environment) {
        this.environment = environment;
    }

}
