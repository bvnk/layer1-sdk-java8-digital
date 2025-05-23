/*
 * Digital Asset
 * Layer1 API making management of crypto assets simple and easy
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.layer1.clients.java8.digital.api;

import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.model.ApiError;
import com.layer1.clients.java8.digital.model.CreateStakingTransactionRequest;
import com.layer1.clients.java8.digital.model.CreateTransactionRequest;
import com.layer1.clients.java8.digital.model.PaginatedResultTransactionRequest;
import com.layer1.clients.java8.digital.model.TransactionRequest;
import java.util.UUID;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for TransactionRequestApi
 */
@Disabled
public class TransactionRequestApiTest {

    private final TransactionRequestApi api = new TransactionRequestApi();

    /**
     * Create staking transaction request
     *
     * Create a new blockchain staking transaction
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createStakingTransactionTest() throws ApiException {
        CreateStakingTransactionRequest createStakingTransactionRequest = null;
        TransactionRequest response = api.createStakingTransaction(createStakingTransactionRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * Create transaction request
     *
     * Create a new blockchain transaction
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void createTransactionTest() throws ApiException {
        CreateTransactionRequest createTransactionRequest = null;
        TransactionRequest response = api.createTransaction(createTransactionRequest)
                .execute();
        // TODO: test validations
    }

    /**
     * Get transaction request
     *
     * Get transaction request by id
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void getTransactionRequestByIdTest() throws ApiException {
        UUID requestId = null;
        TransactionRequest response = api.getTransactionRequestById(requestId)
                .execute();
        // TODO: test validations
    }

    /**
     * List transaction requests
     *
     * Retrieve paginated list of transaction requests
     *
     * @throws ApiException if the Api call fails
     */
    @Test
    public void listTransactionRequestsTest() throws ApiException {
        UUID assetPoolId = null;
        Integer pageNumber = null;
        Integer pageSize = null;
        String q = null;
        PaginatedResultTransactionRequest response = api.listTransactionRequests(assetPoolId, pageNumber, pageSize)
                .q(q)
                .execute();
        // TODO: test validations
    }

}
