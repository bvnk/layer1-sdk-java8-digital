package com.layer1.clients.java8.digital;


import com.layer1.clients.auth.Layer1ClientConfiguration;
import com.layer1.clients.auth.Layer1Digest;
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Pair;
import com.layer1.clients.java8.digital.invoker.ServerConfiguration;
import okhttp3.Call;

import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class Layer1DigitalClient extends ApiClient {
    private final Layer1Digest layer1HttpSigner;

    public Layer1DigitalClient(Layer1ClientConfiguration layer1ClientConfiguration) {
        super(layer1ClientConfiguration.getBasePath(), layer1ClientConfiguration.getClientId(), layer1ClientConfiguration.getClientSecret(), new HashMap<>());

        if(!Objects.isNull(layer1ClientConfiguration.getSigningPrivateKey()) && !layer1ClientConfiguration.getSigningPrivateKey().isEmpty()) {
            layer1HttpSigner = new Layer1Digest(layer1ClientConfiguration.getSigningPrivateKey(), layer1ClientConfiguration.getClientId());
        } else {
            throw new IllegalStateException("Signing private key is not set");
        }

        ServerConfiguration serverConfiguration = new ServerConfiguration(layer1ClientConfiguration.getBasePath(), "Digital API", new HashMap<>());
        setServers(Collections.singletonList(serverConfiguration));
    }

    @Override
    public void updateParamsForAuth(String[] authNames, List<Pair> queryParams, Map<String, String> headerParams, Map<String, String> cookieParams, String payload, String method, URI uri) throws ApiException {
        headerParams.putAll(layer1HttpSigner.buildHeaders(uri.toString(), payload, method));
    }

    public <T> T post(String path, Object body, Class<T> responseType) throws ApiException {
        String[] localVarAuthNames = new String[] { "httpSignature", "oauth2" };
        Map<String, String> localVarHeaderParams = new HashMap<>();
        localVarHeaderParams.put("Content-Type", "application/json");
        Call call = buildCall(getBasePath(), path, "POST", Collections.emptyList(), Collections.emptyList(), body, localVarHeaderParams, Collections.emptyMap(), Collections.emptyMap(), localVarAuthNames, null);
        return (T) execute(call, responseType).getData();
    }


}

