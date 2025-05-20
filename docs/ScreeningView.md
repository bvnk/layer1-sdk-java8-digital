

# ScreeningView


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**transactionId** | **String** | Unique identifier of the transaction |  [optional] |
|**transactionHash** | **String** | Blockchain transaction hash |  [optional] |
|**transactionStatus** | [**TransactionStatusEnum**](#TransactionStatusEnum) | Current status of the transaction |  [optional] |
|**network** | **String** | Network code used for the transaction |  [optional] |
|**transactionMetadata** | [**TransactionMetadata**](TransactionMetadata.md) | Transaction metadata in JSON format |  [optional] |
|**transactionCreatedAt** | **OffsetDateTime** | Timestamp when the transaction was created |  [optional] |
|**transactionUpdatedAt** | **OffsetDateTime** | Timestamp when the transaction was last updated |  [optional] |
|**screeningState** | [**ScreeningStateEnum**](#ScreeningStateEnum) | Screening state of the transaction |  [optional] |
|**screeningReason** | **String** | Reason for the screening result |  [optional] |
|**screeningReasonCode** | **String** | Reason code for the screening result |  [optional] |
|**screeningCreatedAt** | **OffsetDateTime** | Timestamp when the screening was created |  [optional] |
|**screeningUpdatedAt** | **OffsetDateTime** | Timestamp when the screening was last updated |  [optional] |
|**screeningMetadata** | [**ScreeningMetadata**](ScreeningMetadata.md) | Screening metadata in JSON format |  [optional] |
|**participants** | [**List&lt;Participant&gt;**](Participant.md) | List of participants involved in the transaction |  [optional] |
|**operation** | [**OperationEnum**](#OperationEnum) | Operation type for the screening |  [optional] |
|**addressId** | **UUID** | Unique identifier of the address involved in the screening |  [optional] |



## Enum: TransactionStatusEnum

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



## Enum: ScreeningStateEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;APPROVED&quot; |
| REJECTED | &quot;REJECTED&quot; |
| PENDING_SCREENING | &quot;PENDING_SCREENING&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: OperationEnum

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



