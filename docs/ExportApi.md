# ExportApi

All URIs are relative to *https://api.staging.layer1.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createBalanceExport**](ExportApi.md#createBalanceExport) | **POST** /digital/v1/exports | Create a balance export |
| [**getExport**](ExportApi.md#getExport) | **GET** /digital/v1/exports/{id} | Get export with a download link |
| [**getExports**](ExportApi.md#getExports) | **GET** /digital/v1/exports | List all exports |


<a id="createBalanceExport"></a>
# **createBalanceExport**
> createBalanceExport(createBalanceExportRequest).execute();

Create a balance export

Initiates a job to export balance data in the CSV format.

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.ExportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ExportApi apiInstance = new ExportApi(defaultClient);
    CreateBalanceExportRequest createBalanceExportRequest = new CreateBalanceExportRequest(); // CreateBalanceExportRequest | 
    try {
      apiInstance.createBalanceExport(createBalanceExportRequest)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportApi#createBalanceExport");
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
| **createBalanceExportRequest** | [**CreateBalanceExportRequest**](CreateBalanceExportRequest.md)|  | |

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
| **400** | Bad request |  -  |
| **409** | Conflict: Export job is already running for the specified criteria |  -  |
| **201** | Export job created successfully |  -  |
| **0** | Request invalid |  -  |

<a id="getExport"></a>
# **getExport**
> Export getExport(id).execute();

Get export with a download link

Retrieves export details with a short-lived download link by its ID.

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.ExportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ExportApi apiInstance = new ExportApi(defaultClient);
    UUID id = UUID.randomUUID(); // UUID | The ID of the export to retrieve
    try {
      Export result = apiInstance.getExport(id)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportApi#getExport");
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
| **id** | **UUID**| The ID of the export to retrieve | |

### Return type

[**Export**](Export.md)

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
| **200** | Export details |  -  |
| **404** | Export not found |  -  |
| **0** | Request invalid |  -  |

<a id="getExports"></a>
# **getExports**
> List&lt;PaginatedExports&gt; getExports(type, pageNumber, pageSize).execute();

List all exports

Retrieves a paginated list of exports based on type and pagination settings.

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.ExportApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ExportApi apiInstance = new ExportApi(defaultClient);
    Set<String> type = Arrays.asList(); // Set<String> | Filter exports by type
    Integer pageNumber = 0; // Integer | 
    Integer pageSize = 16; // Integer | 
    try {
      List<PaginatedExports> result = apiInstance.getExports(type, pageNumber, pageSize)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ExportApi#getExports");
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
| **type** | [**Set&lt;String&gt;**](String.md)| Filter exports by type | |
| **pageNumber** | **Integer**|  | [default to 0] |
| **pageSize** | **Integer**|  | [default to 16] |

### Return type

[**List&lt;PaginatedExports&gt;**](PaginatedExports.md)

### Authorization

[httpSignature](../README.md#httpSignature), [oauth2](../README.md#oauth2)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **503** | Service Unavailable |  -  |
| **400** | Invalid input |  -  |
| **200** | Paginated list of exports |  -  |
| **0** | Request invalid |  -  |

