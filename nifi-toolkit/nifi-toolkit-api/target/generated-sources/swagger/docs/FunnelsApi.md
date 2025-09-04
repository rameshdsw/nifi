# FunnelsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getFunnel**](FunnelsApi.md#getFunnel) | **GET** /funnels/{id} | Gets a funnel
[**removeFunnel**](FunnelsApi.md#removeFunnel) | **DELETE** /funnels/{id} | Deletes a funnel
[**updateFunnel**](FunnelsApi.md#updateFunnel) | **PUT** /funnels/{id} | Updates a funnel

<a name="getFunnel"></a>
# **getFunnel**
> FunnelEntity getFunnel(id)

Gets a funnel

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FunnelsApi;


FunnelsApi apiInstance = new FunnelsApi();
String id = "id_example"; // String | The funnel id.
try {
    FunnelEntity result = apiInstance.getFunnel(id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FunnelsApi#getFunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The funnel id. |

### Return type

[**FunnelEntity**](FunnelEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="removeFunnel"></a>
# **removeFunnel**
> FunnelEntity removeFunnel(id, version, clientId, disconnectedNodeAcknowledged)

Deletes a funnel

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FunnelsApi;


FunnelsApi apiInstance = new FunnelsApi();
String id = "id_example"; // String | The funnel id.
LongParameter version = new LongParameter(); // LongParameter | The revision is used to verify the client is working with the latest version of the flow.
ClientIdParameter clientId = new ClientIdParameter(); // ClientIdParameter | If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response.
Boolean disconnectedNodeAcknowledged = false; // Boolean | Acknowledges that this node is disconnected to allow for mutable requests to proceed.
try {
    FunnelEntity result = apiInstance.removeFunnel(id, version, clientId, disconnectedNodeAcknowledged);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FunnelsApi#removeFunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | **String**| The funnel id. |
 **version** | [**LongParameter**](.md)| The revision is used to verify the client is working with the latest version of the flow. | [optional]
 **clientId** | [**ClientIdParameter**](.md)| If the client id is not specified, new one will be generated. This value (whether specified or generated) is included in the response. | [optional]
 **disconnectedNodeAcknowledged** | **Boolean**| Acknowledges that this node is disconnected to allow for mutable requests to proceed. | [optional] [default to false]

### Return type

[**FunnelEntity**](FunnelEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="updateFunnel"></a>
# **updateFunnel**
> FunnelEntity updateFunnel(body, id)

Updates a funnel

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.FunnelsApi;


FunnelsApi apiInstance = new FunnelsApi();
FunnelEntity body = new FunnelEntity(); // FunnelEntity | The funnel configuration details.
String id = "id_example"; // String | The funnel id.
try {
    FunnelEntity result = apiInstance.updateFunnel(body, id);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling FunnelsApi#updateFunnel");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**FunnelEntity**](FunnelEntity.md)| The funnel configuration details. |
 **id** | **String**| The funnel id. |

### Return type

[**FunnelEntity**](FunnelEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

