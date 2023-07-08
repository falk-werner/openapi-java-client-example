# DefaultApi

All URIs are relative to *http://localhost:8080/greeter/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**greetGet**](DefaultApi.md#greetGet) | **GET** /greet |  |


<a id="greetGet"></a>
# **greetGet**
> String greetGet(whom)



Greeting service.

### Example
```java
// Import classes:
import org.example.ApiClient;
import org.example.ApiException;
import org.example.Configuration;
import org.example.models.*;
import org.example.greeter.DefaultApi;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    defaultClient.setBasePath("http://localhost:8080/greeter/v1");

    DefaultApi apiInstance = new DefaultApi(defaultClient);
    String whom = "Bob"; // String | Contains the name to greet.
    try {
      String result = apiInstance.greetGet(whom);
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling DefaultApi#greetGet");
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

