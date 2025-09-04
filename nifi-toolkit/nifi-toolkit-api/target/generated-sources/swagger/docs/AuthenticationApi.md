# AuthenticationApi

All URIs are relative to */*

Method | HTTP request | Description
------------- | ------------- | -------------
[**getAuthenticationConfiguration**](AuthenticationApi.md#getAuthenticationConfiguration) | **GET** /authentication/configuration | Retrieves the authentication configuration endpoint and status information

<a name="getAuthenticationConfiguration"></a>
# **getAuthenticationConfiguration**
> AuthenticationConfigurationEntity getAuthenticationConfiguration()

Retrieves the authentication configuration endpoint and status information

### Example
```java
// Import classes:
//import org.apache.nifi.api.toolkit.ApiException;
//import org.apache.nifi.api.toolkit.api.AuthenticationApi;


AuthenticationApi apiInstance = new AuthenticationApi();
try {
    AuthenticationConfigurationEntity result = apiInstance.getAuthenticationConfiguration();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling AuthenticationApi#getAuthenticationConfiguration");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**AuthenticationConfigurationEntity**](AuthenticationConfigurationEntity.md)

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

