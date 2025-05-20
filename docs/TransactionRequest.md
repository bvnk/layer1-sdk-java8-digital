

# TransactionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**requestId** | **UUID** | transaction request id |  [optional] |
|**asset** | **String** | currency |  [optional] |
|**assetPoolId** | **UUID** | asset pool id |  [optional] |
|**network** | **String** | crypto network |  [optional] |
|**reference** | **String** | custom identifier supplied for transaction that is used to link transaction to specific customer or use case |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | transaction request status |  [optional] |
|**sources** | [**List&lt;Participant&gt;**](Participant.md) | requested list of addresses and amounts that fund the transaction |  [optional] |
|**destinations** | [**List&lt;Participant&gt;**](Participant.md) | requested list of recipient addresses and amounts that benefit from the transaction |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | transaction request type |  [optional] |
|**createdAt** | **OffsetDateTime** | timestamp when transaction request was created |  [optional] |
|**updatedAt** | **OffsetDateTime** | timestamp when transaction request was updated |  [optional] |
|**failure** | [**Failure**](Failure.md) | failure details |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| BLOCKED | &quot;BLOCKED&quot; |
| CONFIRMED | &quot;CONFIRMED&quot; |
| CREATED | &quot;CREATED&quot; |
| DETECTED | &quot;DETECTED&quot; |
| FAILED | &quot;FAILED&quot; |
| FUNDS_RESERVED | &quot;FUNDS_RESERVED&quot; |
| HELD | &quot;HELD&quot; |
| REJECTED | &quot;REJECTED&quot; |
| SCREENING_PASSED | &quot;SCREENING_PASSED&quot; |
| SCREENING_REQUESTED | &quot;SCREENING_REQUESTED&quot; |
| SIGNED | &quot;SIGNED&quot; |
| SUCCESS | &quot;SUCCESS&quot; |
| UNCONFIRMED | &quot;UNCONFIRMED&quot; |
| REPLACED | &quot;REPLACED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DEPOSIT | &quot;DEPOSIT&quot; |
| WITHDRAWAL | &quot;WITHDRAWAL&quot; |
| CONSOLIDATION | &quot;CONSOLIDATION&quot; |
| RETURN | &quot;RETURN&quot; |
| STAKE | &quot;STAKE&quot; |
| UNSTAKE | &quot;UNSTAKE&quot; |
| DELEGATE | &quot;DELEGATE&quot; |
| UNDELEGATE | &quot;UNDELEGATE&quot; |
| RELEASE | &quot;RELEASE&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



