

# ManualActionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**action** | [**ActionEnum**](#ActionEnum) | Screening action to execute on the transfer |  |
|**operation** | [**OperationEnum**](#OperationEnum) | Transaction type |  |
|**reason** | **String** | Reason for approving or rejecting the suspended transfer |  |
|**transferId** | **UUID** | Transfer identifier for which screening is performed |  |
|**addressId** | **UUID** | Specific destination address identifier for which screening is performed. Required only for deposits. |  [optional] |



## Enum: ActionEnum

| Name | Value |
|---- | -----|
| APPROVE | &quot;APPROVE&quot; |
| REJECT | &quot;REJECT&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



## Enum: OperationEnum

| Name | Value |
|---- | -----|
| DEPOSIT | &quot;DEPOSIT&quot; |
| WITHDRAWAL | &quot;WITHDRAWAL&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



