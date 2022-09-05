package io.katon.api.context;

import java.net.http.HttpRequest;
import java.net.http.HttpRequest.Builder;

import io.katon.api.http.JavaSdkOrigin;
import io.katon.api.http.KatonHttpHeader;

public class KatonPrivateContextOptions extends KatonPublicContextOptions {

    private String privateKey;

    public KatonPrivateContextOptions(String project, String publicKey, String privateKey,
            KatonContextOptions options) {
        super(project, publicKey, options);
        this.privateKey = privateKey;
    }

    @Override
    Boolean canWrite() {
        return true;
    }

    @Override
    protected Builder baseHttpRequest() {
        return HttpRequest.newBuilder().headers(
                "Accept",
                "application/json",
                KatonHttpHeader.CONTEXT_ORIGIN.getLabel(),
                JavaSdkOrigin.javaSdkOrigin,
                KatonHttpHeader.CONTEXT_PROJECT.getLabel(),
                this.project,
                KatonHttpHeader.PUBLIC_KEY.getLabel(),
                this.publicKey,
                KatonHttpHeader.PRIVATE_KEY.getLabel(),
                this.privateKey);
    }
}
