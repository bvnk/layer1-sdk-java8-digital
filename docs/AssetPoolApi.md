# AssetPoolApi

All URIs are relative to *https://api.staging.layer1.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createAssetPool**](AssetPoolApi.md#createAssetPool) | **POST** /digital/v1/asset-pools | Create asset pool |
| [**deleteAssetPool**](AssetPoolApi.md#deleteAssetPool) | **DELETE** /digital/v1/asset-pools/{assetPoolId} | Delete asset pool |
| [**getAssetPool**](AssetPoolApi.md#getAssetPool) | **GET** /digital/v1/asset-pools/{assetPoolId} | Get asset pool |
| [**getAssetPoolBalance**](AssetPoolApi.md#getAssetPoolBalance) | **GET** /digital/v1/asset-pools/{assetPoolId}/balances | Get asset pool balance |
| [**getAssetPoolMaxWithdrawableAmount**](AssetPoolApi.md#getAssetPoolMaxWithdrawableAmount) | **GET** /digital/v1/asset-pools/{assetPoolId}/max-withdrawable-amount | Get max asset pool withdrawable balance |
| [**getAssetPoolSummary**](AssetPoolApi.md#getAssetPoolSummary) | **GET** /digital/v1/asset-pools/summary | Get asset pool summary |
| [**listAssetPools**](AssetPoolApi.md#listAssetPools) | **GET** /digital/v1/asset-pools | List asset pools |
| [**updateAssetPool**](AssetPoolApi.md#updateAssetPool) | **PATCH** /digital/v1/asset-pools/{assetPoolId} | Update asset pool |


<a id="createAssetPool"></a>
# **createAssetPool**
> String createAssetPool(createAssetPoolRequest).execute();

Create asset pool

Creates a new asset pool which serves as a collection of assets

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.AssetPoolApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AssetPoolApi apiInstance = new AssetPoolApi(defaultClient);
    CreateAssetPoolRequest createAssetPoolRequest = new CreateAssetPoolRequest(); // CreateAssetPoolRequest | 
    try {
      String result = apiInstance.createAssetPool(createAssetPoolRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetPoolApi#createAssetPool");
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
| **createAssetPoolRequest** | [**CreateAssetPoolRequest**](CreateAssetPoolRequest.md)|  | |

### Return type

**String**

### Authorization

[httpSignature](../README.md#httpSignature), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **503** | Service Unavailable |  -  |
| **400** | Bad Request |  -  |
| **201** | Created |  -  |
| **404** | Tenant doesn&#39;t exist |  -  |
| **0** | Request invalid |  -  |

<a id="deleteAssetPool"></a>
# **deleteAssetPool**
> deleteAssetPool(assetPoolId).execute();

Delete asset pool

Delete asset pool with given id if it has not addresses nor transactions created

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.AssetPoolApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AssetPoolApi apiInstance = new AssetPoolApi(defaultClient);
    UUID assetPoolId = UUID.randomUUID(); // UUID | 
    try {
      apiInstance.deleteAssetPool(assetPoolId)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetPoolApi#deleteAssetPool");
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

### Return type

null (empty response body)

### Authorization

[httpSignature](../README.md#httpSignature), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **503** | Service Unavailable |  -  |
| **400** | Bad Request |  -  |
| **200** | OK |  -  |
| **412** | If pool is not empty |  -  |
| **0** | Request invalid |  -  |

<a id="getAssetPool"></a>
# **getAssetPool**
> String getAssetPool(assetPoolId).execute();

Get asset pool

Retrieve a specific asset pool given id

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.AssetPoolApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AssetPoolApi apiInstance = new AssetPoolApi(defaultClient);
    UUID assetPoolId = UUID.randomUUID(); // UUID | 
    try {
      String result = apiInstance.getAssetPool(assetPoolId)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetPoolApi#getAssetPool");
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

### Return type

**String**

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

<a id="getAssetPoolBalance"></a>
# **getAssetPoolBalance**
> Balance getAssetPoolBalance(assetPoolId, network, asset).execute();

Get asset pool balance

Retrieve an asset pool balance for specific network and asset

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.AssetPoolApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AssetPoolApi apiInstance = new AssetPoolApi(defaultClient);
    UUID assetPoolId = UUID.randomUUID(); // UUID | 
    String network = "BASE"; // String | 
    String asset = "asset_example"; // String | 
    try {
      Balance result = apiInstance.getAssetPoolBalance(assetPoolId, network, asset)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetPoolApi#getAssetPoolBalance");
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
| **network** | **String**|  | [enum: BASE, BINANCE, BITCOIN, BITCOIN_CASH, DOGECOIN, ETHEREUM, LITECOIN, POLYGON, RIPPLE, SOLANA, TRON] |
| **asset** | **String**|  | |

### Return type

[**Balance**](Balance.md)

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

<a id="getAssetPoolMaxWithdrawableAmount"></a>
# **getAssetPoolMaxWithdrawableAmount**
> Balance getAssetPoolMaxWithdrawableAmount(assetPoolId, network, asset).execute();

Get max asset pool withdrawable balance

Retrieve maximal approximate (does not take fees into account) amount withdrawable for specific network and asset

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.AssetPoolApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AssetPoolApi apiInstance = new AssetPoolApi(defaultClient);
    UUID assetPoolId = UUID.randomUUID(); // UUID | 
    String network = "BASE"; // String | 
    String asset = "asset_example"; // String | 
    try {
      Balance result = apiInstance.getAssetPoolMaxWithdrawableAmount(assetPoolId, network, asset)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetPoolApi#getAssetPoolMaxWithdrawableAmount");
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
| **network** | **String**|  | [enum: BASE, BINANCE, BITCOIN, BITCOIN_CASH, DOGECOIN, ETHEREUM, LITECOIN, POLYGON, RIPPLE, SOLANA, TRON] |
| **asset** | **String**|  | |

### Return type

[**Balance**](Balance.md)

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

<a id="getAssetPoolSummary"></a>
# **getAssetPoolSummary**
> AssetPoolSummary getAssetPoolSummary().execute();

Get asset pool summary

Retrieve authenticated summary across all asset pools.

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.AssetPoolApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AssetPoolApi apiInstance = new AssetPoolApi(defaultClient);
    try {
      AssetPoolSummary result = apiInstance.getAssetPoolSummary()
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetPoolApi#getAssetPoolSummary");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AssetPoolSummary**](AssetPoolSummary.md)

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

<a id="listAssetPools"></a>
# **listAssetPools**
> listAssetPools(pageNumber, pageSize).execute();

List asset pools

Retrieve paginated list of asset pools

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.AssetPoolApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AssetPoolApi apiInstance = new AssetPoolApi(defaultClient);
    Integer pageNumber = 0; // Integer | 
    Integer pageSize = 64; // Integer | 
    try {
      apiInstance.listAssetPools(pageNumber, pageSize)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetPoolApi#listAssetPools");
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
| **pageNumber** | **Integer**|  | [default to 0] |
| **pageSize** | **Integer**|  | [default to 64] |

### Return type

null (empty response body)

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

<a id="updateAssetPool"></a>
# **updateAssetPool**
> String updateAssetPool(assetPoolId, updateAssetPoolRequest).execute();

Update asset pool

Update an asset pool

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.AssetPoolApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    AssetPoolApi apiInstance = new AssetPoolApi(defaultClient);
    UUID assetPoolId = UUID.randomUUID(); // UUID | 
    UpdateAssetPoolRequest updateAssetPoolRequest = new UpdateAssetPoolRequest(); // UpdateAssetPoolRequest | 
    try {
      String result = apiInstance.updateAssetPool(assetPoolId, updateAssetPoolRequest)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling AssetPoolApi#updateAssetPool");
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
| **updateAssetPoolRequest** | [**UpdateAssetPoolRequest**](UpdateAssetPoolRequest.md)|  | |

### Return type

**String**

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

