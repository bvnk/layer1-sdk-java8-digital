# TransactionApi

All URIs are relative to *https://api.staging.layer1.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**claimTransaction**](TransactionApi.md#claimTransaction) | **POST** /digital/v1/transaction-claims | Claim blockchain transaction |
| [**getTransactionById**](TransactionApi.md#getTransactionById) | **GET** /digital/v1/transactions/{transactionId} | Get transaction |
| [**listTransactions**](TransactionApi.md#listTransactions) | **GET** /digital/v1/transactions | List transactions |


<a id="claimTransaction"></a>
# **claimTransaction**
> claimTransaction(transactionClaimRequest).execute();

Claim blockchain transaction

Claim an existing blockchain transaction

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.TransactionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionApi apiInstance = new TransactionApi(defaultClient);
    TransactionClaimRequest transactionClaimRequest = new TransactionClaimRequest(); // TransactionClaimRequest | 
    try {
      apiInstance.claimTransaction(transactionClaimRequest)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#claimTransaction");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transactionClaimRequest** | [**TransactionClaimRequest**](TransactionClaimRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

[httpSignature](../README.md#httpSignature), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **503** | Service Unavailable |  -  |
| **400** | Standard error response |  -  |
| **200** | OK |  -  |
| **0** | Request invalid |  -  |

<a id="getTransactionById"></a>
# **getTransactionById**
> Transaction getTransactionById(transactionId).execute();

Get transaction

Get transaction by id

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.TransactionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionApi apiInstance = new TransactionApi(defaultClient);
    String transactionId = "transactionId_example"; // String | 
    try {
      Transaction result = apiInstance.getTransactionById(transactionId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#getTransactionById");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **transactionId** | **String**|  | |

### Return type

[**Transaction**](Transaction.md)

### Authorization

[httpSignature](../README.md#httpSignature), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **503** | Service Unavailable |  -  |
| **400** | Standard error response |  -  |
| **200** | OK |  -  |
| **0** | Request invalid |  -  |

<a id="listTransactions"></a>
# **listTransactions**
> PaginatedResultTransaction listTransactions(assetPoolId, pageNumber, pageSize).q(q).execute();

List transactions

Retrieve paginated list of transactions

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.TransactionApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionApi apiInstance = new TransactionApi(defaultClient);
    UUID assetPoolId = UUID.randomUUID(); // UUID | asset pool id
    Integer pageNumber = 0; // Integer | current page number
    Integer pageSize = 50; // Integer | number of items in a page
    String q = "q_example"; // String | Query in lucene like format, e.g. hash:0x012a1. Supported properties: hash, reference, customerId, from, to. If time bounds are not provided default are applied
    try {
      PaginatedResultTransaction result = apiInstance.listTransactions(assetPoolId, pageNumber, pageSize)
            .q(q)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionApi#listTransactions");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **assetPoolId** | **UUID**| asset pool id | |
| **pageNumber** | **Integer**| current page number | [default to 0] |
| **pageSize** | **Integer**| number of items in a page | [default to 50] |
| **q** | **String**| Query in lucene like format, e.g. hash:0x012a1. Supported properties: hash, reference, customerId, from, to. If time bounds are not provided default are applied | [optional] |

### Return type

[**PaginatedResultTransaction**](PaginatedResultTransaction.md)

### Authorization

[httpSignature](../README.md#httpSignature), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **503** | Service Unavailable |  -  |
| **400** | Standard error response |  -  |
| **200** | OK |  -  |
| **0** | Request invalid |  -  |

