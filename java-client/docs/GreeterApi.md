# GreeterApi

All URIs are relative to *http://localhost:8080/greeter/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**greet**](GreeterApi.md#greet) | **GET** /greet |  |


<a id="greet"></a>
# **greet**
> String greet(whom)



Greeting service.

### Example
```java
// Import classes:
import org.example.ApiClient;
import org.example.ApiException;
import org.example.Configuration;
import org.example.models.*;
import org.example.greeter.GreeterApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/greeter/v1");

    GreeterApi apiInstance = new GreeterApi(defaultClient);
    String whom = "Bob"; // String | Contains the name to greet.
    try {
      String result = apiInstance.greet(whom);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling GreeterApi#greet");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

### Parameters

| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **whom** | **String**| Contains the name to greet. | [optional] |

### Return type

**String**

### Authorization

No authorization required

### HTTP request headers

 - **Content-Type**: Not defined
 - **Accept**: text/plain

### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Contains the greeting. |  -  |

