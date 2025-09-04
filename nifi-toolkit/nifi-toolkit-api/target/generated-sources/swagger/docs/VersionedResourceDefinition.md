# VersionedResourceDefinition

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**cardinality** | [**CardinalityEnum**](#CardinalityEnum) | The cardinality of the resource |  [optional]
**resourceTypes** | [**List&lt;ResourceTypesEnum&gt;**](#List&lt;ResourceTypesEnum&gt;) | The types of resource that the Property Descriptor is allowed to reference |  [optional]

<a name="CardinalityEnum"></a>
## Enum: CardinalityEnum
Name | Value
---- | -----
SINGLE | &quot;SINGLE&quot;
MULTIPLE | &quot;MULTIPLE&quot;

<a name="List<ResourceTypesEnum>"></a>
## Enum: List&lt;ResourceTypesEnum&gt;
Name | Value
---- | -----
FILE | &quot;FILE&quot;
DIRECTORY | &quot;DIRECTORY&quot;
TEXT | &quot;TEXT&quot;
URL | &quot;URL&quot;
