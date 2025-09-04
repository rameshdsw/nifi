# FlowApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**activateControllerServices**](FlowApi.md#activateControllerServices) | **PUT** /flow/process-groups/{id}/controller-services | Enable or disable Controller Services in the specified Process Group.
[**downloadReportingTaskSnapshot**](FlowApi.md#downloadReportingTaskSnapshot) | **GET** /flow/reporting-tasks/download | Download a snapshot of the given reporting tasks and any controller services they use
[**generateClientId**](FlowApi.md#generateClientId) | **GET** /flow/client-id | Generates a client id.
[**getAboutInfo**](FlowApi.md#getAboutInfo) | **GET** /flow/about | Retrieves details about this NiFi to put in the About dialog
[**getAction**](FlowApi.md#getAction) | **GET** /flow/history/{id} | Gets an action
[**getAdditionalDetails**](FlowApi.md#getAdditionalDetails) | **GET** /flow/additional-details/{group}/{artifact}/{version}/{type} | Retrieves the additional details for the specified component type.
[**getAllFlowAnalysisResults**](FlowApi.md#getAllFlowAnalysisResults) | **GET** /flow/flow-analysis/results | Returns all flow analysis results currently in effect
[**getBanners**](FlowApi.md#getBanners) | **GET** /flow/banners | Retrieves the banners for this NiFi
[**getBranches**](FlowApi.md#getBranches) | **GET** /flow/registries/{id}/branches | Gets the branches from the specified registry for the current user
[**getBreadcrumbs**](FlowApi.md#getBreadcrumbs) | **GET** /flow/process-groups/{id}/breadcrumbs | Gets the breadcrumbs for a process group
[**getBuckets**](FlowApi.md#getBuckets) | **GET** /flow/registries/{id}/buckets | Gets the buckets from the specified registry for the current user
[**getBulletinBoard**](FlowApi.md#getBulletinBoard) | **GET** /flow/bulletin-board | Gets current bulletins
[**getBulletins**](FlowApi.md#getBulletins) | **GET** /flow/controller/bulletins | Retrieves Controller level bulletins
[**getClusterSummary**](FlowApi.md#getClusterSummary) | **GET** /flow/cluster/summary | The cluster summary for this NiFi
[**getComponentHistory**](FlowApi.md#getComponentHistory) | **GET** /flow/history/components/{componentId} | Gets configuration history for a component
[**getConnectionStatistics**](FlowApi.md#getConnectionStatistics) | **GET** /flow/connections/{id}/statistics | Gets statistics for a connection
[**getConnectionStatus**](FlowApi.md#getConnectionStatus) | **GET** /flow/connections/{id}/status | Gets status for a connection
[**getConnectionStatusHistory**](FlowApi.md#getConnectionStatusHistory) | **GET** /flow/connections/{id}/status/history | Gets the status history for a connection
[**getContentViewers**](FlowApi.md#getContentViewers) | **GET** /flow/content-viewers | Retrieves the registered content viewers
[**getControllerServiceDefinition**](FlowApi.md#getControllerServiceDefinition) | **GET** /flow/controller-service-definition/{group}/{artifact}/{version}/{type} | Retrieves the Controller Service Definition for the specified component type.
[**getControllerServiceTypes**](FlowApi.md#getControllerServiceTypes) | **GET** /flow/controller-service-types | Retrieves the types of controller services that this NiFi supports
[**getControllerServicesFromController**](FlowApi.md#getControllerServicesFromController) | **GET** /flow/controller/controller-services | Gets controller services for reporting tasks
[**getControllerServicesFromGroup**](FlowApi.md#getControllerServicesFromGroup) | **GET** /flow/process-groups/{id}/controller-services | Gets all controller services
[**getControllerStatus**](FlowApi.md#getControllerStatus) | **GET** /flow/status | Gets the current status of this NiFi
[**getCurrentUser**](FlowApi.md#getCurrentUser) | **GET** /flow/current-user | Retrieves the user identity of the user making the request
[**getDetails**](FlowApi.md#getDetails) | **GET** /flow/registries/{registry-id}/buckets/{bucket-id}/flows/{flow-id}/details | Gets the details of a flow from the specified registry and bucket for the specified flow for the current user
[**getFlow**](FlowApi.md#getFlow) | **GET** /flow/process-groups/{id} | Gets a process group
[**getFlowAnalysisResults**](FlowApi.md#getFlowAnalysisResults) | **GET** /flow/flow-analysis/results/{processGroupId} | Returns flow analysis results produced by the analysis of a given process group
[**getFlowAnalysisRuleDefinition**](FlowApi.md#getFlowAnalysisRuleDefinition) | **GET** /flow/flow-analysis-rule-definition/{group}/{artifact}/{version}/{type} | Retrieves the Flow Analysis Rule Definition for the specified component type.
[**getFlowAnalysisRuleTypes**](FlowApi.md#getFlowAnalysisRuleTypes) | **GET** /flow/flow-analysis-rule-types | Retrieves the types of available Flow Analysis Rules
[**getFlowConfig**](FlowApi.md#getFlowConfig) | **GET** /flow/config | Retrieves the configuration for this NiFi flow
[**getFlowMetrics**](FlowApi.md#getFlowMetrics) | **GET** /flow/metrics/{producer} | Gets all metrics for the flow from a particular node
[**getFlows**](FlowApi.md#getFlows) | **GET** /flow/registries/{registry-id}/buckets/{bucket-id}/flows | Gets the flows from the specified registry and bucket for the current user
[**getInputPortStatus**](FlowApi.md#getInputPortStatus) | **GET** /flow/input-ports/{id}/status | Gets status for an input port
[**getOutputPortStatus**](FlowApi.md#getOutputPortStatus) | **GET** /flow/output-ports/{id}/status | Gets status for an output port
[**getParameterContexts**](FlowApi.md#getParameterContexts) | **GET** /flow/parameter-contexts | Gets all Parameter Contexts
[**getParameterProviderDefinition**](FlowApi.md#getParameterProviderDefinition) | **GET** /flow/parameter-provider-definition/{group}/{artifact}/{version}/{type} | Retrieves the Parameter Provider Definition for the specified component type.
[**getParameterProviderTypes**](FlowApi.md#getParameterProviderTypes) | **GET** /flow/parameter-provider-types | Retrieves the types of parameter providers that this NiFi supports
[**getParameterProviders**](FlowApi.md#getParameterProviders) | **GET** /flow/parameter-providers | Gets all parameter providers
[**getPrioritizers**](FlowApi.md#getPrioritizers) | **GET** /flow/prioritizers | Retrieves the types of prioritizers that this NiFi supports
[**getProcessGroupStatus**](FlowApi.md#getProcessGroupStatus) | **GET** /flow/process-groups/{id}/status | Gets the status for a process group
[**getProcessGroupStatusHistory**](FlowApi.md#getProcessGroupStatusHistory) | **GET** /flow/process-groups/{id}/status/history | Gets status history for a remote process group
[**getProcessorDefinition**](FlowApi.md#getProcessorDefinition) | **GET** /flow/processor-definition/{group}/{artifact}/{version}/{type} | Retrieves the Processor Definition for the specified component type.
[**getProcessorStatus**](FlowApi.md#getProcessorStatus) | **GET** /flow/processors/{id}/status | Gets status for a processor
[**getProcessorStatusHistory**](FlowApi.md#getProcessorStatusHistory) | **GET** /flow/processors/{id}/status/history | Gets status history for a processor
[**getProcessorTypes**](FlowApi.md#getProcessorTypes) | **GET** /flow/processor-types | Retrieves the types of processors that this NiFi supports
[**getRegistryClients**](FlowApi.md#getRegistryClients) | **GET** /flow/registries | Gets the listing of available flow registry clients
[**getRemoteProcessGroupStatus**](FlowApi.md#getRemoteProcessGroupStatus) | **GET** /flow/remote-process-groups/{id}/status | Gets status for a remote process group
[**getRemoteProcessGroupStatusHistory**](FlowApi.md#getRemoteProcessGroupStatusHistory) | **GET** /flow/remote-process-groups/{id}/status/history | Gets the status history
[**getReportingTaskDefinition**](FlowApi.md#getReportingTaskDefinition) | **GET** /flow/reporting-task-definition/{group}/{artifact}/{version}/{type} | Retrieves the Reporting Task Definition for the specified component type.
[**getReportingTaskSnapshot**](FlowApi.md#getReportingTaskSnapshot) | **GET** /flow/reporting-tasks/snapshot | Get a snapshot of the given reporting tasks and any controller services they use
[**getReportingTaskTypes**](FlowApi.md#getReportingTaskTypes) | **GET** /flow/reporting-task-types | Retrieves the types of reporting tasks that this NiFi supports
[**getReportingTasks**](FlowApi.md#getReportingTasks) | **GET** /flow/reporting-tasks | Gets all reporting tasks
[**getRuntimeManifest**](FlowApi.md#getRuntimeManifest) | **GET** /flow/runtime-manifest | Retrieves the runtime manifest for this NiFi instance.
[**getVersionDifferences**](FlowApi.md#getVersionDifferences) | **GET** /flow/registries/{registry-id}/branches/{branch-id-a}/buckets/{bucket-id-a}/flows/{flow-id-a}/{version-a}/diff/branches/{branch-id-b}/buckets/{bucket-id-b}/flows/{flow-id-b}/{version-b} | Gets the differences between two versions of the same versioned flow, the basis of the comparison will be the first version
[**getVersions**](FlowApi.md#getVersions) | **GET** /flow/registries/{registry-id}/buckets/{bucket-id}/flows/{flow-id}/versions | Gets the flow versions from the specified registry and bucket for the specified flow for the current user
[**queryHistory**](FlowApi.md#queryHistory) | **GET** /flow/history | Gets configuration history
[**scheduleComponents**](FlowApi.md#scheduleComponents) | **PUT** /flow/process-groups/{id} | Schedule or unschedule components in the specified Process Group.
[**searchCluster**](FlowApi.md#searchCluster) | **GET** /flow/cluster/search-results | Searches the cluster for a node with the specified address
[**searchFlow**](FlowApi.md#searchFlow) | **GET** /flow/search-results | Performs a search against this NiFi using the specified search term

<a name="activateControllerServices"></a>
# **activateControllerServices**
> ActivateControllerServicesEntity activateControllerServices(body, id)

Enable or disable Controller Services in the specified Process Group.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
ActivateControllerServicesEntity body = new ActivateControllerServicesEntity(); // ActivateControllerServicesEntity | The request to schedule or unschedule. If the comopnents in the request are not specified, all authorized components will be considered.
String id = "id_example"; // String | The process group id.
try {
    ActivateControllerServicesEntity result = apiInstance.activateControllerServices(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#activateControllerServices");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ActivateControllerServicesEntity**](ActivateControllerServicesEntity.md)| The request to schedule or unschedule. If the comopnents in the request are not specified, all authorized components will be considered. |
 **id** | **String**| The process group id. |

### Return type

[**ActivateControllerServicesEntity**](ActivateControllerServicesEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="downloadReportingTaskSnapshot"></a>
# **downloadReportingTaskSnapshot**
> byte[] downloadReportingTaskSnapshot(reportingTaskId)

Download a snapshot of the given reporting tasks and any controller services they use

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String reportingTaskId = "reportingTaskId_example"; // String | Specifies a reporting task id to export. If not specified, all reporting tasks will be exported.
try {
    byte[] result = apiInstance.downloadReportingTaskSnapshot(reportingTaskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#downloadReportingTaskSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportingTaskId** | **String**| Specifies a reporting task id to export. If not specified, all reporting tasks will be exported. | [optional]

### Return type

**byte[]**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="generateClientId"></a>
# **generateClientId**
> String generateClientId()

Generates a client id.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
try {
    String result = apiInstance.generateClientId();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#generateClientId");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

<a name="getAboutInfo"></a>
# **getAboutInfo**
> AboutEntity getAboutInfo()

Retrieves details about this NiFi to put in the About dialog

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
try {
    AboutEntity result = apiInstance.getAboutInfo();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getAboutInfo");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AboutEntity**](AboutEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAction"></a>
# **getAction**
> ActionEntity getAction(id)

Gets an action

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
IntegerParameter id = new IntegerParameter(); // IntegerParameter | The action id.
try {
    ActionEntity result = apiInstance.getAction(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getAction");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**IntegerParameter**](.md)| The action id. |

### Return type

[**ActionEntity**](ActionEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAdditionalDetails"></a>
# **getAdditionalDetails**
> AdditionalDetailsEntity getAdditionalDetails(group, artifact, version, type)

Retrieves the additional details for the specified component type.

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String group = "group_example"; // String | The bundle group
String artifact = "artifact_example"; // String | The bundle artifact
String version = "version_example"; // String | The bundle version
String type = "type_example"; // String | The processor type
try {
    AdditionalDetailsEntity result = apiInstance.getAdditionalDetails(group, artifact, version, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getAdditionalDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| The bundle group |
 **artifact** | **String**| The bundle artifact |
 **version** | **String**| The bundle version |
 **type** | **String**| The processor type |

### Return type

[**AdditionalDetailsEntity**](AdditionalDetailsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getAllFlowAnalysisResults"></a>
# **getAllFlowAnalysisResults**
> FlowAnalysisResultEntity getAllFlowAnalysisResults()

Returns all flow analysis results currently in effect

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
try {
    FlowAnalysisResultEntity result = apiInstance.getAllFlowAnalysisResults();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getAllFlowAnalysisResults");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FlowAnalysisResultEntity**](FlowAnalysisResultEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBanners"></a>
# **getBanners**
> BannerEntity getBanners()

Retrieves the banners for this NiFi

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
try {
    BannerEntity result = apiInstance.getBanners();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getBanners");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**BannerEntity**](BannerEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBranches"></a>
# **getBranches**
> FlowRegistryBranchesEntity getBranches(id)

Gets the branches from the specified registry for the current user

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The registry id.
try {
    FlowRegistryBranchesEntity result = apiInstance.getBranches(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getBranches");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The registry id. |

### Return type

[**FlowRegistryBranchesEntity**](FlowRegistryBranchesEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBreadcrumbs"></a>
# **getBreadcrumbs**
> FlowBreadcrumbEntity getBreadcrumbs(id)

Gets the breadcrumbs for a process group

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The process group id.
try {
    FlowBreadcrumbEntity result = apiInstance.getBreadcrumbs(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getBreadcrumbs");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**FlowBreadcrumbEntity**](FlowBreadcrumbEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBuckets"></a>
# **getBuckets**
> FlowRegistryBucketsEntity getBuckets(id, branch)

Gets the buckets from the specified registry for the current user

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The registry id.
String branch = "branch_example"; // String | The name of a branch to get the buckets from. If not specified the default branch of the registry client will be used.
try {
    FlowRegistryBucketsEntity result = apiInstance.getBuckets(id, branch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getBuckets");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The registry id. |
 **branch** | **String**| The name of a branch to get the buckets from. If not specified the default branch of the registry client will be used. | [optional]

### Return type

[**FlowRegistryBucketsEntity**](FlowRegistryBucketsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBulletinBoard"></a>
# **getBulletinBoard**
> BulletinBoardEntity getBulletinBoard(after, sourceName, message, sourceId, groupId, limit)

Gets current bulletins

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
LongParameter after = new LongParameter(); // LongParameter | Includes bulletins with an id after this value.
BulletinBoardPatternParameter sourceName = new BulletinBoardPatternParameter(); // BulletinBoardPatternParameter | Includes bulletins originating from this sources whose name match this regular expression.
BulletinBoardPatternParameter message = new BulletinBoardPatternParameter(); // BulletinBoardPatternParameter | Includes bulletins whose message that match this regular expression.
BulletinBoardPatternParameter sourceId = new BulletinBoardPatternParameter(); // BulletinBoardPatternParameter | Includes bulletins originating from this sources whose id match this regular expression.
BulletinBoardPatternParameter groupId = new BulletinBoardPatternParameter(); // BulletinBoardPatternParameter | Includes bulletins originating from this sources whose group id match this regular expression.
IntegerParameter limit = new IntegerParameter(); // IntegerParameter | The number of bulletins to limit the response to.
try {
    BulletinBoardEntity result = apiInstance.getBulletinBoard(after, sourceName, message, sourceId, groupId, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getBulletinBoard");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **after** | [**LongParameter**](.md)| Includes bulletins with an id after this value. | [optional]
 **sourceName** | [**BulletinBoardPatternParameter**](.md)| Includes bulletins originating from this sources whose name match this regular expression. | [optional]
 **message** | [**BulletinBoardPatternParameter**](.md)| Includes bulletins whose message that match this regular expression. | [optional]
 **sourceId** | [**BulletinBoardPatternParameter**](.md)| Includes bulletins originating from this sources whose id match this regular expression. | [optional]
 **groupId** | [**BulletinBoardPatternParameter**](.md)| Includes bulletins originating from this sources whose group id match this regular expression. | [optional]
 **limit** | [**IntegerParameter**](.md)| The number of bulletins to limit the response to. | [optional]

### Return type

[**BulletinBoardEntity**](BulletinBoardEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getBulletins"></a>
# **getBulletins**
> ControllerBulletinsEntity getBulletins()

Retrieves Controller level bulletins

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
try {
    ControllerBulletinsEntity result = apiInstance.getBulletins();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getBulletins");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ControllerBulletinsEntity**](ControllerBulletinsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getClusterSummary"></a>
# **getClusterSummary**
> ClusterSummaryEntity getClusterSummary()

The cluster summary for this NiFi

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
try {
    ClusterSummaryEntity result = apiInstance.getClusterSummary();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getClusterSummary");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ClusterSummaryEntity**](ClusterSummaryEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getComponentHistory"></a>
# **getComponentHistory**
> ComponentHistoryEntity getComponentHistory(componentId)

Gets configuration history for a component

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String componentId = "componentId_example"; // String | The component id.
try {
    ComponentHistoryEntity result = apiInstance.getComponentHistory(componentId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getComponentHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentId** | **String**| The component id. |

### Return type

[**ComponentHistoryEntity**](ComponentHistoryEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnectionStatistics"></a>
# **getConnectionStatistics**
> ConnectionStatisticsEntity getConnectionStatistics(id, nodewise, clusterNodeId)

Gets statistics for a connection

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The connection id.
Boolean nodewise = false; // Boolean | Whether or not to include the breakdown per node. Optional, defaults to false
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where to get the statistics.
try {
    ConnectionStatisticsEntity result = apiInstance.getConnectionStatistics(id, nodewise, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getConnectionStatistics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connection id. |
 **nodewise** | **Boolean**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional] [default to false]
 **clusterNodeId** | **String**| The id of the node where to get the statistics. | [optional]

### Return type

[**ConnectionStatisticsEntity**](ConnectionStatisticsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnectionStatus"></a>
# **getConnectionStatus**
> ConnectionStatusEntity getConnectionStatus(id, nodewise, clusterNodeId)

Gets status for a connection

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The connection id.
Boolean nodewise = false; // Boolean | Whether or not to include the breakdown per node. Optional, defaults to false
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where to get the status.
try {
    ConnectionStatusEntity result = apiInstance.getConnectionStatus(id, nodewise, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getConnectionStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connection id. |
 **nodewise** | **Boolean**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional] [default to false]
 **clusterNodeId** | **String**| The id of the node where to get the status. | [optional]

### Return type

[**ConnectionStatusEntity**](ConnectionStatusEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getConnectionStatusHistory"></a>
# **getConnectionStatusHistory**
> StatusHistoryEntity getConnectionStatusHistory(id)

Gets the status history for a connection

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The connection id.
try {
    StatusHistoryEntity result = apiInstance.getConnectionStatusHistory(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getConnectionStatusHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The connection id. |

### Return type

[**StatusHistoryEntity**](StatusHistoryEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getContentViewers"></a>
# **getContentViewers**
> ContentViewerEntity getContentViewers()

Retrieves the registered content viewers

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
try {
    ContentViewerEntity result = apiInstance.getContentViewers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getContentViewers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ContentViewerEntity**](ContentViewerEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getControllerServiceDefinition"></a>
# **getControllerServiceDefinition**
> ControllerServiceDefinition getControllerServiceDefinition(group, artifact, version, type)

Retrieves the Controller Service Definition for the specified component type.

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String group = "group_example"; // String | The bundle group
String artifact = "artifact_example"; // String | The bundle artifact
String version = "version_example"; // String | The bundle version
String type = "type_example"; // String | The controller service type
try {
    ControllerServiceDefinition result = apiInstance.getControllerServiceDefinition(group, artifact, version, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getControllerServiceDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| The bundle group |
 **artifact** | **String**| The bundle artifact |
 **version** | **String**| The bundle version |
 **type** | **String**| The controller service type |

### Return type

[**ControllerServiceDefinition**](ControllerServiceDefinition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getControllerServiceTypes"></a>
# **getControllerServiceTypes**
> ControllerServiceTypesEntity getControllerServiceTypes(serviceType, serviceBundleGroup, serviceBundleArtifact, serviceBundleVersion, bundleGroupFilter, bundleArtifactFilter, typeFilter)

Retrieves the types of controller services that this NiFi supports

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String serviceType = "serviceType_example"; // String | If specified, will only return controller services that are compatible with this type of service.
String serviceBundleGroup = "serviceBundleGroup_example"; // String | If serviceType specified, is the bundle group of the serviceType.
String serviceBundleArtifact = "serviceBundleArtifact_example"; // String | If serviceType specified, is the bundle artifact of the serviceType.
String serviceBundleVersion = "serviceBundleVersion_example"; // String | If serviceType specified, is the bundle version of the serviceType.
String bundleGroupFilter = "bundleGroupFilter_example"; // String | If specified, will only return types that are a member of this bundle group.
String bundleArtifactFilter = "bundleArtifactFilter_example"; // String | If specified, will only return types that are a member of this bundle artifact.
String typeFilter = "typeFilter_example"; // String | If specified, will only return types whose fully qualified classname matches.
try {
    ControllerServiceTypesEntity result = apiInstance.getControllerServiceTypes(serviceType, serviceBundleGroup, serviceBundleArtifact, serviceBundleVersion, bundleGroupFilter, bundleArtifactFilter, typeFilter);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getControllerServiceTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **serviceType** | **String**| If specified, will only return controller services that are compatible with this type of service. | [optional]
 **serviceBundleGroup** | **String**| If serviceType specified, is the bundle group of the serviceType. | [optional]
 **serviceBundleArtifact** | **String**| If serviceType specified, is the bundle artifact of the serviceType. | [optional]
 **serviceBundleVersion** | **String**| If serviceType specified, is the bundle version of the serviceType. | [optional]
 **bundleGroupFilter** | **String**| If specified, will only return types that are a member of this bundle group. | [optional]
 **bundleArtifactFilter** | **String**| If specified, will only return types that are a member of this bundle artifact. | [optional]
 **typeFilter** | **String**| If specified, will only return types whose fully qualified classname matches. | [optional]

### Return type

[**ControllerServiceTypesEntity**](ControllerServiceTypesEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getControllerServicesFromController"></a>
# **getControllerServicesFromController**
> ControllerServicesEntity getControllerServicesFromController(uiOnly, includeReferencingComponents)

Gets controller services for reporting tasks

If the uiOnly query parameter is provided with a value of true, the returned entity may only contain fields that are necessary for rendering the NiFi User Interface. As such, the selected fields may change at any time, even during incremental releases, without warning. As a result, this parameter should not be provided by any client other than the UI.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
Boolean uiOnly = false; // Boolean | 
Boolean includeReferencingComponents = true; // Boolean | Whether or not to include services' referencing components in the response
try {
    ControllerServicesEntity result = apiInstance.getControllerServicesFromController(uiOnly, includeReferencingComponents);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getControllerServicesFromController");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **uiOnly** | **Boolean**|  | [optional] [default to false]
 **includeReferencingComponents** | **Boolean**| Whether or not to include services&#x27; referencing components in the response | [optional] [default to true]

### Return type

[**ControllerServicesEntity**](ControllerServicesEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getControllerServicesFromGroup"></a>
# **getControllerServicesFromGroup**
> ControllerServicesEntity getControllerServicesFromGroup(id, includeAncestorGroups, includeDescendantGroups, includeReferencingComponents, uiOnly)

Gets all controller services

If the uiOnly query parameter is provided with a value of true, the returned entity may only contain fields that are necessary for rendering the NiFi User Interface. As such, the selected fields may change at any time, even during incremental releases, without warning. As a result, this parameter should not be provided by any client other than the UI.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The process group id.
Boolean includeAncestorGroups = true; // Boolean | Whether or not to include parent/ancestor process groups
Boolean includeDescendantGroups = false; // Boolean | Whether or not to include descendant process groups
Boolean includeReferencingComponents = true; // Boolean | Whether or not to include services' referencing components in the response
Boolean uiOnly = false; // Boolean | 
try {
    ControllerServicesEntity result = apiInstance.getControllerServicesFromGroup(id, includeAncestorGroups, includeDescendantGroups, includeReferencingComponents, uiOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getControllerServicesFromGroup");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **includeAncestorGroups** | **Boolean**| Whether or not to include parent/ancestor process groups | [optional] [default to true]
 **includeDescendantGroups** | **Boolean**| Whether or not to include descendant process groups | [optional] [default to false]
 **includeReferencingComponents** | **Boolean**| Whether or not to include services&#x27; referencing components in the response | [optional] [default to true]
 **uiOnly** | **Boolean**|  | [optional] [default to false]

### Return type

[**ControllerServicesEntity**](ControllerServicesEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getControllerStatus"></a>
# **getControllerStatus**
> ControllerStatusEntity getControllerStatus()

Gets the current status of this NiFi

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
try {
    ControllerStatusEntity result = apiInstance.getControllerStatus();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getControllerStatus");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ControllerStatusEntity**](ControllerStatusEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getCurrentUser"></a>
# **getCurrentUser**
> CurrentUserEntity getCurrentUser()

Retrieves the user identity of the user making the request

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
try {
    CurrentUserEntity result = apiInstance.getCurrentUser();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getCurrentUser");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**CurrentUserEntity**](CurrentUserEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getDetails"></a>
# **getDetails**
> VersionedFlowEntity getDetails(registryId, bucketId, flowId, branch)

Gets the details of a flow from the specified registry and bucket for the specified flow for the current user

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String registryId = "registryId_example"; // String | The registry client id.
String bucketId = "bucketId_example"; // String | The bucket id.
String flowId = "flowId_example"; // String | The flow id.
String branch = "branch_example"; // String | The name of a branch to get the flow from. If not specified the default branch of the registry client will be used.
try {
    VersionedFlowEntity result = apiInstance.getDetails(registryId, bucketId, flowId, branch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registryId** | **String**| The registry client id. |
 **bucketId** | **String**| The bucket id. |
 **flowId** | **String**| The flow id. |
 **branch** | **String**| The name of a branch to get the flow from. If not specified the default branch of the registry client will be used. | [optional]

### Return type

[**VersionedFlowEntity**](VersionedFlowEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlow"></a>
# **getFlow**
> ProcessGroupFlowEntity getFlow(id, uiOnly)

Gets a process group

If the uiOnly query parameter is provided with a value of true, the returned entity may only contain fields that are necessary for rendering the NiFi User Interface. As such, the selected fields may change at any time, even during incremental releases, without warning. As a result, this parameter should not be provided by any client other than the UI.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The process group id.
Boolean uiOnly = false; // Boolean | 
try {
    ProcessGroupFlowEntity result = apiInstance.getFlow(id, uiOnly);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **uiOnly** | **Boolean**|  | [optional] [default to false]

### Return type

[**ProcessGroupFlowEntity**](ProcessGroupFlowEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlowAnalysisResults"></a>
# **getFlowAnalysisResults**
> FlowAnalysisResultEntity getFlowAnalysisResults(processGroupId)

Returns flow analysis results produced by the analysis of a given process group

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String processGroupId = "processGroupId_example"; // String | The id of the process group representing (a part of) the flow to be analyzed.
try {
    FlowAnalysisResultEntity result = apiInstance.getFlowAnalysisResults(processGroupId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getFlowAnalysisResults");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **processGroupId** | **String**| The id of the process group representing (a part of) the flow to be analyzed. |

### Return type

[**FlowAnalysisResultEntity**](FlowAnalysisResultEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlowAnalysisRuleDefinition"></a>
# **getFlowAnalysisRuleDefinition**
> FlowAnalysisRuleDefinition getFlowAnalysisRuleDefinition(group, artifact, version, type)

Retrieves the Flow Analysis Rule Definition for the specified component type.

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String group = "group_example"; // String | The bundle group
String artifact = "artifact_example"; // String | The bundle artifact
String version = "version_example"; // String | The bundle version
String type = "type_example"; // String | The flow analysis rule type
try {
    FlowAnalysisRuleDefinition result = apiInstance.getFlowAnalysisRuleDefinition(group, artifact, version, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getFlowAnalysisRuleDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| The bundle group |
 **artifact** | **String**| The bundle artifact |
 **version** | **String**| The bundle version |
 **type** | **String**| The flow analysis rule type |

### Return type

[**FlowAnalysisRuleDefinition**](FlowAnalysisRuleDefinition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlowAnalysisRuleTypes"></a>
# **getFlowAnalysisRuleTypes**
> FlowAnalysisRuleTypesEntity getFlowAnalysisRuleTypes(bundleGroupFilter, bundleArtifactFilter, type)

Retrieves the types of available Flow Analysis Rules

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String bundleGroupFilter = "bundleGroupFilter_example"; // String | If specified, will only return types that are a member of this bundle group.
String bundleArtifactFilter = "bundleArtifactFilter_example"; // String | If specified, will only return types that are a member of this bundle artifact.
String type = "type_example"; // String | If specified, will only return types whose fully qualified classname matches.
try {
    FlowAnalysisRuleTypesEntity result = apiInstance.getFlowAnalysisRuleTypes(bundleGroupFilter, bundleArtifactFilter, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getFlowAnalysisRuleTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundleGroupFilter** | **String**| If specified, will only return types that are a member of this bundle group. | [optional]
 **bundleArtifactFilter** | **String**| If specified, will only return types that are a member of this bundle artifact. | [optional]
 **type** | **String**| If specified, will only return types whose fully qualified classname matches. | [optional]

### Return type

[**FlowAnalysisRuleTypesEntity**](FlowAnalysisRuleTypesEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlowConfig"></a>
# **getFlowConfig**
> FlowConfigurationEntity getFlowConfig()

Retrieves the configuration for this NiFi flow

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
try {
    FlowConfigurationEntity result = apiInstance.getFlowConfig();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getFlowConfig");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FlowConfigurationEntity**](FlowConfigurationEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getFlowMetrics"></a>
# **getFlowMetrics**
> StreamingOutput getFlowMetrics(producer, includedRegistries, sampleName, sampleLabelValue, rootFieldName)

Gets all metrics for the flow from a particular node

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String producer = "producer_example"; // String | The producer for flow file metrics. Each producer may have its own output format.
List<String> includedRegistries = Arrays.asList("includedRegistries_example"); // List<String> | Set of included metrics registries. Duplicate the parameter to include multiple registries. All registries are included by default.
String sampleName = "sampleName_example"; // String | Regular Expression Pattern to be applied against the sample name field
String sampleLabelValue = "sampleLabelValue_example"; // String | Regular Expression Pattern to be applied against the sample label value field
String rootFieldName = "rootFieldName_example"; // String | Name of the first field of JSON object. Applicable for JSON producer only.
try {
    StreamingOutput result = apiInstance.getFlowMetrics(producer, includedRegistries, sampleName, sampleLabelValue, rootFieldName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getFlowMetrics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **producer** | **String**| The producer for flow file metrics. Each producer may have its own output format. | [enum: prometheus, json]
 **includedRegistries** | [**List&lt;String&gt;**](String.md)| Set of included metrics registries. Duplicate the parameter to include multiple registries. All registries are included by default. | [optional] [enum: NIFI, JVM, BULLETIN, CONNECTION, CLUSTER, NIFI, JVM, BULLETIN, CONNECTION, CLUSTER]
 **sampleName** | **String**| Regular Expression Pattern to be applied against the sample name field | [optional]
 **sampleLabelValue** | **String**| Regular Expression Pattern to be applied against the sample label value field | [optional]
 **rootFieldName** | **String**| Name of the first field of JSON object. Applicable for JSON producer only. | [optional]

### Return type

[**StreamingOutput**](StreamingOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getFlows"></a>
# **getFlows**
> VersionedFlowsEntity getFlows(registryId, bucketId, branch)

Gets the flows from the specified registry and bucket for the current user

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String registryId = "registryId_example"; // String | The registry client id.
String bucketId = "bucketId_example"; // String | The bucket id.
String branch = "branch_example"; // String | The name of a branch to get the flows from. If not specified the default branch of the registry client will be used.
try {
    VersionedFlowsEntity result = apiInstance.getFlows(registryId, bucketId, branch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getFlows");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registryId** | **String**| The registry client id. |
 **bucketId** | **String**| The bucket id. |
 **branch** | **String**| The name of a branch to get the flows from. If not specified the default branch of the registry client will be used. | [optional]

### Return type

[**VersionedFlowsEntity**](VersionedFlowsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getInputPortStatus"></a>
# **getInputPortStatus**
> PortStatusEntity getInputPortStatus(id, nodewise, clusterNodeId)

Gets status for an input port

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The input port id.
Boolean nodewise = false; // Boolean | Whether or not to include the breakdown per node. Optional, defaults to false
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where to get the status.
try {
    PortStatusEntity result = apiInstance.getInputPortStatus(id, nodewise, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getInputPortStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The input port id. |
 **nodewise** | **Boolean**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional] [default to false]
 **clusterNodeId** | **String**| The id of the node where to get the status. | [optional]

### Return type

[**PortStatusEntity**](PortStatusEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOutputPortStatus"></a>
# **getOutputPortStatus**
> PortStatusEntity getOutputPortStatus(id, nodewise, clusterNodeId)

Gets status for an output port

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The output port id.
Boolean nodewise = false; // Boolean | Whether or not to include the breakdown per node. Optional, defaults to false
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where to get the status.
try {
    PortStatusEntity result = apiInstance.getOutputPortStatus(id, nodewise, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getOutputPortStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The output port id. |
 **nodewise** | **Boolean**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional] [default to false]
 **clusterNodeId** | **String**| The id of the node where to get the status. | [optional]

### Return type

[**PortStatusEntity**](PortStatusEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getParameterContexts"></a>
# **getParameterContexts**
> ParameterContextsEntity getParameterContexts()

Gets all Parameter Contexts

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
try {
    ParameterContextsEntity result = apiInstance.getParameterContexts();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getParameterContexts");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ParameterContextsEntity**](ParameterContextsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getParameterProviderDefinition"></a>
# **getParameterProviderDefinition**
> ParameterProviderDefinition getParameterProviderDefinition(group, artifact, version, type)

Retrieves the Parameter Provider Definition for the specified component type.

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String group = "group_example"; // String | The bundle group
String artifact = "artifact_example"; // String | The bundle artifact
String version = "version_example"; // String | The bundle version
String type = "type_example"; // String | The parameter provider type
try {
    ParameterProviderDefinition result = apiInstance.getParameterProviderDefinition(group, artifact, version, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getParameterProviderDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| The bundle group |
 **artifact** | **String**| The bundle artifact |
 **version** | **String**| The bundle version |
 **type** | **String**| The parameter provider type |

### Return type

[**ParameterProviderDefinition**](ParameterProviderDefinition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getParameterProviderTypes"></a>
# **getParameterProviderTypes**
> ParameterProviderTypesEntity getParameterProviderTypes(bundleGroupFilter, bundleArtifactFilter, type)

Retrieves the types of parameter providers that this NiFi supports

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String bundleGroupFilter = "bundleGroupFilter_example"; // String | If specified, will only return types that are a member of this bundle group.
String bundleArtifactFilter = "bundleArtifactFilter_example"; // String | If specified, will only return types that are a member of this bundle artifact.
String type = "type_example"; // String | If specified, will only return types whose fully qualified classname matches.
try {
    ParameterProviderTypesEntity result = apiInstance.getParameterProviderTypes(bundleGroupFilter, bundleArtifactFilter, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getParameterProviderTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundleGroupFilter** | **String**| If specified, will only return types that are a member of this bundle group. | [optional]
 **bundleArtifactFilter** | **String**| If specified, will only return types that are a member of this bundle artifact. | [optional]
 **type** | **String**| If specified, will only return types whose fully qualified classname matches. | [optional]

### Return type

[**ParameterProviderTypesEntity**](ParameterProviderTypesEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getParameterProviders"></a>
# **getParameterProviders**
> ParameterProvidersEntity getParameterProviders()

Gets all parameter providers

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
try {
    ParameterProvidersEntity result = apiInstance.getParameterProviders();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getParameterProviders");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ParameterProvidersEntity**](ParameterProvidersEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPrioritizers"></a>
# **getPrioritizers**
> PrioritizerTypesEntity getPrioritizers()

Retrieves the types of prioritizers that this NiFi supports

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
try {
    PrioritizerTypesEntity result = apiInstance.getPrioritizers();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getPrioritizers");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**PrioritizerTypesEntity**](PrioritizerTypesEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProcessGroupStatus"></a>
# **getProcessGroupStatus**
> ProcessGroupStatusEntity getProcessGroupStatus(id, recursive, nodewise, clusterNodeId)

Gets the status for a process group

The status for a process group includes status for all descendent components. When invoked on the root group with recursive set to true, it will return the current status of every component in the flow.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The process group id.
Boolean recursive = false; // Boolean | Whether all descendant groups and the status of their content will be included. Optional, defaults to false
Boolean nodewise = false; // Boolean | Whether or not to include the breakdown per node. Optional, defaults to false
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where to get the status.
try {
    ProcessGroupStatusEntity result = apiInstance.getProcessGroupStatus(id, recursive, nodewise, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getProcessGroupStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |
 **recursive** | **Boolean**| Whether all descendant groups and the status of their content will be included. Optional, defaults to false | [optional] [default to false]
 **nodewise** | **Boolean**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional] [default to false]
 **clusterNodeId** | **String**| The id of the node where to get the status. | [optional]

### Return type

[**ProcessGroupStatusEntity**](ProcessGroupStatusEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProcessGroupStatusHistory"></a>
# **getProcessGroupStatusHistory**
> StatusHistoryEntity getProcessGroupStatusHistory(id)

Gets status history for a remote process group

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The process group id.
try {
    StatusHistoryEntity result = apiInstance.getProcessGroupStatusHistory(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getProcessGroupStatusHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The process group id. |

### Return type

[**StatusHistoryEntity**](StatusHistoryEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProcessorDefinition"></a>
# **getProcessorDefinition**
> ProcessorDefinition getProcessorDefinition(group, artifact, version, type)

Retrieves the Processor Definition for the specified component type.

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String group = "group_example"; // String | The bundle group
String artifact = "artifact_example"; // String | The bundle artifact
String version = "version_example"; // String | The bundle version
String type = "type_example"; // String | The processor type
try {
    ProcessorDefinition result = apiInstance.getProcessorDefinition(group, artifact, version, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getProcessorDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| The bundle group |
 **artifact** | **String**| The bundle artifact |
 **version** | **String**| The bundle version |
 **type** | **String**| The processor type |

### Return type

[**ProcessorDefinition**](ProcessorDefinition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProcessorStatus"></a>
# **getProcessorStatus**
> ProcessorStatusEntity getProcessorStatus(id, nodewise, clusterNodeId)

Gets status for a processor

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The processor id.
Boolean nodewise = false; // Boolean | Whether or not to include the breakdown per node. Optional, defaults to false
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where to get the status.
try {
    ProcessorStatusEntity result = apiInstance.getProcessorStatus(id, nodewise, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getProcessorStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |
 **nodewise** | **Boolean**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional] [default to false]
 **clusterNodeId** | **String**| The id of the node where to get the status. | [optional]

### Return type

[**ProcessorStatusEntity**](ProcessorStatusEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProcessorStatusHistory"></a>
# **getProcessorStatusHistory**
> StatusHistoryEntity getProcessorStatusHistory(id)

Gets status history for a processor

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The processor id.
try {
    StatusHistoryEntity result = apiInstance.getProcessorStatusHistory(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getProcessorStatusHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |

### Return type

[**StatusHistoryEntity**](StatusHistoryEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProcessorTypes"></a>
# **getProcessorTypes**
> ProcessorTypesEntity getProcessorTypes(bundleGroupFilter, bundleArtifactFilter, type)

Retrieves the types of processors that this NiFi supports

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String bundleGroupFilter = "bundleGroupFilter_example"; // String | If specified, will only return types that are a member of this bundle group.
String bundleArtifactFilter = "bundleArtifactFilter_example"; // String | If specified, will only return types that are a member of this bundle artifact.
String type = "type_example"; // String | If specified, will only return types whose fully qualified classname matches.
try {
    ProcessorTypesEntity result = apiInstance.getProcessorTypes(bundleGroupFilter, bundleArtifactFilter, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getProcessorTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundleGroupFilter** | **String**| If specified, will only return types that are a member of this bundle group. | [optional]
 **bundleArtifactFilter** | **String**| If specified, will only return types that are a member of this bundle artifact. | [optional]
 **type** | **String**| If specified, will only return types whose fully qualified classname matches. | [optional]

### Return type

[**ProcessorTypesEntity**](ProcessorTypesEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRegistryClients"></a>
# **getRegistryClients**
> FlowRegistryClientsEntity getRegistryClients()

Gets the listing of available flow registry clients

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
try {
    FlowRegistryClientsEntity result = apiInstance.getRegistryClients();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getRegistryClients");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**FlowRegistryClientsEntity**](FlowRegistryClientsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRemoteProcessGroupStatus"></a>
# **getRemoteProcessGroupStatus**
> RemoteProcessGroupStatusEntity getRemoteProcessGroupStatus(id, nodewise, clusterNodeId)

Gets status for a remote process group

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The remote process group id.
Boolean nodewise = false; // Boolean | Whether or not to include the breakdown per node. Optional, defaults to false
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where to get the status.
try {
    RemoteProcessGroupStatusEntity result = apiInstance.getRemoteProcessGroupStatus(id, nodewise, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getRemoteProcessGroupStatus");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The remote process group id. |
 **nodewise** | **Boolean**| Whether or not to include the breakdown per node. Optional, defaults to false | [optional] [default to false]
 **clusterNodeId** | **String**| The id of the node where to get the status. | [optional]

### Return type

[**RemoteProcessGroupStatusEntity**](RemoteProcessGroupStatusEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRemoteProcessGroupStatusHistory"></a>
# **getRemoteProcessGroupStatusHistory**
> StatusHistoryEntity getRemoteProcessGroupStatusHistory(id)

Gets the status history

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String id = "id_example"; // String | The remote process group id.
try {
    StatusHistoryEntity result = apiInstance.getRemoteProcessGroupStatusHistory(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getRemoteProcessGroupStatusHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The remote process group id. |

### Return type

[**StatusHistoryEntity**](StatusHistoryEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReportingTaskDefinition"></a>
# **getReportingTaskDefinition**
> ReportingTaskDefinition getReportingTaskDefinition(group, artifact, version, type)

Retrieves the Reporting Task Definition for the specified component type.

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String group = "group_example"; // String | The bundle group
String artifact = "artifact_example"; // String | The bundle artifact
String version = "version_example"; // String | The bundle version
String type = "type_example"; // String | The reporting task type
try {
    ReportingTaskDefinition result = apiInstance.getReportingTaskDefinition(group, artifact, version, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getReportingTaskDefinition");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **group** | **String**| The bundle group |
 **artifact** | **String**| The bundle artifact |
 **version** | **String**| The bundle version |
 **type** | **String**| The reporting task type |

### Return type

[**ReportingTaskDefinition**](ReportingTaskDefinition.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReportingTaskSnapshot"></a>
# **getReportingTaskSnapshot**
> VersionedReportingTaskSnapshot getReportingTaskSnapshot(reportingTaskId)

Get a snapshot of the given reporting tasks and any controller services they use

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String reportingTaskId = "reportingTaskId_example"; // String | Specifies a reporting task id to export. If not specified, all reporting tasks will be exported.
try {
    VersionedReportingTaskSnapshot result = apiInstance.getReportingTaskSnapshot(reportingTaskId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getReportingTaskSnapshot");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **reportingTaskId** | **String**| Specifies a reporting task id to export. If not specified, all reporting tasks will be exported. | [optional]

### Return type

[**VersionedReportingTaskSnapshot**](VersionedReportingTaskSnapshot.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReportingTaskTypes"></a>
# **getReportingTaskTypes**
> ReportingTaskTypesEntity getReportingTaskTypes(bundleGroupFilter, bundleArtifactFilter, type)

Retrieves the types of reporting tasks that this NiFi supports

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String bundleGroupFilter = "bundleGroupFilter_example"; // String | If specified, will only return types that are a member of this bundle group.
String bundleArtifactFilter = "bundleArtifactFilter_example"; // String | If specified, will only return types that are a member of this bundle artifact.
String type = "type_example"; // String | If specified, will only return types whose fully qualified classname matches.
try {
    ReportingTaskTypesEntity result = apiInstance.getReportingTaskTypes(bundleGroupFilter, bundleArtifactFilter, type);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getReportingTaskTypes");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **bundleGroupFilter** | **String**| If specified, will only return types that are a member of this bundle group. | [optional]
 **bundleArtifactFilter** | **String**| If specified, will only return types that are a member of this bundle artifact. | [optional]
 **type** | **String**| If specified, will only return types whose fully qualified classname matches. | [optional]

### Return type

[**ReportingTaskTypesEntity**](ReportingTaskTypesEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReportingTasks"></a>
# **getReportingTasks**
> ReportingTasksEntity getReportingTasks()

Gets all reporting tasks

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
try {
    ReportingTasksEntity result = apiInstance.getReportingTasks();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getReportingTasks");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ReportingTasksEntity**](ReportingTasksEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getRuntimeManifest"></a>
# **getRuntimeManifest**
> RuntimeManifestEntity getRuntimeManifest()

Retrieves the runtime manifest for this NiFi instance.

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
try {
    RuntimeManifestEntity result = apiInstance.getRuntimeManifest();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getRuntimeManifest");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**RuntimeManifestEntity**](RuntimeManifestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVersionDifferences"></a>
# **getVersionDifferences**
> FlowComparisonEntity getVersionDifferences(registryId, branchIdA, bucketIdA, flowIdA, versionA, branchIdB, bucketIdB, flowIdB, versionB, offset, limit)

Gets the differences between two versions of the same versioned flow, the basis of the comparison will be the first version

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String registryId = "registryId_example"; // String | The registry client id.
String branchIdA = "branchIdA_example"; // String | The branch id for the base version.
String bucketIdA = "bucketIdA_example"; // String | The bucket id for the base version.
String flowIdA = "flowIdA_example"; // String | The flow id for the base version.
String versionA = "versionA_example"; // String | The base version.
String branchIdB = "branchIdB_example"; // String | The branch id for the compared version.
String bucketIdB = "bucketIdB_example"; // String | The bucket id for the compared version.
String flowIdB = "flowIdB_example"; // String | The flow id for the compared version.
String versionB = "versionB_example"; // String | The compared version.
Integer offset = 0; // Integer | Must be a non-negative number. Specifies the starting point of the listing. 0 means start from the beginning.
Integer limit = 1000; // Integer | Limits the number of differences listed. This might lead to partial result. 0 means no limitation is applied.
try {
    FlowComparisonEntity result = apiInstance.getVersionDifferences(registryId, branchIdA, bucketIdA, flowIdA, versionA, branchIdB, bucketIdB, flowIdB, versionB, offset, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getVersionDifferences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registryId** | **String**| The registry client id. |
 **branchIdA** | **String**| The branch id for the base version. |
 **bucketIdA** | **String**| The bucket id for the base version. |
 **flowIdA** | **String**| The flow id for the base version. |
 **versionA** | **String**| The base version. |
 **branchIdB** | **String**| The branch id for the compared version. |
 **bucketIdB** | **String**| The bucket id for the compared version. |
 **flowIdB** | **String**| The flow id for the compared version. |
 **versionB** | **String**| The compared version. |
 **offset** | **Integer**| Must be a non-negative number. Specifies the starting point of the listing. 0 means start from the beginning. | [optional] [default to 0]
 **limit** | **Integer**| Limits the number of differences listed. This might lead to partial result. 0 means no limitation is applied. | [optional] [default to 1000]

### Return type

[**FlowComparisonEntity**](FlowComparisonEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVersions"></a>
# **getVersions**
> VersionedFlowSnapshotMetadataSetEntity getVersions(registryId, bucketId, flowId, branch)

Gets the flow versions from the specified registry and bucket for the specified flow for the current user

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String registryId = "registryId_example"; // String | The registry client id.
String bucketId = "bucketId_example"; // String | The bucket id.
String flowId = "flowId_example"; // String | The flow id.
String branch = "branch_example"; // String | The name of a branch to get the flow versions from. If not specified the default branch of the registry client will be used.
try {
    VersionedFlowSnapshotMetadataSetEntity result = apiInstance.getVersions(registryId, bucketId, flowId, branch);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#getVersions");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **registryId** | **String**| The registry client id. |
 **bucketId** | **String**| The bucket id. |
 **flowId** | **String**| The flow id. |
 **branch** | **String**| The name of a branch to get the flow versions from. If not specified the default branch of the registry client will be used. | [optional]

### Return type

[**VersionedFlowSnapshotMetadataSetEntity**](VersionedFlowSnapshotMetadataSetEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="queryHistory"></a>
# **queryHistory**
> HistoryEntity queryHistory(offset, count, sortColumn, sortOrder, startDate, endDate, userIdentity, sourceId)

Gets configuration history

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
IntegerParameter offset = new IntegerParameter(); // IntegerParameter | The offset into the result set.
IntegerParameter count = new IntegerParameter(); // IntegerParameter | The number of actions to return.
String sortColumn = "sortColumn_example"; // String | The field to sort on.
String sortOrder = "sortOrder_example"; // String | The direction to sort.
DateTimeParameter startDate = new DateTimeParameter(); // DateTimeParameter | Include actions after this date.
DateTimeParameter endDate = new DateTimeParameter(); // DateTimeParameter | Include actions before this date.
String userIdentity = "userIdentity_example"; // String | Include actions performed by this user.
String sourceId = "sourceId_example"; // String | Include actions on this component.
try {
    HistoryEntity result = apiInstance.queryHistory(offset, count, sortColumn, sortOrder, startDate, endDate, userIdentity, sourceId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#queryHistory");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **offset** | [**IntegerParameter**](.md)| The offset into the result set. |
 **count** | [**IntegerParameter**](.md)| The number of actions to return. |
 **sortColumn** | **String**| The field to sort on. | [optional]
 **sortOrder** | **String**| The direction to sort. | [optional]
 **startDate** | [**DateTimeParameter**](.md)| Include actions after this date. | [optional]
 **endDate** | [**DateTimeParameter**](.md)| Include actions before this date. | [optional]
 **userIdentity** | **String**| Include actions performed by this user. | [optional]
 **sourceId** | **String**| Include actions on this component. | [optional]

### Return type

[**HistoryEntity**](HistoryEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="scheduleComponents"></a>
# **scheduleComponents**
> ScheduleComponentsEntity scheduleComponents(body, id)

Schedule or unschedule components in the specified Process Group.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
ScheduleComponentsEntity body = new ScheduleComponentsEntity(); // ScheduleComponentsEntity | The request to schedule or unschedule. If the components in the request are not specified, all authorized components will be considered.
String id = "id_example"; // String | The process group id.
try {
    ScheduleComponentsEntity result = apiInstance.scheduleComponents(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#scheduleComponents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ScheduleComponentsEntity**](ScheduleComponentsEntity.md)| The request to schedule or unschedule. If the components in the request are not specified, all authorized components will be considered. |
 **id** | **String**| The process group id. |

### Return type

[**ScheduleComponentsEntity**](ScheduleComponentsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="searchCluster"></a>
# **searchCluster**
> ClusterSearchResultsEntity searchCluster(q)

Searches the cluster for a node with the specified address

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String q = ""; // String | Node address to search for.
try {
    ClusterSearchResultsEntity result = apiInstance.searchCluster(q);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#searchCluster");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**| Node address to search for. |

### Return type

[**ClusterSearchResultsEntity**](ClusterSearchResultsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="searchFlow"></a>
# **searchFlow**
> SearchResultsEntity searchFlow(q, a)

Performs a search against this NiFi using the specified search term

Only search results from authorized components will be returned.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FlowApi;


FlowApi apiInstance = new FlowApi();
String q = ""; // String | 
String a = ""; // String | 
try {
    SearchResultsEntity result = apiInstance.searchFlow(q, a);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FlowApi#searchFlow");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **q** | **String**|  | [optional]
 **a** | **String**|  | [optional]

### Return type

[**SearchResultsEntity**](SearchResultsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

