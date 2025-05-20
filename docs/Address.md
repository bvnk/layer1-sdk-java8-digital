

# Address


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | internal id |  [optional] |
|**address** | **String** | blockchain address |  [optional] |
|**assetPoolId** | **UUID** | asset pool id |  [optional] |
|**network** | **String** | crypto network |  [optional] |
|**keyPairId** | **UUID** | key pair id |  [optional] |
|**reference** | **String** | key pair reference |  [optional] |
|**supportedAssets** | **List&lt;String&gt;** | list of assets supported by network |  [optional] |
|**aliases** | **List&lt;String&gt;** | alternative address (e.g. BTC has segwitt and legacy format) |  [optional] |
|**tag** | **String** | destination tag that serves as optional payment identifier. Only applicable to select networks like Ripple, Solana etc. |  [optional] |
|**balances** | [**List&lt;Balance&gt;**](Balance.md) | address balances |  [optional] |
|**customerId** | **String** | custom non-unique identifier supplied for address that is used to link address to external entity like customer |  [optional] |
|**master** | **Boolean** | flag indicating whether this address is asset pool master address |  [optional] |
|**supportedNetworks** | **List&lt;String&gt;** | list of networks supporting given asset. mutually exclusive with network and supportedAssets |  [optional] |



