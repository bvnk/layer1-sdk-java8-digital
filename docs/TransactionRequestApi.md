# TransactionRequestApi

All URIs are relative to *https://api.staging.layer1.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createStakingTransaction**](TransactionRequestApi.md#createStakingTransaction) | **POST** /digital/v1/staking-requests | Create staking transaction request |
| [**createTransaction**](TransactionRequestApi.md#createTransaction) | **POST** /digital/v1/transaction-requests | Create transaction request |
| [**getTransactionRequestById**](TransactionRequestApi.md#getTransactionRequestById) | **GET** /digital/v1/transaction-requests/{requestId} | Get transaction request |
| [**listTransactionRequests**](TransactionRequestApi.md#listTransactionRequests) | **GET** /digital/v1/transaction-requests | List transaction requests |


<a id="createStakingTransaction"></a>
# **createStakingTransaction**
> TransactionRequest createStakingTransaction(createStakingTransactionRequest).execute();

Create staking transaction request

Create a new blockchain staking transaction

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.TransactionRequestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionRequestApi apiInstance = new TransactionRequestApi(defaultClient);
    CreateStakingTransactionRequest createStakingTransactionRequest = new CreateStakingTransactionRequest(); // CreateStakingTransactionRequest | 
    try {
      TransactionRequest result = apiInstance.createStakingTransaction(createStakingTransactionRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionRequestApi#createStakingTransaction");
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
| **createStakingTransactionRequest** | [**CreateStakingTransactionRequest**](CreateStakingTransactionRequest.md)|  | |

### Return type

[**TransactionRequest**](TransactionRequest.md)

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
| **202** | Accepted |  -  |
| **0** | Request invalid |  -  |

<a id="createTransaction"></a>
# **createTransaction**
> TransactionRequest createTransaction(createTransactionRequest).execute();

Create transaction request

Create a new blockchain transaction

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.TransactionRequestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionRequestApi apiInstance = new TransactionRequestApi(defaultClient);
    CreateTransactionRequest createTransactionRequest = new CreateTransactionRequest(); // CreateTransactionRequest | 
    try {
      TransactionRequest result = apiInstance.createTransaction(createTransactionRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionRequestApi#createTransaction");
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
| **createTransactionRequest** | [**CreateTransactionRequest**](CreateTransactionRequest.md)|  | |

### Return type

[**TransactionRequest**](TransactionRequest.md)

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
| **202** | Accepted |  -  |
| **0** | Request invalid |  -  |

<a id="getTransactionRequestById"></a>
# **getTransactionRequestById**
> TransactionRequest getTransactionRequestById(requestId).execute();

Get transaction request

Get transaction request by id

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.TransactionRequestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionRequestApi apiInstance = new TransactionRequestApi(defaultClient);
    UUID requestId = UUID.randomUUID(); // UUID | 
    try {
      TransactionRequest result = apiInstance.getTransactionRequestById(requestId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionRequestApi#getTransactionRequestById");
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
| **requestId** | **UUID**|  | |

### Return type

[**TransactionRequest**](TransactionRequest.md)

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

<a id="listTransactionRequests"></a>
# **listTransactionRequests**
> PaginatedResultTransactionRequest listTransactionRequests(assetPoolId, pageNumber, pageSize).q(q).execute();

List transaction requests

Retrieve paginated list of transaction requests

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.TransactionRequestApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    TransactionRequestApi apiInstance = new TransactionRequestApi(defaultClient);
    UUID assetPoolId = UUID.randomUUID(); // UUID | asset pool id
    Integer pageNumber = 0; // Integer | current page number
    Integer pageSize = 50; // Integer | number of items in a page
    String q = "q_example"; // String | Query in lucene like format, e.g. reference:REF-12a1. Supported properties: reference, type
    try {
      PaginatedResultTransactionRequest result = apiInstance.listTransactionRequests(assetPoolId, pageNumber, pageSize)
            .q(q)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling TransactionRequestApi#listTransactionRequests");
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
| **q** | **String**| Query in lucene like format, e.g. reference:REF-12a1. Supported properties: reference, type | [optional] |

### Return type

[**PaginatedResultTransactionRequest**](PaginatedResultTransactionRequest.md)

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

