# NetworkApi

All URIs are relative to *https://api.staging.layer1.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getNetworks**](NetworkApi.md#getNetworks) | **GET** /digital/v1/networks | Get all networks |


<a id="getNetworks"></a>
# **getNetworks**
> List&lt;Network&gt; getNetworks().includeDisabled(includeDisabled).execute();

Get all networks

Get all supported networks and their assets. By default, only enabled networks are returned.

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.NetworkApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    NetworkApi apiInstance = new NetworkApi(defaultClient);
    Boolean includeDisabled = false; // Boolean | Include disabled networks in the response
    try {
      List<Network> result = apiInstance.getNetworks()
            .includeDisabled(includeDisabled)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling NetworkApi#getNetworks");
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
| **includeDisabled** | **Boolean**| Include disabled networks in the response | [optional] [default to false] |

### Return type

[**List&lt;Network&gt;**](Network.md)

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

