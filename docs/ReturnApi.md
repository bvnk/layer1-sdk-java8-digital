# ReturnApi

All URIs are relative to *https://api.staging.layer1.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createReturnTransactionRequest**](ReturnApi.md#createReturnTransactionRequest) | **POST** /digital/v1/returns | Create return transaction request |


<a id="createReturnTransactionRequest"></a>
# **createReturnTransactionRequest**
> TransactionRequest createReturnTransactionRequest(returnRequest).execute();

Create return transaction request

Create a new blockchain transaction meant to return previously deposited funds

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.ReturnApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ReturnApi apiInstance = new ReturnApi(defaultClient);
    ReturnRequest returnRequest = new ReturnRequest(); // ReturnRequest | 
    try {
      TransactionRequest result = apiInstance.createReturnTransactionRequest(returnRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ReturnApi#createReturnTransactionRequest");
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
| **returnRequest** | [**ReturnRequest**](ReturnRequest.md)|  | |

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

