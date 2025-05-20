# FeeApi

All URIs are relative to *https://api.staging.layer1.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**estimateTransactionFee**](FeeApi.md#estimateTransactionFee) | **POST** /digital/v1/fee-estimate | Estimate transaction fee |


<a id="estimateTransactionFee"></a>
# **estimateTransactionFee**
> AssetValue estimateTransactionFee(estimateTransactionFeeRequest).execute();

Estimate transaction fee

Estimate fee to send blockchain transaction

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.FeeApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    FeeApi apiInstance = new FeeApi(defaultClient);
    EstimateTransactionFeeRequest estimateTransactionFeeRequest = new EstimateTransactionFeeRequest(); // EstimateTransactionFeeRequest | 
    try {
      AssetValue result = apiInstance.estimateTransactionFee(estimateTransactionFeeRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling FeeApi#estimateTransactionFee");
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
| **estimateTransactionFeeRequest** | [**EstimateTransactionFeeRequest**](EstimateTransactionFeeRequest.md)|  | |

### Return type

[**AssetValue**](AssetValue.md)

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

