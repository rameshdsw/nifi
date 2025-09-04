# ParameterProvidersApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**analyzeConfiguration1**](ParameterProvidersApi.md#analyzeConfiguration1) | **POST** /parameter-providers/{id}/config/analysis | Performs analysis of the component&#x27;s configuration, providing information about which attributes are referenced.
[**clearState2**](ParameterProvidersApi.md#clearState2) | **POST** /parameter-providers/{id}/state/clear-requests | Clears the state for a parameter provider
[**deleteApplyParametersRequest**](ParameterProvidersApi.md#deleteApplyParametersRequest) | **DELETE** /parameter-providers/{providerId}/apply-parameters-requests/{requestId} | Deletes the Apply Parameters Request with the given ID
[**deleteVerificationRequest1**](ParameterProvidersApi.md#deleteVerificationRequest1) | **DELETE** /parameter-providers/{id}/config/verification-requests/{requestId} | Deletes the Verification Request with the given ID
[**fetchParameters**](ParameterProvidersApi.md#fetchParameters) | **POST** /parameter-providers/{id}/parameters/fetch-requests | Fetches and temporarily caches the parameters for a provider
[**getParameterProvider**](ParameterProvidersApi.md#getParameterProvider) | **GET** /parameter-providers/{id} | Gets a parameter provider
[**getParameterProviderApplyParametersRequest**](ParameterProvidersApi.md#getParameterProviderApplyParametersRequest) | **GET** /parameter-providers/{providerId}/apply-parameters-requests/{requestId} | Returns the Apply Parameters Request with the given ID
[**getParameterProviderReferences**](ParameterProvidersApi.md#getParameterProviderReferences) | **GET** /parameter-providers/{id}/references | Gets all references to a parameter provider
[**getPropertyDescriptor2**](ParameterProvidersApi.md#getPropertyDescriptor2) | **GET** /parameter-providers/{id}/descriptors | Gets a parameter provider property descriptor
[**getState1**](ParameterProvidersApi.md#getState1) | **GET** /parameter-providers/{id}/state | Gets the state for a parameter provider
[**getVerificationRequest1**](ParameterProvidersApi.md#getVerificationRequest1) | **GET** /parameter-providers/{id}/config/verification-requests/{requestId} | Returns the Verification Request with the given ID
[**removeParameterProvider**](ParameterProvidersApi.md#removeParameterProvider) | **DELETE** /parameter-providers/{id} | Deletes a parameter provider
[**submitApplyParameters**](ParameterProvidersApi.md#submitApplyParameters) | **POST** /parameter-providers/{providerId}/apply-parameters-requests | Initiate a request to apply the fetched parameters of a Parameter Provider
[**submitConfigVerificationRequest1**](ParameterProvidersApi.md#submitConfigVerificationRequest1) | **POST** /parameter-providers/{id}/config/verification-requests | Performs verification of the Parameter Provider&#x27;s configuration
[**updateParameterProvider**](ParameterProvidersApi.md#updateParameterProvider) | **PUT** /parameter-providers/{id} | Updates a parameter provider

<a name="analyzeConfiguration1"></a>
# **analyzeConfiguration1**
> ConfigurationAnalysisEntity analyzeConfiguration1(body, id)

Performs analysis of the component&#x27;s configuration, providing information about which attributes are referenced.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ParameterProvidersApi;


ParameterProvidersApi apiInstance = new ParameterProvidersApi();
ConfigurationAnalysisEntity body = new ConfigurationAnalysisEntity(); // ConfigurationAnalysisEntity | The configuration analysis request.
String id = "id_example"; // String | The parameter provider id.
try {
    ConfigurationAnalysisEntity result = apiInstance.analyzeConfiguration1(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParameterProvidersApi#analyzeConfiguration1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ConfigurationAnalysisEntity**](ConfigurationAnalysisEntity.md)| The configuration analysis request. |
 **id** | **String**| The parameter provider id. |

### Return type

[**ConfigurationAnalysisEntity**](ConfigurationAnalysisEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="clearState2"></a>
# **clearState2**
> ComponentStateEntity clearState2(id)

Clears the state for a parameter provider

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ParameterProvidersApi;


ParameterProvidersApi apiInstance = new ParameterProvidersApi();
String id = "id_example"; // String | The parameter provider id.
try {
    ComponentStateEntity result = apiInstance.clearState2(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParameterProvidersApi#clearState2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The parameter provider id. |

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteApplyParametersRequest"></a>
# **deleteApplyParametersRequest**
> ParameterProviderApplyParametersRequestEntity deleteApplyParametersRequest(providerId, requestId, disconnectedNodeAcknowledged)

Deletes the Apply Parameters Request with the given ID

Deletes the Apply Parameters Request with the given ID. After a request is created via a POST to /nifi-api/parameter-providers/apply-parameters-requests, it is expected that the client will properly clean up the request by DELETE&#x27;ing it, once the Apply process has completed. If the request is deleted before the request completes, then the Apply Parameters Request will finish the step that it is currently performing and then will cancel any subsequent steps.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ParameterProvidersApi;


ParameterProvidersApi apiInstance = new ParameterProvidersApi();
String providerId = "providerId_example"; // String | The ID of the Parameter Provider
String requestId = "requestId_example"; // String | The ID of the Apply Parameters Request
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    ParameterProviderApplyParametersRequestEntity result = apiInstance.deleteApplyParametersRequest(providerId, requestId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParameterProvidersApi#deleteApplyParametersRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerId** | **String**| The ID of the Parameter Provider |
 **requestId** | **String**| The ID of the Apply Parameters Request |
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ParameterProviderApplyParametersRequestEntity**](ParameterProviderApplyParametersRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="deleteVerificationRequest1"></a>
# **deleteVerificationRequest1**
> VerifyConfigRequestEntity deleteVerificationRequest1(id, requestId)

Deletes the Verification Request with the given ID

Deletes the Verification Request with the given ID. After a request is created, it is expected that the client will properly clean up the request by DELETE&#x27;ing it, once the Verification process has completed. If the request is deleted before the request completes, then the Verification request will finish the step that it is currently performing and then will cancel any subsequent steps.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ParameterProvidersApi;


ParameterProvidersApi apiInstance = new ParameterProvidersApi();
String id = "id_example"; // String | The ID of the Parameter Provider
String requestId = "requestId_example"; // String | The ID of the Verification Request
try {
    VerifyConfigRequestEntity result = apiInstance.deleteVerificationRequest1(id, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParameterProvidersApi#deleteVerificationRequest1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Parameter Provider |
 **requestId** | **String**| The ID of the Verification Request |

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="fetchParameters"></a>
# **fetchParameters**
> ParameterProviderEntity fetchParameters(body, id)

Fetches and temporarily caches the parameters for a provider

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ParameterProvidersApi;


ParameterProvidersApi apiInstance = new ParameterProvidersApi();
ParameterProviderParameterFetchEntity body = new ParameterProviderParameterFetchEntity(); // ParameterProviderParameterFetchEntity | The parameter fetch request.
String id = "id_example"; // String | The parameter provider id.
try {
    ParameterProviderEntity result = apiInstance.fetchParameters(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParameterProvidersApi#fetchParameters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ParameterProviderParameterFetchEntity**](ParameterProviderParameterFetchEntity.md)| The parameter fetch request. |
 **id** | **String**| The parameter provider id. |

### Return type

[**ParameterProviderEntity**](ParameterProviderEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="getParameterProvider"></a>
# **getParameterProvider**
> ParameterProviderEntity getParameterProvider(id)

Gets a parameter provider

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ParameterProvidersApi;


ParameterProvidersApi apiInstance = new ParameterProvidersApi();
String id = "id_example"; // String | The parameter provider id.
try {
    ParameterProviderEntity result = apiInstance.getParameterProvider(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParameterProvidersApi#getParameterProvider");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The parameter provider id. |

### Return type

[**ParameterProviderEntity**](ParameterProviderEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getParameterProviderApplyParametersRequest"></a>
# **getParameterProviderApplyParametersRequest**
> ParameterProviderApplyParametersRequestEntity getParameterProviderApplyParametersRequest(providerId, requestId)

Returns the Apply Parameters Request with the given ID

Returns the Apply Parameters Request with the given ID. Once an Apply Parameters Request has been created by performing a POST to /nifi-api/parameter-providers, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the state, such as percent complete, the current state of the request, and any failures. 

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ParameterProvidersApi;


ParameterProvidersApi apiInstance = new ParameterProvidersApi();
String providerId = "providerId_example"; // String | The ID of the Parameter Provider
String requestId = "requestId_example"; // String | The ID of the Apply Parameters Request
try {
    ParameterProviderApplyParametersRequestEntity result = apiInstance.getParameterProviderApplyParametersRequest(providerId, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParameterProvidersApi#getParameterProviderApplyParametersRequest");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **providerId** | **String**| The ID of the Parameter Provider |
 **requestId** | **String**| The ID of the Apply Parameters Request |

### Return type

[**ParameterProviderApplyParametersRequestEntity**](ParameterProviderApplyParametersRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getParameterProviderReferences"></a>
# **getParameterProviderReferences**
> ParameterProviderReferencingComponentsEntity getParameterProviderReferences(id)

Gets all references to a parameter provider

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ParameterProvidersApi;


ParameterProvidersApi apiInstance = new ParameterProvidersApi();
String id = "id_example"; // String | The parameter provider id.
try {
    ParameterProviderReferencingComponentsEntity result = apiInstance.getParameterProviderReferences(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParameterProvidersApi#getParameterProviderReferences");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The parameter provider id. |

### Return type

[**ParameterProviderReferencingComponentsEntity**](ParameterProviderReferencingComponentsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getPropertyDescriptor2"></a>
# **getPropertyDescriptor2**
> PropertyDescriptorEntity getPropertyDescriptor2(id, propertyName)

Gets a parameter provider property descriptor

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ParameterProvidersApi;


ParameterProvidersApi apiInstance = new ParameterProvidersApi();
String id = "id_example"; // String | The parameter provider id.
String propertyName = "propertyName_example"; // String | The property name.
try {
    PropertyDescriptorEntity result = apiInstance.getPropertyDescriptor2(id, propertyName);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParameterProvidersApi#getPropertyDescriptor2");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The parameter provider id. |
 **propertyName** | **String**| The property name. |

### Return type

[**PropertyDescriptorEntity**](PropertyDescriptorEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getState1"></a>
# **getState1**
> ComponentStateEntity getState1(id)

Gets the state for a parameter provider

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ParameterProvidersApi;


ParameterProvidersApi apiInstance = new ParameterProvidersApi();
String id = "id_example"; // String | The parameter provider id.
try {
    ComponentStateEntity result = apiInstance.getState1(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParameterProvidersApi#getState1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The parameter provider id. |

### Return type

[**ComponentStateEntity**](ComponentStateEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getVerificationRequest1"></a>
# **getVerificationRequest1**
> VerifyConfigRequestEntity getVerificationRequest1(id, requestId)

Returns the Verification Request with the given ID

Returns the Verification Request with the given ID. Once an Verification Request has been created, that request can subsequently be retrieved via this endpoint, and the request that is fetched will contain the updated state, such as percent complete, the current state of the request, and any failures. 

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ParameterProvidersApi;


ParameterProvidersApi apiInstance = new ParameterProvidersApi();
String id = "id_example"; // String | The ID of the Parameter Provider
String requestId = "requestId_example"; // String | The ID of the Verification Request
try {
    VerifyConfigRequestEntity result = apiInstance.getVerificationRequest1(id, requestId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParameterProvidersApi#getVerificationRequest1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The ID of the Parameter Provider |
 **requestId** | **String**| The ID of the Verification Request |

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeParameterProvider"></a>
# **removeParameterProvider**
> ParameterProviderEntity removeParameterProvider(id, version, clientId, disconnectedNodeAcknowledged)

Deletes a parameter provider

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ParameterProvidersApi;


ParameterProvidersApi apiInstance = new ParameterProvidersApi();
String id = "id_example"; // String | The parameter provider id.
LongParameter version = new LongParameter(); // LongParameter | The revision is used to verify the client is working with the latest version of the flow.
ClientIdParameter clientId = new ClientIdParameter(); // ClientIdParameter | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    ParameterProviderEntity result = apiInstance.removeParameterProvider(id, version, clientId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParameterProvidersApi#removeParameterProvider");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The parameter provider id. |
 **version** | [**LongParameter**](.md)| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | [**ClientIdParameter**](.md)| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**ParameterProviderEntity**](ParameterProviderEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="submitApplyParameters"></a>
# **submitApplyParameters**
> ParameterProviderApplyParametersRequestEntity submitApplyParameters(body, providerId)

Initiate a request to apply the fetched parameters of a Parameter Provider

This will initiate the process of applying fetched parameters to all referencing Parameter Contexts. Changing the value of a Parameter may require that one or more components be stopped and restarted, so this action may take significantly more time than many other REST API actions. As a result, this endpoint will immediately return a ParameterProviderApplyParametersRequestEntity, and the process of updating the necessary components will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /parameter-providers/apply-parameters-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /parameter-providers/apply-parameters-requests/{requestId}.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ParameterProvidersApi;


ParameterProvidersApi apiInstance = new ParameterProvidersApi();
ParameterProviderParameterApplicationEntity body = new ParameterProviderParameterApplicationEntity(); // ParameterProviderParameterApplicationEntity | The apply parameters request.
String providerId = "providerId_example"; // String | 
try {
    ParameterProviderApplyParametersRequestEntity result = apiInstance.submitApplyParameters(body, providerId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParameterProvidersApi#submitApplyParameters");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ParameterProviderParameterApplicationEntity**](ParameterProviderParameterApplicationEntity.md)| The apply parameters request. |
 **providerId** | **String**|  |

### Return type

[**ParameterProviderApplyParametersRequestEntity**](ParameterProviderApplyParametersRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitConfigVerificationRequest1"></a>
# **submitConfigVerificationRequest1**
> VerifyConfigRequestEntity submitConfigVerificationRequest1(body, id)

Performs verification of the Parameter Provider&#x27;s configuration

This will initiate the process of verifying a given Parameter Provider configuration. This may be a long-running task. As a result, this endpoint will immediately return a ParameterProviderConfigVerificationRequestEntity, and the process of performing the verification will occur asynchronously in the background. The client may then periodically poll the status of the request by issuing a GET request to /parameter-providers/{serviceId}/verification-requests/{requestId}. Once the request is completed, the client is expected to issue a DELETE request to /parameter-providers/{providerId}/verification-requests/{requestId}.

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ParameterProvidersApi;


ParameterProvidersApi apiInstance = new ParameterProvidersApi();
VerifyConfigRequestEntity body = new VerifyConfigRequestEntity(); // VerifyConfigRequestEntity | The parameter provider configuration verification request.
String id = "id_example"; // String | The parameter provider id.
try {
    VerifyConfigRequestEntity result = apiInstance.submitConfigVerificationRequest1(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParameterProvidersApi#submitConfigVerificationRequest1");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)| The parameter provider configuration verification request. |
 **id** | **String**| The parameter provider id. |

### Return type

[**VerifyConfigRequestEntity**](VerifyConfigRequestEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="updateParameterProvider"></a>
# **updateParameterProvider**
> ParameterProviderEntity updateParameterProvider(body, id)

Updates a parameter provider

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ParameterProvidersApi;


ParameterProvidersApi apiInstance = new ParameterProvidersApi();
ParameterProviderEntity body = new ParameterProviderEntity(); // ParameterProviderEntity | The parameter provider configuration details.
String id = "id_example"; // String | The parameter provider id.
try {
    ParameterProviderEntity result = apiInstance.updateParameterProvider(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ParameterProvidersApi#updateParameterProvider");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ParameterProviderEntity**](ParameterProviderEntity.md)| The parameter provider configuration details. |
 **id** | **String**| The parameter provider id. |

### Return type

[**ParameterProviderEntity**](ParameterProviderEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

