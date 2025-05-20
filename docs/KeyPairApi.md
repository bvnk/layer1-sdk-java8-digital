# KeyPairApi

All URIs are relative to *https://api.staging.layer1.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createKeyPair**](KeyPairApi.md#createKeyPair) | **POST** /digital/v1/key-pairs | Create key pair |
| [**getKeyPair**](KeyPairApi.md#getKeyPair) | **GET** /digital/v1/key-pairs/{keyPairId} | Get key pair |
| [**listKeyPairs**](KeyPairApi.md#listKeyPairs) | **GET** /digital/v1/key-pairs | List key pairs |


<a id="createKeyPair"></a>
# **createKeyPair**
> KeyPair createKeyPair(createKeyPairRequest).execute();

Create key pair

Creates a new key pair from which different addresses can be created

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.KeyPairApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    KeyPairApi apiInstance = new KeyPairApi(defaultClient);
    CreateKeyPairRequest createKeyPairRequest = new CreateKeyPairRequest(); // CreateKeyPairRequest | 
    try {
      KeyPair result = apiInstance.createKeyPair(createKeyPairRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyPairApi#createKeyPair");
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
| **createKeyPairRequest** | [**CreateKeyPairRequest**](CreateKeyPairRequest.md)|  | |

### Return type

[**KeyPair**](KeyPair.md)

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
| **201** | Created |  -  |
| **0** | Request invalid |  -  |

<a id="getKeyPair"></a>
# **getKeyPair**
> KeyPair getKeyPair(keyPairId).execute();

Get key pair

Retrieve a key pair given id

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.KeyPairApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    KeyPairApi apiInstance = new KeyPairApi(defaultClient);
    UUID keyPairId = UUID.randomUUID(); // UUID | 
    try {
      KeyPair result = apiInstance.getKeyPair(keyPairId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyPairApi#getKeyPair");
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
| **keyPairId** | **UUID**|  | |

### Return type

[**KeyPair**](KeyPair.md)

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
| **200** | Created |  -  |
| **0** | Request invalid |  -  |

<a id="listKeyPairs"></a>
# **listKeyPairs**
> PaginatedResultKeyPair listKeyPairs(assetPoolId, pageNumber, pageSize).execute();

List key pairs

Retrieve paginated list of key-pairs belonging to a asset pool

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.KeyPairApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    KeyPairApi apiInstance = new KeyPairApi(defaultClient);
    UUID assetPoolId = UUID.randomUUID(); // UUID | 
    Integer pageNumber = 0; // Integer | 
    Integer pageSize = 64; // Integer | 
    try {
      PaginatedResultKeyPair result = apiInstance.listKeyPairs(assetPoolId, pageNumber, pageSize)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling KeyPairApi#listKeyPairs");
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
| **assetPoolId** | **UUID**|  | |
| **pageNumber** | **Integer**|  | [default to 0] |
| **pageSize** | **Integer**|  | [default to 64] |

### Return type

[**PaginatedResultKeyPair**](PaginatedResultKeyPair.md)

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
| **200** | Created |  -  |
| **0** | Request invalid |  -  |

