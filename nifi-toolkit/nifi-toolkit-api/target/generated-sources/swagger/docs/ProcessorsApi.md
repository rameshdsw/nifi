# ProcessorsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyzeConfiguration2**](ProcessorsApi.md#analyzeConfiguration2) | **POST** /processors/{id}/config/analysis | Performs analysis of the component&#x27;s configuration, providing information about which attributes are referenced.
[**clearState3**](ProcessorsApi.md#clearState3) | **POST** /processors/{id}/state/clear-requests | Clears the state for a processor
[**deleteProcessor**](ProcessorsApi.md#deleteProcessor) | **DELETE** /processors/{id} | Deletes a processor
[**deleteVerificationRequest2**](ProcessorsApi.md#deleteVerificationRequest2) | **DELETE** /processors/{id}/config/verification-requests/{requestId} | Deletes the Verification Request with the given ID
[**getProcessor**](ProcessorsApi.md#getProcessor) | **GET** /processors/{id} | Gets a processor
[**getProcessorDiagnostics**](ProcessorsApi.md#getProcessorDiagnostics) | **GET** /processors/{id}/diagnostics | Gets diagnostics information about a processor
[**getProcessorRunStatusDetails**](ProcessorsApi.md#getProcessorRunStatusDetails) | **POST** /processors/run-status-details/queries | Submits a query to retrieve the run status details of all processors that are in the given list of Processor IDs
[**getPropertyDescriptor3**](ProcessorsApi.md#getPropertyDescriptor3) | **GET** /processors/{id}/descriptors | Gets the descriptor for a processor property
[**getState2**](ProcessorsApi.md#getState2) | **GET** /processors/{id}/state | Gets the state for a processor
[**getVerificationRequest2**](ProcessorsApi.md#getVerificationRequest2) | **GET** /processors/{id}/config/verification-requests/{requestId} | Returns the Verification Request with the given ID
[**submitProcessorVerificationRequest**](ProcessorsApi.md#submitProcessorVerificationRequest) | **POST** /processors/{id}/config/verification-requests | Performs verification of the Processor&#x27;s configuration
[**terminateProcessor**](ProcessorsApi.md#terminateProcessor) | **DELETE** /processors/{id}/threads | Terminates a processor, essentially \&quot;deleting\&quot; its threads and any active tasks
[**updateProcessor**](ProcessorsApi.md#updateProcessor) | **PUT** /processors/{id} | Updates a processor
[**updateRunStatus4**](ProcessorsApi.md#updateRunStatus4) | **PUT** /processors/{id}/run-status | Updates run status of a processor

<a name="analyzeConfiguration2"></a>
# **analyzeConfiguration2**
> ConfigurationAnalysisEntity analyzeConfiguration2(body, id)

Performs analysis of the component&#x27;s configuration, providing information about which attributes are referenced.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
ConfigurationAnalysisEntity body = new ConfigurationAnalysisEntity(); // ConfigurationAnalysisEntity | The processor configuration analysis request.
String id = "id_example"; // String | The processor id.
try {
    ConfigurationAnalysisEntity result = apiInstance.analyzeConfiguration2(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#analyzeConfiguration2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConfigurationAnalysisEntity**](ConfigurationAnalysisEntity.md)| The processor configuration analysis request. |
 **id** | **String**| The processor id. |

### Return type

[**ConfigurationAnalysisEntity**](ConfigurationAnalysisEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clearState3"></a>
# **clearState3**
> ComponentStateEntity clearState3(id)

Clears the state for a processor

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
try {
    ComponentStateEntity result = apiInstance.clearState3(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#clearState3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteProcessor"></a>
# **deleteProcessor**
> ProcessorEntity deleteProcessor(id, version, clientId, disconnectedNodeAcknowledged)

Deletes a processor

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
LongParameter version = new LongParameter(); // LongParameter | The revision is used to verify the client is working with the latest version of the flow.
ClientIdParameter clientId = new ClientIdParameter(); // ClientIdParameter | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    ProcessorEntity result = apiInstance.deleteProcessor(id, version, clientId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#deleteProcessor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |
 **version** | [**LongParameter**](.md)| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | [**ClientIdParameter**](.md)| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVerificationRequest2"></a>
# **deleteVerificationRequest2**
> VerifyConfigRequestEntity deleteVerificationRequest2(id, requestId)

Deletes the Verification Request with the given ID

Deletes the Verification Request with the given ID. After a request is created, it is expected that the client will properly clean up the request by DELETE&#x27;ing it, once the Verification process has completed. If the request is deleted before the request completes, then the Verification request will finish the step that it is currently performing and then will cancel any subsequent steps.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The ID of the Processor
String requestId = "requestId_example"; // String | The ID of the Verification Request
try {
    VerifyConfigRequestEntity result = apiInstance.deleteVerificationRequest2(id, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#deleteVerificationRequest2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Processor |
 **requestId** | **String**| The ID of the Verification Request |

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProcessor"></a>
# **getProcessor**
> ProcessorEntity getProcessor(id)

Gets a processor

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
try {
    ProcessorEntity result = apiInstance.getProcessor(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#getProcessor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProcessorDiagnostics"></a>
# **getProcessorDiagnostics**
> ProcessorEntity getProcessorDiagnostics(id)

Gets diagnostics information about a processor

Note: This endpoint is subject to change as NiFi and it&#x27;s REST API evolve.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
try {
    ProcessorEntity result = apiInstance.getProcessorDiagnostics(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#getProcessorDiagnostics");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getProcessorRunStatusDetails"></a>
# **getProcessorRunStatusDetails**
> ProcessorsRunStatusDetailsEntity getProcessorRunStatusDetails(body)

Submits a query to retrieve the run status details of all processors that are in the given list of Processor IDs

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
RunStatusDetailsRequestEntity body = new RunStatusDetailsRequestEntity(); // RunStatusDetailsRequestEntity | The request for the processors that should be included in the results
try {
    ProcessorsRunStatusDetailsEntity result = apiInstance.getProcessorRunStatusDetails(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#getProcessorRunStatusDetails");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**RunStatusDetailsRequestEntity**](RunStatusDetailsRequestEntity.md)| The request for the processors that should be included in the results | [optional]

### Return type

[**ProcessorsRunStatusDetailsEntity**](ProcessorsRunStatusDetailsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getPropertyDescriptor3"></a>
# **getPropertyDescriptor3**
> PropertyDescriptorEntity getPropertyDescriptor3(id, propertyName, clientId, sensitive)

Gets the descriptor for a processor property

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
String propertyName = "propertyName_example"; // String | The property name.
ClientIdParameter clientId = new ClientIdParameter(); // ClientIdParameter | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean sensitive = true; // Boolean | Property Descriptor requested sensitive status
try {
    PropertyDescriptorEntity result = apiInstance.getPropertyDescriptor3(id, propertyName, clientId, sensitive);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#getPropertyDescriptor3");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |
 **propertyName** | **String**| The property name. |
 **clientId** | [**ClientIdParameter**](.md)| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **sensitive** | **Boolean**| Property Descriptor requested sensitive status | [optional]

### Return type

[**PropertyDescriptorEntity**](PropertyDescriptorEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getState2"></a>
# **getState2**
> ComponentStateEntity getState2(id)

Gets the state for a processor

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
try {
    ComponentStateEntity result = apiInstance.getState2(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#getState2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVerificationRequest2"></a>
# **getVerificationRequest2**
> VerifyConfigRequestEntity getVerificationRequest2(id, requestId)

Returns the Verification Request with the given ID

Returns the Verification Request with the given ID. Once an Verification Request has been created, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. 

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The ID of the Processor
String requestId = "requestId_example"; // String | The ID of the Verification Request
try {
    VerifyConfigRequestEntity result = apiInstance.getVerificationRequest2(id, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#getVerificationRequest2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Processor |
 **requestId** | **String**| The ID of the Verification Request |

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="submitProcessorVerificationRequest"></a>
# **submitProcessorVerificationRequest**
> VerifyConfigRequestEntity submitProcessorVerificationRequest(body, id)

Performs verification of the Processor&#x27;s configuration

This will initiate the process of verifying a given Processor configuration. This may be a long-running task. As a result, this endpoint will immediately return a ProcessorConfigVerificationRequestEntity, and the process of performing the verification will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /processors/{processorId}/verification-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /processors/{processorId}/verification-requests/{requestId}.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
VerifyConfigRequestEntity body = new VerifyConfigRequestEntity(); // VerifyConfigRequestEntity | The processor configuration verification request.
String id = "id_example"; // String | The processor id.
try {
    VerifyConfigRequestEntity result = apiInstance.submitProcessorVerificationRequest(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#submitProcessorVerificationRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)| The processor configuration verification request. |
 **id** | **String**| The processor id. |

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="terminateProcessor"></a>
# **terminateProcessor**
> ProcessorEntity terminateProcessor(id)

Terminates a processor, essentially \&quot;deleting\&quot; its threads and any active tasks

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
String id = "id_example"; // String | The processor id.
try {
    ProcessorEntity result = apiInstance.terminateProcessor(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#terminateProcessor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The processor id. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateProcessor"></a>
# **updateProcessor**
> ProcessorEntity updateProcessor(body, id)

Updates a processor

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
ProcessorEntity body = new ProcessorEntity(); // ProcessorEntity | The processor configuration details.
String id = "id_example"; // String | The processor id.
try {
    ProcessorEntity result = apiInstance.updateProcessor(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#updateProcessor");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProcessorEntity**](ProcessorEntity.md)| The processor configuration details. |
 **id** | **String**| The processor id. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateRunStatus4"></a>
# **updateRunStatus4**
> ProcessorEntity updateRunStatus4(body, id)

Updates run status of a processor

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ProcessorsApi;


ProcessorsApi apiInstance = new ProcessorsApi();
ProcessorRunStatusEntity body = new ProcessorRunStatusEntity(); // ProcessorRunStatusEntity | The processor run status.
String id = "id_example"; // String | The processor id.
try {
    ProcessorEntity result = apiInstance.updateRunStatus4(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProcessorsApi#updateRunStatus4");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ProcessorRunStatusEntity**](ProcessorRunStatusEntity.md)| The processor run status. |
 **id** | **String**| The processor id. |

### Return type

[**ProcessorEntity**](ProcessorEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

