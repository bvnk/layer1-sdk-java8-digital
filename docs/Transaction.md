

# Transaction


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | transaction id |  [optional] |
|**address** | [**Address**](Address.md) | address involved in the transaction |  [optional] |
|**reference** | **String** | custom identifier supplied for transaction that is used to link transaction to specific customer or use case |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | transaction status |  [optional] |
|**sources** | [**List&lt;Participant&gt;**](Participant.md) | list of addresses and amounts that fund the transaction |  [optional] |
|**destinations** | [**List&lt;Participant&gt;**](Participant.md) | list of recipient addresses and amounts that benefit from the transaction |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | transaction type |  [optional] |
|**asset** | **String** | currency |  [optional] |
|**amount** | **Object** |  |  [optional] |
|**hash** | **String** | blockchain transaction hash |  [optional] |
|**networkDetail** | [**NetworkDetail**](NetworkDetail.md) | network details of the transaction |  [optional] |
|**metadata** | [**TransactionMetadata**](TransactionMetadata.md) | metadata about the transaction |  [optional] |
|**createdAt** | **OffsetDateTime** | timestamp when transaction was created |  [optional] |
|**updatedAt** | **OffsetDateTime** | timestamp when transaction was updated |  [optional] |



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



