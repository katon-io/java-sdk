package io.katon.api.context;

import java.net.http.HttpRequest.Builder;
import java.util.Objects;

import io.katon.api.common.Blockchain;
import io.katon.api.common.Endpoint;
import io.katon.api.common.Environment;

public abstract class AbstractKatonContext {
    protected String project;
    protected KatonContextOptions options;

    public AbstractKatonContext(String project, KatonContextOptions options) {
        Objects.requireNonNull(project, "project must not be null");
        this.project = project;
        this.options = options;
    }

    public String getProject() {
        return this.project;
    }

    public KatonContextOptions getOptions() {
        return this.options;
    }

    public Boolean isProduction() {
        return this.options.environment == Environment.PROD;
    }

    public Boolean isSandbox() {
        return this.options.environment == Environment.SANDBOX;
    }

    public Blockchain getDefaultBlockchain() {
        return this.options.getDefaultBlockchain();
    }

    protected String baseUrl() {
            switch (this.options.environment) {
                case PROD:
                    return Endpoint.PRODUCTION.getUrl();
                case SANDBOX:
                    return Endpoint.SANDBOX.getUrl();
                default:
                    return Endpoint.PRODUCTION.getUrl();
            }
    }

    abstract Boolean canWrite();

    protected abstract Builder baseHttpRequest();
}
