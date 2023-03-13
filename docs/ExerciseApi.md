# ExerciseApi

All URIs are relative to *https://api.krakenflex.systems/interview-tests-mock-api/v1*

Method | HTTP request | Description
------------- | ------------- | -------------
[**outagesGet**](ExerciseApi.md#outagesGet) | **GET** /outages | Returns all outages in our system.
[**siteInfoSiteIdGet**](ExerciseApi.md#siteInfoSiteIdGet) | **GET** /site-info/{siteId} | Returns information about a specific site.
[**siteOutagesSiteIdPost**](ExerciseApi.md#siteOutagesSiteIdPost) | **POST** /site-outages/{siteId} | Posts outages for a specific site with enhanced information.

<a name="outagesGet"></a>
# **outagesGet**
> Outages outagesGet()

Returns all outages in our system.

An outage is when a device can no longer provide service and is declared as offline. Each outage consists of a device ID, begin time, and end time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExerciseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExerciseApi apiInstance = new ExerciseApi();
try {
    Outages result = apiInstance.outagesGet();
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExerciseApi#outagesGet");
    e.printStackTrace();
}
```

### Parameters
This endpoint does not need any parameter.

### Return type

[**Outages**](Outages.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="siteInfoSiteIdGet"></a>
# **siteInfoSiteIdGet**
> SiteInfo siteInfoSiteIdGet(siteId)

Returns information about a specific site.

The site information contains the ID and name of the site. It also contains a list of devices that make up the site.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExerciseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExerciseApi apiInstance = new ExerciseApi();
String siteId = "siteId_example"; // String | Identifier for a site
try {
    SiteInfo result = apiInstance.siteInfoSiteIdGet(siteId);
    System.out.println(result);
} catch (ApiException e) {
    System.err.println("Exception when calling ExerciseApi#siteInfoSiteIdGet");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | [**String**](.md)| Identifier for a site |

### Return type

[**SiteInfo**](SiteInfo.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: application/json

<a name="siteOutagesSiteIdPost"></a>
# **siteOutagesSiteIdPost**
> siteOutagesSiteIdPost(siteId, body)

Posts outages for a specific site with enhanced information.

The outages posted should contain a device ID, device name, begin time, and end time.

### Example
```java
// Import classes:
//import io.swagger.client.ApiClient;
//import io.swagger.client.ApiException;
//import io.swagger.client.Configuration;
//import io.swagger.client.auth.*;
//import io.swagger.client.api.ExerciseApi;

ApiClient defaultClient = Configuration.getDefaultApiClient();

// Configure API key authorization: api_key
ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
api_key.setApiKey("YOUR API KEY");
// Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
//api_key.setApiKeyPrefix("Token");

ExerciseApi apiInstance = new ExerciseApi();
String siteId = "siteId_example"; // String | Identifier for a site
List<EnhancedOutagesInner> body = Arrays.asList(new EnhancedOutagesInner()); // List<EnhancedOutagesInner> | 
try {
    apiInstance.siteOutagesSiteIdPost(siteId, body);
} catch (ApiException e) {
    System.err.println("Exception when calling ExerciseApi#siteOutagesSiteIdPost");
    e.printStackTrace();
}
```

### Parameters

Name | Type | Description  | Notes
------------- | ------------- | ------------- | -------------
 **siteId** | [**String**](.md)| Identifier for a site |
 **body** | [**List&lt;EnhancedOutagesInner&gt;**](EnhancedOutagesInner.md)|  | [optional]

### Return type

null (empty response body)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

 - **Content-Type**: application/json
 - **Accept**: application/json

