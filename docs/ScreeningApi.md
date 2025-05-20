# ScreeningApi

All URIs are relative to *https://api.staging.layer1.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listScreenings**](ScreeningApi.md#listScreenings) | **GET** /digital/v1/screenings | List screening results |
| [**manuallyActionHeldTransfer**](ScreeningApi.md#manuallyActionHeldTransfer) | **PUT** /digital/v1/screenings/action | Approve or reject a held transfer. Deposits can be only approved. |


<a id="listScreenings"></a>
# **listScreenings**
> PaginatedScreenings listScreenings(pageNumber, pageSize).hash(hash).operation(operation).state(state).startDate(startDate).endDate(endDate).sort(sort).q(q).execute();

List screening results

Retrieves a paginated list of the most recent transfers along with their screening results.

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.ScreeningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ScreeningApi apiInstance = new ScreeningApi(defaultClient);
    Integer pageNumber = 0; // Integer | 
    Integer pageSize = 16; // Integer | 
    String hash = "hash_example"; // String | Filter by transaction hash
    Set<String> operation = Arrays.asList(); // Set<String> | Set of operations to filter by
    Set<String> state = Arrays.asList(); // Set<String> | Set of screening states to filter by
    OffsetDateTime startDate = OffsetDateTime.now(); // OffsetDateTime | Start date for filtering by transfer creation date
    OffsetDateTime endDate = OffsetDateTime.now(); // OffsetDateTime | End date for filtering by transfer creation date
    String sort = "screeningId.transfer.id.createdAt,desc"; // String | 
    String q = "notReasonCode:DUST_AMOUNT"; // String | Query using Lucene-like syntax. Supported properties: notReasonCode, reasonCode, reason, hash, state, operation, from, to
    try {
      PaginatedScreenings result = apiInstance.listScreenings(pageNumber, pageSize)
            .hash(hash)
            .operation(operation)
            .state(state)
            .startDate(startDate)
            .endDate(endDate)
            .sort(sort)
            .q(q)
            .execute();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling ScreeningApi#listScreenings");
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
| **pageSize** | **Integer**|  | [default to 16] |
| **hash** | **String**| Filter by transaction hash | [optional] |
| **operation** | [**Set&lt;String&gt;**](String.md)| Set of operations to filter by | [optional] [enum: DEPOSIT, WITHDRAWAL, CONSOLIDATION, RETURN, STAKE, UNSTAKE, DELEGATE, UNDELEGATE, RELEASE] |
| **state** | [**Set&lt;String&gt;**](String.md)| Set of screening states to filter by | [optional] [enum: APPROVED, REJECTED, PENDING_SCREENING] |
| **startDate** | **OffsetDateTime**| Start date for filtering by transfer creation date | [optional] |
| **endDate** | **OffsetDateTime**| End date for filtering by transfer creation date | [optional] |
| **sort** | **String**|  | [optional] [default to screeningId.transfer.id.createdAt,desc] |
| **q** | **String**| Query using Lucene-like syntax. Supported properties: notReasonCode, reasonCode, reason, hash, state, operation, from, to | [optional] |

### Return type

[**PaginatedScreenings**](PaginatedScreenings.md)

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
| **200** | List screenings successfully |  -  |
| **0** | Request invalid |  -  |

<a id="manuallyActionHeldTransfer"></a>
# **manuallyActionHeldTransfer**
> manuallyActionHeldTransfer(manualActionRequest).execute();

Approve or reject a held transfer. Deposits can be only approved.

Approves or rejects a held transfer based on the provided transfer ID and the destination address ID.

### Example
```java
// Import classes:
import com.layer1.clients.java8.digital.invoker.ApiClient;
import com.layer1.clients.java8.digital.invoker.ApiException;
import com.layer1.clients.java8.digital.invoker.Configuration;
import com.layer1.clients.java8.digital.invoker.auth.*;
import com.layer1.clients.java8.digital.invoker.models.*;
import com.layer1.clients.java8.digital.api.ScreeningApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("https://api.staging.layer1.com");
    

    // Configure OAuth2 access token for authorization: oauth2
    OAuth oauth2 = (OAuth) defaultClient.getAuthentication("oauth2");
    oauth2.setAccessToken("YOUR ACCESS TOKEN");

    ScreeningApi apiInstance = new ScreeningApi(defaultClient);
    ManualActionRequest manualActionRequest = new ManualActionRequest(); // ManualActionRequest | 
    try {
      apiInstance.manuallyActionHeldTransfer(manualActionRequest)
            .execute();
    } catch (ApiException e) {
      System.err.println("Exception when calling ScreeningApi#manuallyActionHeldTransfer");
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
| **manualActionRequest** | [**ManualActionRequest**](ManualActionRequest.md)|  | |

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
| **400** | Invalid request |  -  |
| **200** | Transfer reviewed successfully |  -  |
| **410** | Withdrawal not found or has already been completed |  -  |
| **0** | Request invalid |  -  |

