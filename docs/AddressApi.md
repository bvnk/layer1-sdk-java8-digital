# AddressApi

All URIs are relative to *https://api.staging.layer1.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAddress**](AddressApi.md#createAddress) | **POST** /digital/v1/addresses | Create a new address |
| [**getAddress**](AddressApi.md#getAddress) | **GET** /digital/v1/addresses/{addressId} | Get address |
| [**listAddresses**](AddressApi.md#listAddresses) | **GET** /digital/v1/addresses | List addresses |
| [**listTags**](AddressApi.md#listTags) | **GET** /digital/v1/addresses/{addressId}/tags | List address tags |
| [**validateAddress**](AddressApi.md#validateAddress) | **POST** /digital/v1/addresses/validate | Validate address |


<a id="createAddress"></a>
# **createAddress**
> Address createAddress(createAddressRequest).execute();

Create a new address

Creates a new address

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.AddressApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AddressApi apiInstance = new AddressApi(defaultClient);
    CreateAddressRequest createAddressRequest = new CreateAddressRequest(); // CreateAddressRequest | 
    try {
      Address result = apiInstance.createAddress(createAddressRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressApi#createAddress");
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
| **createAddressRequest** | [**CreateAddressRequest**](CreateAddressRequest.md)|  | |

### Return type

[**Address**](Address.md)

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
| **202** | Accepted for asynchronous creation |  -  |
| **0** | Request invalid |  -  |

<a id="getAddress"></a>
# **getAddress**
> List&lt;Address&gt; getAddress(addressId).execute();

Get address

Retrieve select address details

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.AddressApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AddressApi apiInstance = new AddressApi(defaultClient);
    UUID addressId = UUID.randomUUID(); // UUID | 
    try {
      List<Address> result = apiInstance.getAddress(addressId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressApi#getAddress");
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
| **addressId** | **UUID**|  | |

### Return type

[**List&lt;Address&gt;**](Address.md)

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

<a id="listAddresses"></a>
# **listAddresses**
> PaginatedResultAddress listAddresses(assetPoolId, pageNumber, pageSize).q(q).execute();

List addresses

Retrieve paginated list of addresses

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.AddressApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AddressApi apiInstance = new AddressApi(defaultClient);
    UUID assetPoolId = UUID.randomUUID(); // UUID | 
    Integer pageNumber = 0; // Integer | 
    Integer pageSize = 64; // Integer | 
    String q = "q_example"; // String | Query in lucene format. Supported fields: reference, customerId
    try {
      PaginatedResultAddress result = apiInstance.listAddresses(assetPoolId, pageNumber, pageSize)
            .q(q)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressApi#listAddresses");
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
| **q** | **String**| Query in lucene format. Supported fields: reference, customerId | [optional] |

### Return type

[**PaginatedResultAddress**](PaginatedResultAddress.md)

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

<a id="listTags"></a>
# **listTags**
> PaginatedResultAddress listTags(addressId, pageNumber, pageSize).execute();

List address tags

Retrieve paginated list of address tags

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.AddressApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AddressApi apiInstance = new AddressApi(defaultClient);
    UUID addressId = UUID.randomUUID(); // UUID | 
    Integer pageNumber = 0; // Integer | 
    Integer pageSize = 64; // Integer | 
    try {
      PaginatedResultAddress result = apiInstance.listTags(addressId, pageNumber, pageSize)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressApi#listTags");
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
| **addressId** | **UUID**|  | |
| **pageNumber** | **Integer**|  | [default to 0] |
| **pageSize** | **Integer**|  | [default to 64] |

### Return type

[**PaginatedResultAddress**](PaginatedResultAddress.md)

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

<a id="validateAddress"></a>
# **validateAddress**
> ValidateAddressResponse validateAddress(validateAddressRequest).execute();

Validate address

Validate a blockchain address

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.AddressApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AddressApi apiInstance = new AddressApi(defaultClient);
    ValidateAddressRequest validateAddressRequest = new ValidateAddressRequest(); // ValidateAddressRequest | 
    try {
      ValidateAddressResponse result = apiInstance.validateAddress(validateAddressRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AddressApi#validateAddress");
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
| **validateAddressRequest** | [**ValidateAddressRequest**](ValidateAddressRequest.md)|  | |

### Return type

[**ValidateAddressResponse**](ValidateAddressResponse.md)

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

