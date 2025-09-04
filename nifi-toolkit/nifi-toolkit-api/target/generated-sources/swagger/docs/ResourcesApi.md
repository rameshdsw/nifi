# ResourcesApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getResources**](ResourcesApi.md#getResources) | **GET** /resources | Gets the available resources that support access/authorization policies

<a name="getResources"></a>
# **getResources**
> ResourcesEntity getResources()

Gets the available resources that support access/authorization policies

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.ResourcesApi;


ResourcesApi apiInstance = new ResourcesApi();
try {
    ResourcesEntity result = apiInstance.getResources();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ResourcesApi#getResources");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**ResourcesEntity**](ResourcesEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

