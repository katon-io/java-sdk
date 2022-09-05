package io.katon.api.context;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpRequest.Builder;
import java.net.http.HttpResponse;
import java.net.http.HttpResponse.BodyHandlers;
import java.util.Map;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.CompletionException;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import io.katon.api.http.JavaSdkOrigin;
import io.katon.api.http.KatonHttpHeader;

public class KatonPublicContextOptions extends AbstractKatonContext {

    protected String publicKey;
    protected HttpClient httpClient;

    public KatonPublicContextOptions(String project, String publicKey, KatonContextOptions options) {
        super(project, options);
        this.publicKey = publicKey;
        this.httpClient = HttpClient.newHttpClient();
    }

    @Override
    Boolean canWrite() {
        return false;
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
                this.publicKey);
    }

    class UncheckedObjectMapper extends ObjectMapper {
        /** Parses the given JSON string into a Map. */
        Map<String, String> treadValue(InputStream inputStream) {
            try {
                return this.readValue(inputStream, new TypeReference<Map<String, String>>() {
                });
            } catch (IOException ioe) {
                throw new CompletionException(ioe);
            }
        }
    }

    CompletableFuture<Map<String, String>> fetchTransaction(String hash) throws URISyntaxException {
        UncheckedObjectMapper objectMapper = new UncheckedObjectMapper();

        HttpRequest request = baseHttpRequest().GET().uri(new URI(this.baseUrl() + "/v1/transactions/" + hash))
                .build();
        return this.httpClient
                .sendAsync(request, BodyHandlers.ofInputStream())
                .thenApply(HttpResponse::body)
                .thenApply(objectMapper::treadValue);
    }

    // <T> CompletableFuture<T> doGet(String path, ObjectMapper mapper) {
    // HttpRequest request = baseHttpRequest().GET().uri(new URI(this.baseUrl() +
    // path)).build();
    // return this.httpClient
    // .sendAsync(request, BodyHandlers.ofInputStream())
    // .thenApply(HttpResponse::body)
    // .thenApply(mapper::readValue);
    // }
}
