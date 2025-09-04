# ProvenanceEventsApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getInputContent**](ProvenanceEventsApi.md#getInputContent) | **GET** /provenance-events/{id}/content/input | Gets the input content for a provenance event
[**getLatestProvenanceEvents**](ProvenanceEventsApi.md#getLatestProvenanceEvents) | **GET** /provenance-events/latest/{componentId} | Retrieves the latest cached Provenance Events for the specified component
[**getOutputContent**](ProvenanceEventsApi.md#getOutputContent) | **GET** /provenance-events/{id}/content/output | Gets the output content for a provenance event
[**getProvenanceEvent**](ProvenanceEventsApi.md#getProvenanceEvent) | **GET** /provenance-events/{id} | Gets a provenance event
[**submitReplay**](ProvenanceEventsApi.md#submitReplay) | **POST** /provenance-events/replays | Replays content from a provenance event
[**submitReplayLatestEvent**](ProvenanceEventsApi.md#submitReplayLatestEvent) | **POST** /provenance-events/latest/replays | Replays content from a provenance event

<a name="getInputContent"></a>
# **getInputContent**
> StreamingOutput getInputContent(id, range, clusterNodeId)

Gets the input content for a provenance event

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ProvenanceEventsApi;


ProvenanceEventsApi apiInstance = new ProvenanceEventsApi();
LongParameter id = new LongParameter(); // LongParameter | The provenance event id.
String range = "range_example"; // String | Range of bytes requested
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where the content exists if clustered.
try {
    StreamingOutput result = apiInstance.getInputContent(id, range, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvenanceEventsApi#getInputContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**LongParameter**](.md)| The provenance event id. |
 **range** | **String**| Range of bytes requested | [optional]
 **clusterNodeId** | **String**| The id of the node where the content exists if clustered. | [optional]

### Return type

[**StreamingOutput**](StreamingOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getLatestProvenanceEvents"></a>
# **getLatestProvenanceEvents**
> LatestProvenanceEventsEntity getLatestProvenanceEvents(componentId, limit)

Retrieves the latest cached Provenance Events for the specified component

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ProvenanceEventsApi;


ProvenanceEventsApi apiInstance = new ProvenanceEventsApi();
String componentId = "componentId_example"; // String | The ID of the component to retrieve the latest Provenance Events for.
Integer limit = 10; // Integer | The number of events to limit the response to. Defaults to 10.
try {
    LatestProvenanceEventsEntity result = apiInstance.getLatestProvenanceEvents(componentId, limit);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvenanceEventsApi#getLatestProvenanceEvents");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **componentId** | **String**| The ID of the component to retrieve the latest Provenance Events for. |
 **limit** | **Integer**| The number of events to limit the response to. Defaults to 10. | [optional] [default to 10]

### Return type

[**LatestProvenanceEventsEntity**](LatestProvenanceEventsEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="getOutputContent"></a>
# **getOutputContent**
> StreamingOutput getOutputContent(id, range, clusterNodeId)

Gets the output content for a provenance event

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ProvenanceEventsApi;


ProvenanceEventsApi apiInstance = new ProvenanceEventsApi();
LongParameter id = new LongParameter(); // LongParameter | The provenance event id.
String range = "range_example"; // String | Range of bytes requested
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where the content exists if clustered.
try {
    StreamingOutput result = apiInstance.getOutputContent(id, range, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvenanceEventsApi#getOutputContent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**LongParameter**](.md)| The provenance event id. |
 **range** | **String**| Range of bytes requested | [optional]
 **clusterNodeId** | **String**| The id of the node where the content exists if clustered. | [optional]

### Return type

[**StreamingOutput**](StreamingOutput.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: */*

<a name="getProvenanceEvent"></a>
# **getProvenanceEvent**
> ProvenanceEventEntity getProvenanceEvent(id, clusterNodeId)

Gets a provenance event

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ProvenanceEventsApi;


ProvenanceEventsApi apiInstance = new ProvenanceEventsApi();
LongParameter id = new LongParameter(); // LongParameter | The provenance event id.
String clusterNodeId = "clusterNodeId_example"; // String | The id of the node where this event exists if clustered.
try {
    ProvenanceEventEntity result = apiInstance.getProvenanceEvent(id, clusterNodeId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvenanceEventsApi#getProvenanceEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **id** | [**LongParameter**](.md)| The provenance event id. |
 **clusterNodeId** | **String**| The id of the node where this event exists if clustered. | [optional]

### Return type

[**ProvenanceEventEntity**](ProvenanceEventEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="submitReplay"></a>
# **submitReplay**
> ProvenanceEventEntity submitReplay(body)

Replays content from a provenance event

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ProvenanceEventsApi;


ProvenanceEventsApi apiInstance = new ProvenanceEventsApi();
SubmitReplayRequestEntity body = new SubmitReplayRequestEntity(); // SubmitReplayRequestEntity | The replay request.
try {
    ProvenanceEventEntity result = apiInstance.submitReplay(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvenanceEventsApi#submitReplay");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**SubmitReplayRequestEntity**](SubmitReplayRequestEntity.md)| The replay request. |

### Return type

[**ProvenanceEventEntity**](ProvenanceEventEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

<a name="submitReplayLatestEvent"></a>
# **submitReplayLatestEvent**
> ReplayLastEventResponseEntity submitReplayLatestEvent(body)

Replays content from a provenance event

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ProvenanceEventsApi;


ProvenanceEventsApi apiInstance = new ProvenanceEventsApi();
ReplayLastEventRequestEntity body = new ReplayLastEventRequestEntity(); // ReplayLastEventRequestEntity | The replay request.
try {
    ReplayLastEventResponseEntity result = apiInstance.submitReplayLatestEvent(body);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ProvenanceEventsApi#submitReplayLatestEvent");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **body** | [**ReplayLastEventRequestEntity**](ReplayLastEventRequestEntity.md)| The replay request. |

### Return type

[**ReplayLastEventResponseEntity**](ReplayLastEventResponseEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

