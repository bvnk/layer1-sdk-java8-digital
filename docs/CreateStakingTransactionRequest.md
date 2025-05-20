

# CreateStakingTransactionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assetPoolId** | **UUID** | asset pool id |  [optional] |
|**asset** | **String** | currency |  [optional] |
|**network** | **String** | crypto network |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**reference** | **String** | custom identifier supplied for transaction that is used to link transaction to specific customer or use case |  [optional] |
|**address** | **String** | blockchain address |  [optional] |
|**amount** | **Object** |  |  [optional] |
|**metadata** | **Map&lt;String, String&gt;** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| STAKE | &quot;STAKE&quot; |
| UNSTAKE | &quot;UNSTAKE&quot; |
| RELEASE | &quot;RELEASE&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



