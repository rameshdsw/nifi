# ParameterProviderDTO

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**affectedComponents** | [**List&lt;AffectedComponentEntity&gt;**](AffectedComponentEntity.md) | The set of all components in the flow that are referencing Parameters provided by this provider |  [optional]
**annotationData** | **String** | The annotation data for the parameter provider. This is how the custom UI relays configuration to the parameter provider. |  [optional]
**bundle** | [**BundleDTO**](BundleDTO.md) |  |  [optional]
**comments** | **String** | The comments of the parameter provider. |  [optional]
**customUiUrl** | **String** | The URL for the custom configuration UI for the parameter provider. |  [optional]
**deprecated** | **Boolean** | Whether the parameter provider has been deprecated. |  [optional]
**descriptors** | [**Map&lt;String, PropertyDescriptorDTO&gt;**](PropertyDescriptorDTO.md) | The descriptors for the parameter providers properties. |  [optional]
**extensionMissing** | **Boolean** | Whether the underlying extension is missing. |  [optional]
**id** | **String** | The id of the component. |  [optional]
**multipleVersionsAvailable** | **Boolean** | Whether the parameter provider has multiple versions available. |  [optional]
**name** | **String** | The name of the parameter provider. |  [optional]
**parameterGroupConfigurations** | [**List&lt;ParameterGroupConfigurationEntity&gt;**](ParameterGroupConfigurationEntity.md) | Configuration for any fetched parameter groups. |  [optional]
**parameterStatus** | [**List&lt;ParameterStatusDTO&gt;**](ParameterStatusDTO.md) | The status of all provided parameters for this parameter provider |  [optional]
**parentGroupId** | **String** | The id of parent process group of this component if applicable. |  [optional]
**persistsState** | **Boolean** | Whether the parameter provider persists state. |  [optional]
**position** | [**PositionDTO**](PositionDTO.md) |  |  [optional]
**properties** | **Map&lt;String, String&gt;** | The properties of the parameter provider. |  [optional]
**referencingParameterContexts** | [**List&lt;ParameterProviderReferencingComponentEntity&gt;**](ParameterProviderReferencingComponentEntity.md) | The Parameter Contexts that reference this Parameter Provider |  [optional]
**restricted** | **Boolean** | Whether the parameter provider requires elevated privileges. |  [optional]
**type** | **String** | The fully qualified type of the parameter provider. |  [optional]
**validationErrors** | **List&lt;String&gt;** | Gets the validation errors from the parameter provider. These validation errors represent the problems with the parameter provider that must be resolved before it can be scheduled to run. |  [optional]
**validationStatus** | [**ValidationStatusEnum**](#ValidationStatusEnum) | Indicates whether the Parameter Provider is valid, invalid, or still in the process of validating (i.e., it is unknown whether or not the Parameter Provider is valid) |  [optional]
**versionedComponentId** | **String** | The ID of the corresponding component that is under version control |  [optional]

<a name="ValidationStatusEnum"></a>
## Enum: ValidationStatusEnum
Name | Value
---- | -----
VALID | &quot;VALID&quot;
INVALID | &quot;INVALID&quot;
VALIDATING | &quot;VALIDATING&quot;
