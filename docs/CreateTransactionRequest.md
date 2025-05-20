

# CreateTransactionRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**assetPoolId** | **UUID** | asset pool id |  [optional] |
|**asset** | **String** | currency |  [optional] |
|**network** | **String** | crypto network |  [optional] |
|**reference** | **String** | custom identifier supplied for transaction that is used to link transaction to specific customer or use case |  [optional] |
|**sources** | [**List&lt;Participant&gt;**](Participant.md) | (Optional) list of addresses and amounts that fund the transaction |  [optional] |
|**destinations** | [**List&lt;Participant&gt;**](Participant.md) | list of recipient addresses and amounts that benefit from the transaction |  [optional] |



