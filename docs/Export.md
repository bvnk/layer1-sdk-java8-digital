

# Export


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | Unique identifier of the export |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Current status of the export job |  [optional] |
|**type** | **String** | Export type name |  [optional] |
|**inputParameters** | **Map&lt;String, String&gt;** | JSON string containing input parameters for the job |  [optional] |
|**filename** | **String** | Filename of the resulting export |  [optional] |
|**url** | **String** | URL for file download |  [optional] |
|**createdAt** | **OffsetDateTime** | Timestamp when the export was created |  [optional] |
|**updatedAt** | **OffsetDateTime** | Timestamp when the export was last updated |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PROCESSING | &quot;PROCESSING&quot; |
| COMPLETED | &quot;COMPLETED&quot; |
| FAILED | &quot;FAILED&quot; |
| UNKNOWN_DEFAULT_OPEN_API | &quot;unknown_default_open_api&quot; |



