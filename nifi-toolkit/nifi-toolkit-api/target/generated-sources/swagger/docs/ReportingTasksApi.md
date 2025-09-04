# ReportingTasksApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyzeConfiguration3**](ReportingTasksApi.md#analyzeConfiguration3) | **POST** /reporting-tasks/{id}/config/analysis | Performs analysis of the component&#x27;s configuration, providing information about which attributes are referenced.
[**clearState4**](ReportingTasksApi.md#clearState4) | **POST** /reporting-tasks/{id}/state/clear-requests | Clears the state for a reporting task
[**deleteVerificationRequest3**](ReportingTasksApi.md#deleteVerificationRequest3) | **DELETE** /reporting-tasks/{id}/config/verification-requests/{requestId} | Deletes the Verification Request with the given ID
[**getPropertyDescriptor4**](ReportingTasksApi.md#getPropertyDescriptor4) | **GET** /reporting-tasks/{id}/descriptors | Gets a reporting task property descriptor
[**getReportingTask**](ReportingTasksApi.md#getReportingTask) | **GET** /reporting-tasks/{id} | Gets a reporting task
[**getState4**](ReportingTasksApi.md#getState4) | **GET** /reporting-tasks/{id}/state | Gets the state for a reporting task
[**getVerificationRequest3**](ReportingTasksApi.md#getVerificationRequest3) | **GET** /reporting-tasks/{id}/config/verification-requests/{requestId} | Returns the Verification Request with the given ID
[**removeReportingTask**](ReportingTasksApi.md#removeReportingTask) | **DELETE** /reporting-tasks/{id} | Deletes a reporting task
[**submitConfigVerificationRequest2**](ReportingTasksApi.md#submitConfigVerificationRequest2) | **POST** /reporting-tasks/{id}/config/verification-requests | Performs verification of the Reporting Task&#x27;s configuration
[**updateReportingTask**](ReportingTasksApi.md#updateReportingTask) | **PUT** /reporting-tasks/{id} | Updates a reporting task
[**updateRunStatus5**](ReportingTasksApi.md#updateRunStatus5) | **PUT** /reporting-tasks/{id}/run-status | Updates run status of a reporting task

<a name="analyzeConfiguration3"></a>
# **analyzeConfiguration3**
> ConfigurationAnalysisEntity analyzeConfiguration3(body, id)

Performs analysis of the component&#x27;s configuration, providing information about which attributes are referenced.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
ConfigurationAnalysisEntity body = new ConfigurationAnalysisEntity(); // ConfigurationAnalysisEntity | The configuration analysis request.
String id = "id_example"; // String | The reporting task id.
try {
    ConfigurationAnalysisEntity result = apiInstance.analyzeConfiguration3(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#analyzeConfiguration3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConfigurationAnalysisEntity**](ConfigurationAnalysisEntity.md)| The configuration analysis request. |
 **id** | **String**| The reporting task id. |

### Return type

[**ConfigurationAnalysisEntity**](ConfigurationAnalysisEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clearState4"></a>
# **clearState4**
> ComponentStateEntity clearState4(id)

Clears the state for a reporting task

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
try {
    ComponentStateEntity result = apiInstance.clearState4(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#clearState4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVerificationRequest3"></a>
# **deleteVerificationRequest3**
> VerifyConfigRequestEntity deleteVerificationRequest3(id, requestId)

Deletes the Verification Request with the given ID

Deletes the Verification Request with the given ID. After a request is created, it is expected that the client will properly clean up the request by DELETE&#x27;ing it, once the Verification process has completed. If the request is deleted before the request completes, then the Verification request will finish the step that it is currently performing and then will cancel any subsequent steps.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The ID of the Reporting Task
String requestId = "requestId_example"; // String | The ID of the Verification Request
try {
    VerifyConfigRequestEntity result = apiInstance.deleteVerificationRequest3(id, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#deleteVerificationRequest3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Reporting Task |
 **requestId** | **String**| The ID of the Verification Request |

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPropertyDescriptor4"></a>
# **getPropertyDescriptor4**
> PropertyDescriptorEntity getPropertyDescriptor4(id, propertyName, sensitive)

Gets a reporting task property descriptor

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
String propertyName = "propertyName_example"; // String | The property name.
Boolean sensitive = true; // Boolean | Property Descriptor requested sensitive status
try {
    PropertyDescriptorEntity result = apiInstance.getPropertyDescriptor4(id, propertyName, sensitive);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#getPropertyDescriptor4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |
 **propertyName** | **String**| The property name. |
 **sensitive** | **Boolean**| Property Descriptor requested sensitive status | [optional]

### Return type

[**PropertyDescriptorEntity**](PropertyDescriptorEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getReportingTask"></a>
# **getReportingTask**
> ReportingTaskEntity getReportingTask(id)

Gets a reporting task

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
try {
    ReportingTaskEntity result = apiInstance.getReportingTask(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#getReportingTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |

### Return type

[**ReportingTaskEntity**](ReportingTaskEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getState4"></a>
# **getState4**
> ComponentStateEntity getState4(id)

Gets the state for a reporting task

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
try {
    ComponentStateEntity result = apiInstance.getState4(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#getState4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVerificationRequest3"></a>
# **getVerificationRequest3**
> VerifyConfigRequestEntity getVerificationRequest3(id, requestId)

Returns the Verification Request with the given ID

Returns the Verification Request with the given ID. Once an Verification Request has been created, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. 

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The ID of the Reporting Task
String requestId = "requestId_example"; // String | The ID of the Verification Request
try {
    VerifyConfigRequestEntity result = apiInstance.getVerificationRequest3(id, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#getVerificationRequest3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Reporting Task |
 **requestId** | **String**| The ID of the Verification Request |

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeReportingTask"></a>
# **removeReportingTask**
> ReportingTaskEntity removeReportingTask(id, version, clientId, disconnectedNodeAcknowledged)

Deletes a reporting task

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
String id = "id_example"; // String | The reporting task id.
LongParameter version = new LongParameter(); // LongParameter | The revision is used to verify the client is working with the latest version of the flow.
ClientIdParameter clientId = new ClientIdParameter(); // ClientIdParameter | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    ReportingTaskEntity result = apiInstance.removeReportingTask(id, version, clientId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#removeReportingTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The reporting task id. |
 **version** | [**LongParameter**](.md)| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | [**ClientIdParameter**](.md)| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ReportingTaskEntity**](ReportingTaskEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="submitConfigVerificationRequest2"></a>
# **submitConfigVerificationRequest2**
> VerifyConfigRequestEntity submitConfigVerificationRequest2(body, id)

Performs verification of the Reporting Task&#x27;s configuration

This will initiate the process of verifying a given Reporting Task configuration. This may be a long-running task. As a result, this endpoint will immediately return a ReportingTaskConfigVerificationRequestEntity, and the process of performing the verification will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /reporting-tasks/{taskId}/verification-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /reporting-tasks/{serviceId}/verification-requests/{requestId}.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
VerifyConfigRequestEntity body = new VerifyConfigRequestEntity(); // VerifyConfigRequestEntity | The reporting task configuration verification request.
String id = "id_example"; // String | The reporting task id.
try {
    VerifyConfigRequestEntity result = apiInstance.submitConfigVerificationRequest2(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#submitConfigVerificationRequest2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)| The reporting task configuration verification request. |
 **id** | **String**| The reporting task id. |

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateReportingTask"></a>
# **updateReportingTask**
> ReportingTaskEntity updateReportingTask(body, id)

Updates a reporting task

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
ReportingTaskEntity body = new ReportingTaskEntity(); // ReportingTaskEntity | The reporting task configuration details.
String id = "id_example"; // String | The reporting task id.
try {
    ReportingTaskEntity result = apiInstance.updateReportingTask(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#updateReportingTask");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReportingTaskEntity**](ReportingTaskEntity.md)| The reporting task configuration details. |
 **id** | **String**| The reporting task id. |

### Return type

[**ReportingTaskEntity**](ReportingTaskEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRunStatus5"></a>
# **updateRunStatus5**
> ReportingTaskEntity updateRunStatus5(body, id)

Updates run status of a reporting task

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ReportingTasksApi;


ReportingTasksApi apiInstance = new ReportingTasksApi();
ReportingTaskRunStatusEntity body = new ReportingTaskRunStatusEntity(); // ReportingTaskRunStatusEntity | The reporting task run status.
String id = "id_example"; // String | The reporting task id.
try {
    ReportingTaskEntity result = apiInstance.updateRunStatus5(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ReportingTasksApi#updateRunStatus5");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReportingTaskRunStatusEntity**](ReportingTaskRunStatusEntity.md)| The reporting task run status. |
 **id** | **String**| The reporting task id. |

### Return type

[**ReportingTaskEntity**](ReportingTaskEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

