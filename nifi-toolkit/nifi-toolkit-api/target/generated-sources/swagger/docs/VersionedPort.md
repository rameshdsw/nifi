# VersionedPort

## Properties
Name | Type | Description | Notes
------------ | ------------- | ------------- | -------------
**allowRemoteAccess** | **Boolean** | Whether or not this port allows remote access for site-to-site |  [optional]
**comments** | **String** | The user-supplied comments for the component |  [optional]
**componentType** | [**ComponentTypeEnum**](#ComponentTypeEnum) |  |  [optional]
**concurrentlySchedulableTaskCount** | **Integer** | The number of tasks that should be concurrently scheduled for the port. |  [optional]
**groupIdentifier** | **String** | The ID of the Process Group that this component belongs to |  [optional]
**identifier** | **String** | The component&#x27;s unique identifier |  [optional]
**instanceIdentifier** | **String** | The instance ID of an existing component that is described by this VersionedComponent, or null if this is not mapped to an instantiated component |  [optional]
**name** | **String** | The component&#x27;s name |  [optional]
**portFunction** | [**PortFunctionEnum**](#PortFunctionEnum) | Specifies how the Port should function |  [optional]
**position** | [**Position**](Position.md) |  |  [optional]
**scheduledState** | [**ScheduledStateEnum**](#ScheduledStateEnum) | The scheduled state of the component |  [optional]
**type** | [**TypeEnum**](#TypeEnum) | The type of port. |  [optional]

<a name="ComponentTypeEnum"></a>
## Enum: ComponentTypeEnum
Name | Value
---- | -----
CONNECTION | &quot;CONNECTION&quot;
PROCESSOR | &quot;PROCESSOR&quot;
PROCESS_GROUP | &quot;PROCESS_GROUP&quot;
REMOTE_PROCESS_GROUP | &quot;REMOTE_PROCESS_GROUP&quot;
INPUT_PORT | &quot;INPUT_PORT&quot;
OUTPUT_PORT | &quot;OUTPUT_PORT&quot;
REMOTE_INPUT_PORT | &quot;REMOTE_INPUT_PORT&quot;
REMOTE_OUTPUT_PORT | &quot;REMOTE_OUTPUT_PORT&quot;
FUNNEL | &quot;FUNNEL&quot;
LABEL | &quot;LABEL&quot;
CONTROLLER_SERVICE | &quot;CONTROLLER_SERVICE&quot;
REPORTING_TASK | &quot;REPORTING_TASK&quot;
FLOW_ANALYSIS_RULE | &quot;FLOW_ANALYSIS_RULE&quot;
PARAMETER_CONTEXT | &quot;PARAMETER_CONTEXT&quot;
PARAMETER_PROVIDER | &quot;PARAMETER_PROVIDER&quot;
FLOW_REGISTRY_CLIENT | &quot;FLOW_REGISTRY_CLIENT&quot;

<a name="PortFunctionEnum"></a>
## Enum: PortFunctionEnum
Name | Value
---- | -----
STANDARD | &quot;STANDARD&quot;
FAILURE | &quot;FAILURE&quot;

<a name="ScheduledStateEnum"></a>
## Enum: ScheduledStateEnum
Name | Value
---- | -----
ENABLED | &quot;ENABLED&quot;
DISABLED | &quot;DISABLED&quot;
RUNNING | &quot;RUNNING&quot;

<a name="TypeEnum"></a>
## Enum: TypeEnum
Name | Value
---- | -----
INPUT_PORT | &quot;INPUT_PORT&quot;
OUTPUT_PORT | &quot;OUTPUT_PORT&quot;
